/* function yg sangat sederhana
    ==> satu baris
    ==> hanya butuh tanda sama dengan ( = )
 */

fun sample(a: Int): Int = a * 4

fun salam(name: String): Unit = println("assalamualaikum $name")

fun main() {
    val result = sample( a =  5)
    salam("caca")
    println(result)
}