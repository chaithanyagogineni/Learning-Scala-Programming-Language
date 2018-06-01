//Problem 27 in project euler
//Implemented in scala

def checkPrime(x:Int):Boolean={
for(i<- 2 to x/2)
{
if(x%i==0)
return false
}
return true
}

def getCount(a:Int,b:Int,k:Int):Int={

var temp=k
var exp=(temp*temp)+(a*temp)+b
var res=0
while(checkPrime(Math.abs(exp)))
{
res+=1
temp+=1
exp=(temp*temp)+(a*temp)+b
}
res
}
var k=0
var sub=0
var c=0
var sol=0
for(i<- -1000 to 1000)
{
for(j<- -1000 to 1000)
{
c=getCount(i,j,k)
if(sub<c)
{
sub=c
sol=i*j
}
}
}
println(sol)