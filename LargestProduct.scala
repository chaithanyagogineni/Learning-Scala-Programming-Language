import scala.io.Source
var filename: String ="C:\\Users\\User1\\Desktop\\Scala\\course era\\ProjectEuler\\src\\main\\scala\\problem8-input"
var input_string=""
//reading data to string
for(eachline<-Source.fromFile(filename).getLines)
  {
    input_string+=eachline.toString
  }



var result=0L;
//Iterate through all the possible 13 digits of string
for(i<-0 to 987)
  if(result<getLargestProduct(input_string.slice(i,i+13).toLong))
    result=getLargestProduct(input_string.slice(i,i+13).toLong)

print(result)

//Function to get the product of 13 digits
def getLargestProduct(number:java.lang.Long):java.lang.Long = {
  var k:java.lang.Long = number
  var sum:java.lang.Long = 1L
  var rem=0L
  while(k>0)
  {
    rem= k%10
    sum*=rem
    k/=10
  }
  return sum
}