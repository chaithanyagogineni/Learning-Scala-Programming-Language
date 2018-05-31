//Problem 30 in project euler
//Implemented in scala

def getFifthSum(x:Int):Double={
var k=x
var res=0.0
var rem=0
while(k>0)
{
rem=k%10
res+=(Math.pow(rem,5))
k=k/10
}
return res
}

var sum=0
var limit = (6*Math.pow(9,5)).toInt
for(i<- 10 until limit)
{
if(i==getFifthSum(i))
sum+=i
}
println(sum)