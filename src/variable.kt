    const  val APP = "belajar kotlin"
    const val VERSION = "0.0.1"
fun main() {
    // variable mempunyai 2: mutable (bisa diubah) "var" dan juga immutable (tidak bisa di ubah) "val"
    val firstname = "yanto"

    //    firstname = "babi", jika memakai "val" variable tidak bisa diubah tetapi berbeda dengan "var" dia bisa diubah
    val lastname = "jailani"

    // contoh "var" diubah, dia akan menggantikan variable sebelumnya menjadi variable yang baru
    var username = "yatno"
    username = "yanto"

    // nullable
    var Firstname: String? = "ratna"
    Firstname = null

    // eror karena Firstname bisa null
    // println(Firstname.length)

    // cara mengakses yang benar
    println(Firstname?.length)

    // variable constant harus diatas
    //    const  val APP = "belajar kotlin"
    //    const val VERSION = "0.0.1"


    println(firstname)
    println(lastname)
    println(username)
    println(Firstname)
    println("Welcome to $APP version $VERSION")
}