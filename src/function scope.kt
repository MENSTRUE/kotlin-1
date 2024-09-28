/*
    ==> Function scope adalah ruang lingkup dimana sebuah function bisa diakses
    ==> Saat kita membuat function di dalam file kotlin, maka secara otomatis function tersebut bisa diakses dari file kotlin manapun
    ==> Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu, maka kita bisa membuat function di dalam function

 */// beda dengan java pada kotlin bebas membuat function ta

fun awal(){
    fun kodepertama(){
        println("10101010101111")
    }
}

fun akhir(){
    fun kodepertama(){
        println("10101010101111")
    }
}

fun main() {
    fun kodepertama(){                  // jika function ada diluar function main tidak akan diproses jika diluar fun main
        println("10101010101111")
    }

    kodepertama()
}