
const val N = 3

fun main() {
    fun ml1D() = MutableList(N) { 0 }
    fun ml2D() = MutableList(N) { ml1D() }
    val mutList3D = MutableList(N) { ml2D() }
    println(mutList3D)
}