
//Problem 4 in Project Euler
//Find the largest palindrome made from the product of two 3-digit numbers.
//Scala Solution

def checkPalindrome(x:String):Boolean={
var reverse = x.reverse.toString
return reverse==x
}
var result=0
var temp =0
for(i<-100 to 1000)
{
for(j<-100 to 1000)
{
if(checkPalindrome((i*j).toString))
{
if((i*j)>temp)
result = i*j
temp = result
}
}
}
print(result)