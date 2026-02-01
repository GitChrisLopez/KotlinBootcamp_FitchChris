package Aquarium

import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation

@ImAPlant
class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true
    @set:OnSet
    var needsFood: Boolean = false
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections() {
    val classObj: KClass<Plant> = Plant::class

    // Prints all annotations on the class
    for (annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }

    // Finds a specific annotation
    val annotated: ImAPlant? = classObj.findAnnotation<ImAPlant>()

    annotated?.apply {
        println("Found a plant annotation!")
    }
}