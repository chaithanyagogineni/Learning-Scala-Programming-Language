//Problem 27 in project euler
//Implemented in scala

//Function to check whether a number is prime or not
def checkPrime(number:Int):Boolean={
  for(i<- 2 to number/2)
  {
    if(number%i==0)
      return false
  }
  return true
}

//Function to get count of quadratic equation with particular coefficients
def getCount(coeff1:Int,coeff2:Int,number:Int):Int={
  var temp=number
  var exp=(temp*temp)+(coeff1*temp)+coeff2
  var res=0
  while(checkPrime(Math.abs(exp)))
  {
    res+=1
    temp+=1
    exp=(temp*temp)+(coeff1*temp)+coeff2
  }
  res
}
var number=0
var prev_count=0
var count=0
var solution=0
//Check every possible combination of a and b for particular number
for(i<- -1000 to 1000)
{
  for(j<- -1000 to 1000)
  {
    count=getCount(i,j,number)
    if(prev_count<count)
    {
      prev_count=count
      solution=i*j
    }
  }
}
println(solution)