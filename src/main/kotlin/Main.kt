fun main(args: Array<String>) {

    //In-built functions
    var num: Int = 100
    println("Square root of number ${num} is ${Math.sqrt(num.toDouble())}")
    greet()
    val arr: Array<Int> = arrayOf(10,20,30,40)
  println("Sum: ${sum(arr)}")

    //Inline functions
    val add = {n1: Int, n2: Int -> n1 + n2}
    println("Add: ${add(20,35)}")

}

//User defined functions
fun greet(){
    println("Hello!, Good Day!")
}

//Parameterized functions with return types
 fun sum(numbers: Array<Int>): Int{

     var sum = 0
    numbers.forEach { num -> sum += num }
    return sum
 }



