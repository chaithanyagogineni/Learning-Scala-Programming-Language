//Problem 10 in project euler
//Implemented in scala

//Function to check a number is prime or not
def checkPrime(number:Double):Boolean={
  if(number==2)
    return true
  for(i<- 2 to Math.sqrt(number).toInt)
    if(number%i==0)
      return false
  return true
}

//Function to get sum of prime numbers below given limit
def getSumPrimes(limit:Int):BigInt={
  def helper(limit:Int,result:BigInt):BigInt={
    if(limit<2)
      return result
    if(checkPrime(limit)) {
      helper(limit - 1, result + limit)
    }
    else {
      helper(limit - 1, result)
    }

  }
  helper(limit,0)

}
 val limit=2000000
getSumPrimes(limit)
