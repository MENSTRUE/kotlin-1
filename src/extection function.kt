/*  ==> Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
    ==> extection function adalah salah satu fitur yang sangat powerfull, namun harap bijak menggunakannya, karena jika terlalu banyak digunakan, akan membuat program sulit dimengerti, karena terlihat seperti magic
    ==> Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya, lalu diikuti dengan tanda . (titik)
    ==> Untuk mengakses data nya di extension function, kita bisa menggunakan kata kunci "this"

 */

// nb : digunakan saat tedesak dan harus bijak dalam menggunakannya dan kalau ngga butuh butuh amat nggak usah dipake

fun String.welcome(): String {          //biasanya kita gunakan untuk tipe data yg bukan milik kita
    return "welcome miss.$this"         // digunakan ketika file tidak bisa dirubah rubah
}

fun String.print(): Unit = println("cogratulation for you $this")

fun main() {
    val name = "nisa"                   // emang harus val ?
//    val welcome: String = name.welcome()
    println(name.welcome())
    name.print()
}
