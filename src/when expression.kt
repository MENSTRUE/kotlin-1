fun main() {
    //when lebih simple dari pada "if", masih menggunakan else, tidak bisa menggunakan angka...

    val score = 'A'
    when (score) {
        'A'  -> println("good job")
        'B' -> println("good")
        'C' -> println("not bad")
        'D'  -> println("try again")
        else -> println("you have problem !")
    }

    when  (score) {
        'A', 'B', 'C' -> {
            println("lulus")
        }

        else -> {
            println("masf anda tidak lulus")
        }
    }

    //when expression in

    val exam = 'D'
    val syaratlulus = arrayOf('A','B','C')// untuk menyimpan data data
    when (exam) {
        in syaratlulus -> println("selamat anda lulus")
        !in syaratlulus-> println("maaf anda harus mengulang lagi tahun depan")
    }

    //when expression is

    val nama = "wafa"
    when (nama){
        is String -> println("nama anda terdaftarkan")
        !is String -> println("nama anda tidak terdaftarkan")
    }

    //when sebagai penggaanti if else --> lebih praktis (digunakan)

    val value = 18
    when {
        value > 80 -> println("good job")
        value >= 60 -> println("not bad")
        else -> println("please try again")
    }

}