fun main() {
    //array
    /*operasi
        size            = untuk mendapatkan panjang array
        get(index)      = mendapatkan data di posisi index
        [index]         = mendapatkan data di posisi index
        set(index,value)= mengubah data di posisi index
        [index] = value = mengubah data di posisi index
*/
    val members: Array<String> = arrayOf("tono, tini, tunu")
    val values: Array<Byte> = arrayOf(100, 90, 80)
    val balances: Array<Int> = arrayOf(10, 9, 5)

    members[0] = "yanto"
    println(members[0])
    println(values[1])
    println(balances[1])
}