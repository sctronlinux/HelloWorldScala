package hello
import java.util.{ Date, Locale }
import java.text.DateFormat
import java.text.DateFormat._

object LocalDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.ENGLISH)
    println(df format now) //==df.format(now) ...奇怪的语法 
    println(df.format(now))
  }
}