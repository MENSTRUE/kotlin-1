fun main() {

    val result = 10 / 2
    val result1 = 10*10
    val result2 = 10%3

    //augmented assigments
    /*  a = a + 10      =   a+= 10
        a = a - 10      =   a-= 10
        a = a * 10      =   a*= 10
        a = a / 10      =   a/= 10
        a = a % 10      =   a%= 10
*/

    var total: Int = 0

    val barang1 =200
    total += barang1

    val barang2 =300
    total +=barang2

    val barang3 =400
    total +=barang3

    total++
    total++
    total++
    total++
    total++
/*
    unary operator
    ++          =           a = a + 1
    --          =           a = a - 1
    -           =           negative
    +           =           positive
    !           =           bolean kebalikan
*/

    println(result)
    println(result1)
    println(result2)

    println(total)

}