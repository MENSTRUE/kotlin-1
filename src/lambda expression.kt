/*

==> Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
==> Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
==> Lambda expression secara sederhana adalah function yang tidak memiliki nama
==> Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
==> Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya

 */

/*fun main() {
//    // membuat lambda
    val lambdaName:(String) -> String = { value: String -> // lambda expression di variable
        value.toUpperCase()
    }

    // mengeksekusi lambda
    val name = lambdaName("siti")
    println(name)

    // membuat lambda
    val lambdaName: (String) -> String = {  //kode : it
        it.toUpperCase()
    }
    //mengeksekusi
    val name1 = lambdaName("hasan")
    println(name1)

}*/

fun toUpper(value : String): String = value.toUpperCase()
fun main() {
    val lambdaName: (String) -> String = ::toUpper
    val name2 = lambdaName("uje")       //method references
    println(name2)
}