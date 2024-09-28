fun main() {
    /*  Break digunakan untuk menghentikan seluruh perulangan
        Continue adalah digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya
     */
    var i = 0
    while (true){   //artinya tidak akan berhenti
        println("perulangan $i")
        i++
        if (i>10){ //jumlah pengulangan akan berhenti pada angka ....
            break
        }
    }

    for (i in 1..10){
        if (i % 2 == 0){ // untuk menaruh aturan, dikarenakan aturannya i dibagi 2 = 0 maka setiap bilangan genap tidak akan ditampilkan atau kelipatan 2
            continue
        }
        println("continue ke $i")
    }

}