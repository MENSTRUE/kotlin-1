fun main() {
    //looping digunakan untuk mengambil data dari array (for array)
    var array = arrayOf("yanto", "yanti",  "budiman") //fungsi koma untuk membedakan data satu sama lain


    var total = 0
    for (name in array){ //name tidak bisa dirubah
        println(name)
        total++
    }
    println("total perulangan = $total")

    //looping juga  bisa digunakan untuk mengambil data range

    for (value in 0..100){// untuk value langsung tampa menggunakan variable
        println(value)
    }

    for (value in 1000 downTo 0 step 5) {
        println(value)
    }

    val ukuranArray = array.size -1// untuk mengetahui ukuran suatu data array 
    for (i in 0..ukuranArray){
        println("index $i = ${array.get(i)}")
    }

}