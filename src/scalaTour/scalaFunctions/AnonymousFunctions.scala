package scalaTour.scalaFunctions

object AnonymousFunctions {
  //a method that requires a function as a parameter  
  //the function's type is (Int,Int) => Int  
  //e.g. maps from 2 Ints to an Int  
  def doWithOneAndTwo(f: (Int, Int) => Int) = {
    f(1, 2)
  }

  def main(args: Array[String]) {
    var mul = (x: Int, y: Int) => x * y
    println(mul(3, 4))
    

    //Explicit type declaration  
    val call1 = doWithOneAndTwo((x: Int, y: Int) => x + y)

    //The compiler expects 2 Ints so x and y types are inferred  
    val call2 = doWithOneAndTwo((x, y) => x + y)

    //Even more concise syntax  
    val call3 = doWithOneAndTwo(_ + _)

    println(call1, call2, call3)

  }
}