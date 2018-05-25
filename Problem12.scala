//Problem 12
//Implemented in scala
def getFactors(x:Int):Int={
var fact=0
var k = 1
while(k<=Math.sqrt(x))
{
if(x%k==0)
{
fact+=2
}
k+=1
}
if(Math.sqrt(x)*Math.sqrt(x)==x)
fact-=1
return fact
}
var start=1
var lvar = 1
while(getFactors(start)<500)
{
lvar+=1
start+=lvar
}
print(start)

