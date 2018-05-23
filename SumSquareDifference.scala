//Problem 6 in project euler
//scala solution
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


var square_of_sum = 0L
var sum_of_square = 0L
for(i<- 1 to 100)
{
square_of_sum+=i
sum_of_square+=(i*i)
}
print((square_of_sum*square_of_sum)-sum_of_square)