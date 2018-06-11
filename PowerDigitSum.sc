//Problem 16 in project Euler
//Implemented in scala


//Function that helps to return the sum of digits of number
def getSum(input:String):Int={
  def helper(input:String,index_to_slice:Int,result:Int):Int={
    if(index_to_slice==input.length)
      return result
    helper(input,index_to_slice+1,result+ input.slice(index_to_slice,index_to_slice+1).toInt)
  }
 helper(input,0,0)
}


//Function that helps to compute the power of a number
def getPower(number:Int,power:Int):BigInt={
  def helper(number:Int,power:Int,result:BigInt):BigInt={
    if(power==0)
      return result

    helper(number,power-1,result*number)
  }
  helper(number,power,1)
}
getSum(getPower(2,1000).toString())