//Problem 35 in project euler
//Implemented in scala


//Function to check whether number is prime or not
def checkPrime(number:Int):Boolean={
  for(i<- 2 to number/2)
  {
    if(number%i==0)
      return false
  }
  return true
}


//Function to return the number of digits of a number
def countDigits(number:Int):Int={
  var temp=number
  var count=0
  while(temp>0)
  {
    count+=1
    temp=temp/10
  }
  count-1
}

//Identify every possible value of given number by rotating it and check for prime
def getValue(number:Int):Int={
  var copy_number=""
  var copy_string:String="s"
  var temp:String =""
  var loop_variable=0
  copy_number=number.toString()
  while(loop_variable<countDigits(number))
  {
    copy_string=copy_number.slice(0,1)
    temp=copy_number.slice(1,copy_number.length)
    temp+=copy_string
    copy_number=temp
    if(!checkPrime(temp.toInt))
    {
      return 0
    }
    loop_variable+=1
  }
  return 1
}
var res=0
//Iterate through all numbers till 1 million and check for prime
for(loop<- 11 to 999999)
{
  if(checkPrime(loop))
    res+=getValue(loop)
}
//Since i didn't check 2,3,5,7.Adding 4 to result
println(res+4)