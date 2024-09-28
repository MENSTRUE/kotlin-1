/* function bisa menembalikan data

    => untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data kembalian dari function tersebut
    => Jika function tersebut kita deklarasikan dengan tipe data pengembalian, maka wajib di dalam function nya kita harus mengembalikan data
    => Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya

 */

fun harga(a:Int, b:Int): Int{
    val total = a + b       // aturannya atau perintahnya
    return total            // wajib return
}

fun main() {
    println(harga(100_000, 60_000))
    println(harga(100_000, 400_000))

    val result = harga(100_000, 90_000)     // bisa karena menggunakan function "harga"
    println(result)
}