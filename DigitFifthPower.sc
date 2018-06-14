//Problem 30 in project euler
//Implemented in scala


//Function to get the Sum of fifth digit powers of a number
def getFifthSum(x:Int):Double={
  def helper(k:Int,result:Double):Double={
    if(k<=0)
      return result
    else
      return helper(k/10,result+Math.pow(k%10,5))
  }
  helper(x,0.0)
}

var digit_fifth_powers=0
//Identify the limit ,since the maximum number is 9 try finding maximum value with it
val limit = (6*Math.pow(9,5)).toInt
for(i<- 10 until limit)
{
  if(i==getFifthSum(i))
    digit_fifth_powers+=i
}
//Printing the result
println(digit_fifth_powers)