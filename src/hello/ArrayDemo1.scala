package hello

object ArrayDemo1 {
  //var a:Array[Int]={1;2;3;4;5;6;7;8;9}
  /**
   * 使用while
   */
  def ergodic1(array: Array[Int]) {
    println("ergodic1 run!")
    var i = 0
    while (i < array.length) {
      println(array(i))
      i += 1 //scala里面无法使用i++或者++i,只能使用i+=1或者i=i+1
    }
  }
  
  /**
   * 使用java5里面的foreach
   */
  def ergodic2(array: Array[Int]) {
    println("ergodic2 run!")
    array.foreach(value => println(value)) //其实是一个匿名方法
    //或者这样:array.foreach((value:Int)=>println(value))
  }
  
  /**
   * 使用foreach的精简版本...........
   */
  def ergodic3(array: Array[Int]) {
    println("ergodic3 run!")
    array.foreach(println) //好简洁的写法
  }
  
  /**
   * 使用for循环试试
   */
  def ergodic4(array: Array[Int]) {
    println("ergodic4 run!")
    for (arg <- array) //for 循环的写法
    {
      println(arg)
    }
  }
  
  def main(args: Array[String]) {
    var array = new Array[Int](3)
    array(0) = 1
    array(1) = 2
    array(2) = 3
    ergodic1(array)
    ergodic2(array)
    ergodic3(array)
    ergodic4(array)
  }
}