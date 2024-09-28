/*  => Recursive function adalah salah satu kemampuan bagus di Kotlin, namun sayangnya ada keterbatasan dalam penggunaan recursive
    => Jika recursive function yang kita buat, saat dijalankan memanggil function dirinya sendiri terlalu dalam, maka bisa dimungkinkan akan terjadi error stack overflow
*/

/*
==> stack overflow
-> factorial(5)
-> factorial(5) => 5 * factorial(4)
-> factorial(5) => 5 * factorial(4) => 4 * factorial(3)
-> factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2)
-> factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1)
-> factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1) => 1

*/

/*
==> tail recursive function

-> Permasalahan ini di bahasa pemrograman Java tidak bisa ditangani
-> Namun di Kotlin, masalah ini ada solusinya, yaitu dengan menggunakan tail recursive function
-> Tail recursive function adalah teknik mengubah recursive function yang kita buat, menjadi looping biasa ketika dijalankan
-> Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive function, ada syarat-syarat nya
 */

/*
==> syarat tail recursive function
-> Tambahkan tailrec di functionnya
-> Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa embel-embel operasi dengan data lain
 */

/*
==> tail recursive factorial
factorialTail(5, 1)
factorialTail(4, 5)
factorialTail(3, 20)
factorialTail(2, 60)
factorialTail(1, 120)
120

 */

fun main() { //tail recursive function
    tailrec fun display(value : Int) {
        println(value)
        if (value > 0) {
            display(value -1)
        }
    }
    println(display(10))

    tailrec fun factorialTail(value: Int, total: Int = 1): Int { //tail recursive factorial function
        return when (value) {
            1 -> total
            else -> factorialTail( value -1, total*value)
        }
    }
    println(factorialTail(10))
}
