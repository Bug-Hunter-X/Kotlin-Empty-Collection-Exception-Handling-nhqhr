fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    // Safe way to handle potential empty list
    val firstDoubled = doubledList.getOrElse(0) { 0 } // Returns 0 if the list is empty
    println(firstDoubled)

    val anotherList: List<Int> = emptyList()
    val firstOfAnotherList = anotherList.getOrElse(0){0}
    println(firstOfAnotherList) 

    //Alternative using safe call and elvis operator
    val firstDoubled2 = doubledList.firstOrNull() ?: 0
    println(firstDoubled2)
    val firstOfAnotherList2 = anotherList.firstOrNull() ?: 0
    println(firstOfAnotherList2)
}