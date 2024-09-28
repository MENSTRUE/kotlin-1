/* jika kita menambahan parameter di function, maka ketika memanggil function tersebut, kita wajib memasukan data ke parameter*/

// parameter bersifat val

fun data (name: String, saldo: Number) {
    println("selamat datang $name")
//    println("apakah ada yang bisa bantu $name ?")
    if ( saldo == 400_000) {
        println("selamat $name transaksi anda berhasil sebesar $saldo")
    }else{
        println("maaf $name, saldo yg anda miliki tidak bisa untuk melakukan transaksi")
    }
}

fun main() {
    data("zahra", 300_000)
}
// jika ingin menggunakan type data number diharuskan tidak menggunakan ("")