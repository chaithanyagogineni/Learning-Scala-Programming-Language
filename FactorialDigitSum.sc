//problem 20 in project euler
//implemented in scala

//Function that helps to return the sum of digits of number
def getSum(input:String):Int={
  def helper(input:String,index_to_slice:Int,result:Int):Int={
    if(index_to_slice==input.length)
      return result
    helper(input,index_to_slice+1,result+ input.slice(index_to_slice,index_to_slice+1).toInt)
  }
  helper(input,0,0)
}


//Function that helps to return the factorial of number
def getFactorial(number:Int):BigInt={
  def helper(number:Int,result:BigInt):BigInt={
    if(number==1)
      return result
    helper(number-1,result*number)
  }
  helper(number,1)
}

getSum(getFactorial(100).toString())