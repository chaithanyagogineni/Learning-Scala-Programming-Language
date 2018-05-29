//Problem 19 in scala 
//Implemented in scala

def checkLeapYear(x:Int):Boolean = {
if(x%4 == 0)
{
if(x%100==0)
{
if(x%400 == 0)
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
//print(checkLeapYear(4000))
def getDays(x:Int):Int={
if(checkLeapYear(x))
return 366
else
return 365
}
var x=6
while(x<=365)
{
x+=7
}
var firstDay = 0
var first_Sunday=x-7
var days_month_year:Array[Int] = Array(31,28,31,30,31,30,31,31,30,31,30,31)
var days_month_Lyear:Array[Int] = Array(31,29,31,30,31,30,31,31,30,31,30,31)
var res=0
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
res+=1
}
cur_year+=1
}
print(res)