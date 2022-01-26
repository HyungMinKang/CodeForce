import kotlin.math.max

fun main(){

    var cnt= readLine()!!.toInt()
    var numArray= Array<Int>(cnt){0}
    var nums= readLine()!!.split(" ").map{it.toInt()}
    for(i in 0 until  cnt){
        numArray[i]=nums[i]
    }
    var result=0
    var i=0

    while(i<cnt){
        var j=i
        while(j<cnt-1 &&numArray[j+1]<=2*numArray[j] ){
            j++
        }
        result= max(result, j-i+1)
        i= j+1

    }
    println(result)

}
