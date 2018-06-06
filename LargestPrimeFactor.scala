//Problem 3
//What is the largest prime factor of the number 600851475143 ?
//Implemented in scala

//function to check whether number is prime or not
def checkPrime(number:Double):Boolean={
  if(number==2)
    return true
  for(i<- 2 to Math.sqrt(number).toInt)
    if(number%i==0)
      return false
  return true
}


//Function to check largest prime factor
def getLargePrimeFactor(number:Double):Int={
  def helper(number:Double,result:Int):Int={
    if(checkPrime(result)&&(number%result==0))
      result
    else
      helper(number,result-1)
  }
  helper(number,Math.sqrt(number).toInt)
}
val given_number= 600851475143.0
getLargePrimeFactor(given_number)