/*
    ==> Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs.
    ==> Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
    ==> Apa bedanya dengan parameter biasa dengan tipe data Array?
        => Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
        => JIka parameter menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu, cukup gunakan tanda koma
 */

fun totalPerhitungan(values: Array<Int>): Int {        // untuk vararg sendiri di taruh pada akhir pengkodingan dan values: Int
    var total = 0

    for (value in values){
        total += value              // perintah

    }

    return total;
}

fun main() {
    val values = arrayOf(20, 20, 10, 10, 70)        //saat menggunakan vararg bagian sinitidak dibutuhkan
    val result = totalPerhitungan(values)           //langsung masukan values

    println(result)
}