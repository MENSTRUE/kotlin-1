fun main() {
    /* simbol operasi boolean
        &&          =       dan         ==> true + true = true (selainnya false)
        ||          =       atau        ==> semua nilai akan true jika salah satu ada true
        !           =       tidak       ==> berkebalikan
*/

    val finalExam = 80
    val attendant = 75
    val extra     = 90
    val respect   = 20

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80

    val passExtra   = extra >= 90
    val passRespect = respect >= 90

//    val pass = passFinalExam && passAttendant
//    val dailypass = passExtra || passRespect

    val pass    = ((passFinalExam && passAttendant) && (passRespect || passExtra))

    println(pass)
//    println(dailypass)

}
