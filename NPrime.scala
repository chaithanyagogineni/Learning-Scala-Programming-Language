//Problem 7 in project euler
//implemented in scala

//Function to check whether a number is prime or not
def checkPrime(number:Double):Boolean={
  if(number==2)
    return true
  for(i<- 2 to Math.sqrt(number).toInt)
    if(number%i==0)
      return false
  return true
}

//Get the 10001st prime number
def getNPrime(number:Int):BigInt={
  def helper(number:Int,result:BigInt):BigInt={
    if(result==10001)
      number-1
    else if(checkPrime(number))
      helper(number+1,result+1)
    else
      helper(number+1,result)
  }
  helper(number,1)
}
//started to count prime number from 3
getNPrime(3)