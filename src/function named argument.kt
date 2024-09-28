// masih sama seperti parameter
/* dalam function named argument, kita tidak mewajibkan memasukan data secara urut yang sama dengan data parameter
    akan tetapi kita bisa memasukan nama data yg dimasukan ke parameter
 */

fun data(name: String, clas: String, region: String ){
    println("selamat $name!, dari kelas $clas dari $region, anda memenangkan perlombaan dengan mendapatkan juara 1 pada lomba mengarang cerita ")
}

fun main() {
    data(name = "annisa",
         region = "tegal", // disini tidak urut tapi bisa di run, dikarenakan kita menyebutkan parameternya
         clas = "akutansi")
}