

//the sum of all the multiples of 3 or 5 below 1000.
//Scala Soultion

def getMultipleSum(x:Int):Int={
  def helper(x:Int,sum:Int):Int={
    if(x>=1000)
      sum
    else if(x%3==0||x%5==0)
      helper(x+1,sum+x)
    else
      helper(x+1,sum)
  }
  helper(x,0)
}
getMultipleSum(1)