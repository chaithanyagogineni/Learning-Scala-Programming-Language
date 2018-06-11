//Problem 18 in Project Euler
//Implemented in scala

import scala.io.Source
var filename="C:\\Users\\User1\\Desktop\\Scala\\course era\\ProjectEuler\\src\\main\\scala\\MaximumPath-input"

var temp =0
var loop_variable=0
var num_lines=0
for(each_line <-Source.fromFile(filename).getLines){
  num_lines+=1
}
//Since there are 15 lines,make a 2 dimensional array of size 15
var input=Array.ofDim[Int](15,15)

for(line<-Source.fromFile(filename).getLines){
  //Creating array of strings by splitting each line by space
  val line_parsed = line.split(" +")
  //convert the array of strings to array of ints
  val line_parsed_int: Array[Int] = new Array[Int](line_parsed.length)
  //println("length of array is"+a.length)
  for(i<-line_parsed.indices)
  {
    line_parsed_int(i)=line_parsed(i).toInt
    //println(x(i).toInt)
  }
  //send the above array of integers to above created input array
  input(loop_variable)=line_parsed_int
  loop_variable+=1
}
//Compute the maximum elements from bottom to top
for(i<- (0 to input(loop_variable-1).length-2).reverse)
{
  for(j<- 0 to i)
  {
    input(i)(j)+=Math.max(input(i+1)(j),input(i+1)(j+1))
  }
}
//Since the maximum value will be stored in first row first element.Print it
println(input(0)(0))