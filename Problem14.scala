//Problem 14
//Implemented in scala
//Which starting number, under one million, produces the longest chain?

def numTerms(k:BigInt,res:BigInt):BigInt ={
if(k==1)
{
return res
}
if(k%2==0)
{
return numTerms(k/2,res+1)
}
else
{
return numTerms((3*k)+1,res+1)
}
}
var x:BigInt = 1
var cur_res:BigInt = 0
var temp:BigInt = 0
var k:BigInt=0
while(x<=1000000)
{
temp=numTerms(x,0)
if(cur_res<temp)
{
cur_res=temp
k=x
}
x+=1
}
print(k)