
//Problem 5 in Project Euler
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//Written in scala

import scala.util.control.Breaks._
var sum=2520
def checkDivisibility(x:Long):Boolean={
for(i<- 11 to 20)
if(x%i!=0)
return false
return true
}
breakable
{
while(true)
{
if(checkDivisibility(sum))
break
sum+=2520
}
}
print(sum)