//Problem 19 in Project Euler
//Implemented in scala

//Function to check whether given year is Leap Year or not
def checkLeapYear(year:Int):Boolean = {
  if(year%4 == 0)
  {
    if(year%100==0)
    {
      if(year%400 == 0)
        return true
      else
        return false
    }
    else
    {
      return true
    }
  }
  else
  {
    return false
  }
}
//Function to get Number of days in year
def getDays(year:Int):Int={
  if(checkLeapYear(year))
    return 366
  else
    return 365
}
//Since current sunday in 1900 was on 6th,find the first sunday in 1901
var cur_sunday_date=6
while(cur_sunday_date<=365)
{
  cur_sunday_date+=7
}
var firstDay = 0
var first_Sunday=cur_sunday_date-7
var days_month_year:Array[Int] = Array(31,28,31,30,31,30,31,31,30,31,30,31)
var days_month_Lyear:Array[Int] = Array(31,29,31,30,31,30,31,31,30,31,30,31)
var no_of_sundays_first_date=0
var cur_year=1901
while(cur_year<2000)
{
  for(i<-0 to 11)
  {
    if(checkLeapYear(cur_year))
      firstDay+=days_month_Lyear(i)
    else
      firstDay+=days_month_year(i)
    first_Sunday+=21
    if((firstDay-first_Sunday)%7==0)
      no_of_sundays_first_date+=1
  }
  cur_year+=1
}
print(no_of_sundays_first_date)