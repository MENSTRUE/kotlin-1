import javax.xml.transform.Transformer

/*
Higher-Order Functions
==> Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function
==> Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang general dan ingin mendapatkan input yang flexible beruba lambda, yang bisa dideklarasikan oleh si user ketika memanggil function tersebut

 */

fun hello(value: String, transformer: (String) -> String ): String{
    return "hello ${transformer(value)}";
}

fun main() {
    val upperTransformer = { value: String -> value.toUpperCase()}
    val lowerTransformer = {value: String -> value.toUpperCase()}
    println(hello("yanti", upperTransformer))
    println(hello("yanti", lowerTransformer))

    val result1 = hello("yanti") {  value: String -> value.toUpperCase()}
    val result2 = hello("yanti") { value: String -> value.toUpperCase()}
    println(result1)
    println(result2)
}
