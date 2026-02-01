package Aquarium

fun labels() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i > j) break@loop
        }
    }
}