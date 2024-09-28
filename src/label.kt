/*
==> Label adalah penanda
==> Semua expression di Kotlin bisa ditandai dengan label
==> Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @

 */

//fun main() {
//loopI@ for (i in 1..10){
//loopJ@    for (j in 1..10){
//        println("$i*$j = ${i * j}")
//    }
//}
//}

// kegunaan label
/*
==> Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
==> Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada, namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti

 */

fun labelbreak() {
    loopI@ for (i in 1..10){
        loopJ@    for (j in 1..10){
            if (i > 5){
                break@loopI
            }
            println("$i*$j = ${i * j}")
//            if (i > 5){
//                break@loopI
//            } penempatan yg salah tapi bisa di run
        }
    }
}

fun labelcontinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue
            }
            println("$i*$j = ${i * j}")
        }
    }
}

fun test(name: String, params: (String) -> Unit): Unit = params(name)
fun main() {
    test("eko") test@{
        if (it == "") {
            return@test
        } else {
            println("eko")
        }
    }
}

// digunakan saat terdesak saja