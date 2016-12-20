package hello

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object LocalDate {
  def main(args: Array[String]) {
    val now = new java.util.Date
    val df = getDateInstance(LONG, Locale.CHINESE)
    println(df format now)
    println(df.format(now))
  }
}