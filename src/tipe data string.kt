fun main() {
    var username: String = "syaefurokhman"
    var nickname: String = "menstrue"
    var massage: String = """
    selamat anda mendapatkan
sejumlah uang tunai dengan jumlah 10 jt rupiah
akan tetapi saya berbohong
    """
// jika mau rapi
    var katakata: String = """
        janganlah kamu percaya kepada orang
        ,sesungguhnya bila kamu percaya kepada selain allah 
        ,maka kamu orang yang tersesat
    """.trimIndent()

    // dihgunakan untuk menambahkan data atau menggabungkan data disuatu data
    var fullname: String = username + " " + nickname

    // string template "$" tampa "+" langsung dikasih spasi
    var fullname1: String = "$username $nickname"

    // menggunakan "desc" ketika ingin mengukur string
    var desc: String = "$fullname length ${fullname.length}"

    println(username)
    println(nickname)
    println(massage)
    println(katakata)
    println()
    println(fullname)
    println(fullname1)
    println(desc)
}