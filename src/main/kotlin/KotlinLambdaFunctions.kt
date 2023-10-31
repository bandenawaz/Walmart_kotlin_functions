fun main(){

    val sum = {num1: Int, num2: Int -> num1 + num2}
    println(sum(10,20))

    //lets call hof function
    hof("Walmart",::demo)
}

//HigherOrder functions
fun demo(str: String){
    println(str)
}

fun hof(str: String, myFun:(String) -> Unit){

    println("Welcome to Higher Order Functions")
    myFun(str)

}