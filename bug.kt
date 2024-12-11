fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    // This will cause an exception if the list is empty
    val firstDoubled = doubledList.first()
    println(firstDoubled)
}