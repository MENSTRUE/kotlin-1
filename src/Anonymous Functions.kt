/*
==> Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
==> Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
==> Untuk hal ini, kita bisa menggunakan Anonymous Function
==> Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci func

 */

fun main() {
    val anonymousUpper = fun(value : String): String {
        if (value.isBlank()){
            return "Ups"
        }
            return value.toUpperCase()
    }
    val result1= hello("yanti",anonymousUpper)
    println(result1)
// contoh 2
    val result2 = hello("yanto", fun(value: String): String{ // variable hello dari higher order function
        if (value.isBlank()){
            return "Ups"
        }
        return value.toLowerCase()
    })
    println(result2)

}
