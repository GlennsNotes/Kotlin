fun main(args: Array<String>) {
    println("Hello World!")
    val numbers = arrayOf(1, 2, 3)
    val divider: Int = 0
    val no: Int
    try {
        println("numbers[4] = ${numbers[4]}") // ArrayIndexOutOfBoundsException
        println(10 / divider) // ArithmeticException (divide by zero)
        no = readln().toInt() // possible NumberFormatException
        println("Your number is $no")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Array index error: $e")
    } catch (e: ArithmeticException) {
        println("divide by zero: $e")
    } catch (e: NumberFormatException) {
        Page 3 of 4
        println("Incorrect Input. Int is expected: $e")
    } finally {
        println("Finally always executes...")
    }
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}