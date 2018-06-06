//Sum of even valued terms in a fibonacci series with start value as 1

//Scala Solution

//Function to get the fibonacci series of number
def getFibonacci(number:Int):Int={
  if(number==1)
    1
  else if(number==2)
    2
  else
    getFibonacci(number-1)+getFibonacci(number-2)
}
//function to compute the sum of fibonacci series
def getSum(number:Int):Int={
  def helper(number:Int,sum:Int):Int={
    if(getFibonacci(number)>=4000000)
      sum
    else if(getFibonacci(number)%2==0)
      helper(number+1,sum+getFibonacci(number))
    else
      helper(number+1,sum)
  }
  helper(number,0)
}
getSum(1)