package scalaTutorials.patternMatching

object MatchTest2 extends App {
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
  }
  println(matchTest("two"))
  println(matchTest(10))
}