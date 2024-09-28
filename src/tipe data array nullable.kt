fun main() {
    // ketika array bernilai "null"
        val names: Array<String?> = arrayOfNulls(size = 3)
        names.set(0, "null")
        names.set(1, "yanto")
        names.set(2, "yanti")

    println(names[1])
}