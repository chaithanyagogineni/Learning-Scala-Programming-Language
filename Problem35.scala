//Problem 35 in project euler
//Implemented in scala
import scala.util.control.Breaks._
def checkPrime(x:Int):Boolean={
for(i<- 2 to x/2)
{
if(x%i==0)
return false
}
return true
}

def countDigits(x:Int):Int={
var k=x
var count=0
while(k>0)
{
count+=1
k=k/10
}
count-1
}

def getValue(x:Int):Int={
var k=""
var c:String="s"
var temp:String =""
var i=0
k=x.toString()
while(i<countDigits(x))
{
c=k.slice(0,1)
temp=k.slice(1,k.length)
temp+=c
k=temp
if(!checkPrime(temp.toInt))
{
return 0
}
i+=1
}
return 1
}
var res=0
for(loop<- 11 to 999999)
{
if(checkPrime(loop))
res+=getValue(loop)
}
//Since i didn't check 2,3,5,7.Adding 4 to result
println(res+4)