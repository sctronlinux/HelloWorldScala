package hello

class OrdDate(y: Int, m: Int, d: Int) extends Ord {
  def year = y
  def month = m
  def day = d
  override def toString(): String = year + "-" + month + "-" + day
  override def equals(that: Any): Boolean =
    that.isInstanceOf[OrdDate] && {
      val o = that.asInstanceOf[OrdDate]
      o.day == day && o.month == month && o.year == year
    }
  
  def <(that: Any): Boolean = {
    if (!that.isInstanceOf[OrdDate])
      error("cannot compare " + that + " and a Date")
    val o = that.asInstanceOf[OrdDate]
    (year < o.year) ||
    (year == o.year && (month < o.month ||
                       (month == o.month && day < o.day)))
  }
  
}