//Problem 21 in scala
//Implemented in scala

def getFactorsSum(x:Int):Int={
var sum=0
for(i<- 1 to x/2)
{
if(x%i==0)
sum+=i
}
sum
}
var s = 0
for(i<- 2 to 10000)
{
var temp=getFactorsSum(i)
if(temp>i&&temp<=10000)
{
var q = getFactorsSum(temp)
if(q==i)
s+=i+temp
}
}
println(s)