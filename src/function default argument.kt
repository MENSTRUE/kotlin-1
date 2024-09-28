/* beda dengan function parameter ketika memasukan tipe data 2 dan cuman 1 yg keisi maka pada function parameter akan eror justru sebaliknya
    pada function default argument bisa, ketika data kedua kosong atau tidak ada, dan juga tidak wajib mengisinnya
 */

fun data(name: String, clas: String = "...."){
    println("selamat datang $name, dari kelas $clas")
}

//nilai default dilambangkan  (= "")s

fun main() {
    data("pika", "akutansi")
    data("wafa", "teknik")
    data("surisno")
}