 def solution(target:Int):Int= {
   var coins = Array(1, 2, 5, 10, 20, 50, 100, 200)

   var table = new Array[Int](target+1)
   table(0)=1
   for(i<- 0 to coins.length-1) {
     for (j <- coins(i) to target) {
       table(j) =table(j)+ table(j - coins(i))
     }
   }
  return table(target)

 }
 solution(200)
