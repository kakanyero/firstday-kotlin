fun main() {
    val grade = readLine()?.toDouble()
    if (grade != null) {
        if (grade >= 4.5) {
            println("YOU ARE IN FIRST CLASS")
        } else if (grade >= 4.0) {
            println("YOU ARE IN SECOND CLASS UPPER")
        } else if (grade >= 3.5) {
            println("YOU ARE IN SECOND CLASS LOWER")
        } else if (grade >= 2.0) {
            println("YOU HAVE A GENTLEMAN'S PASS")
        } else {
            println("YOU HAVE FAILED")
        }
    } else {
        println("INVALID INPUT")
    }
}
