package subtask6

class Fibonacci {
    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var sum=0
        val res = mutableListOf(0, 1)
        while (res[0] * res[1] < n) {
            sum = res[0] + res[1]
            res[0] = res[1]
            res[1] = sum
        }
        if (res[0] * res[1] > n) res.add(0)
        else res.add(1)
        return res.toIntArray()

        throw NotImplementedError("Not implemented")
    }
}

