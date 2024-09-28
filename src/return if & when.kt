/*Kadang salam sebuah function, kita sering menggunakan If expression atau when expression, lalu di dalam blok nya kita mengembalikan nilai untuk sebuah function
Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when
*/
//fun main() {
//    fun contoh (name: String = ""): String {
//        return if (name == ""){     // digunakan ketika banyak if else
//            "contoh tulisan"
//        }else{
//            "hello $name"
//        }
//    }
//    println( contoh("bro"))   // perlu diingat string tinggal memasukan petik 2 ""
//    println(contoh("guys"))
//}
// when

fun main() {
    fun contoh1(name1: String = ""): String {
        when(name1){
            "" -> return "hello guys"
            else -> return "hello $name1"
        }
    }
    println(contoh1("harun"))
    print(contoh1())
}