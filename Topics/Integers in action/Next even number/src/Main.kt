fun main() {
    val n = readLine()!!.toInt() + 1
    println(if (n % 2 == 0) n else n + 1)
}