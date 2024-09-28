fun main() {
    /*
    While adalah salah satu perulangan yang sangat flexible,
     dimana kode while akan melakukan pengecekan kondisi,
      jika kondisi bernilai true, maka dia akan menjalankan blok while,
       dan terus diulangi sampai kondisi while bernilai false dan juga sebaliknya.

     */
    //while mirip dengan if cuman dia akan mengulang terus sampai true atau false

    var i = 0

    while (i > 10){// kalau bisa harus bernilai false agar perulangan sampai true
    println("perulangan $i")
    i++
    }

    println("selesai perulangan")// code eksekusi setelah perulangan selesai

}
