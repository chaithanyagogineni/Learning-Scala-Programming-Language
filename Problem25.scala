//Problem 25 in project euler
//Implemented in scala
def getLimit():BigInt={
var x:BigInt=1
for(i<- 0 to 998)
x*=10
return x
}
var a:BigInt = 1
var b:BigInt =1
var c:BigInt=a+b
var k:BigInt = getLimit()
var res=3
while(c<=k)
{
a=b
b=c
c=a+b
res+=1
}
print(res)