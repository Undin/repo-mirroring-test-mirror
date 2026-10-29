import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking

fun sumOfSquares(numbers: List<Int>): Int = runBlocking {
    numbers.map { async { it * it } }.awaitAll().sum()
}

fun main() {
    println("Sum of squares: ${sumOfSquares(listOf(1, 2, 3))}")
}
