fun main() {
    //range
    /* operasi range
        count()             = mendapatkan total data di range
        contains(value)     = mengecek apakah terdapat value tersebut
        first               = mendapatkan nilai pertama
        last                = mendapatkan nilai terakhir
        step                = mendapatkan nilai tiap kenaikan
        downto              =

    */

    val range =100 downTo 1 step 2


    println(range.count())
    println(range.contains(100))
    println(range.contains(150))
    println(range.first)
    println(range.last)
    println(range.step)
}