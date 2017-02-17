package prob19

object Prob19 extends App {

  val monthDays = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

  def countDays(month: Int, year: Int) : Int = {
    if (month == 2) {
      if (year % 4 == 0) { // leap
        return if (year == 2000) 28 else 29
      }
    }
    monthDays(month-1)
  }

  var count = 0
  var weekDay = 0

  for(year <- 1901 to 2000;
      month <- 1 to 12;
      day <- 1 to countDays(month, year)) {
        weekDay = (weekDay + 1) % 7
        if (weekDay == 6 && day == 1) {
          println("Sunday 1, " + month + "/ " + year)
          count += 1
        }
  }

  println(count)
}



