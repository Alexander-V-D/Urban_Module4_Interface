fun main() {

}

//Функция для задачи 2
fun getLargestCommonDivisor(a: Int, b: Int): Int {
    var first = a
    var second = b
    var divisor = 1
    if (first == second) return first
    while (first != 0 && second != 0) {
        if (first > second) {
            first %= second
            if (first == 0) return divisor
            divisor = first
        } else {
            second %= first
            if (second == 0) return divisor
            divisor = second
        }
    }
    return divisor
}

//Функция для задачи 3
//Возвращает 0 если массив пуст или содежит одно число
fun getSecondLargestFromArray(array: Array<Int>): Int {
    if (array.isEmpty()) return 0
    if (array.size == 1) return 0
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    array.forEach { if (largest < it) largest = it }
    array.forEach { if (secondLargest < it && it != largest) secondLargest = it}
    if (secondLargest == Int.MIN_VALUE) secondLargest = array[0]
    return secondLargest
}