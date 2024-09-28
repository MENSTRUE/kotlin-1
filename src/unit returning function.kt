/* function memiliki 2 jenis =
    => tidak bisa mengembalikan nilai
    => mengembalikan nilai

    pada function default argument, named argument dan juga parameter merupakan function yang tidak mengembalikan nilai,
        dan juga mengengembalikan tipe data unit, yg dimana unit adalah tanda bahwa function tersebut tidak mengembalikan apa apa

    penulisan unit adalah tidak wajib, namun jika kita menulis tipe data pengembalian sebuah function,
        maka secara otomatis dia adalah unit

 */

fun hello(name: String?): Unit { //nama functin tiap file harus beda
    if (name == null) {
        println("hello brother")
    } else {
        println("hello $name")
    }
}

fun main() {
    hello(name = "ara")
    hello(null) // dilarang kosong
}