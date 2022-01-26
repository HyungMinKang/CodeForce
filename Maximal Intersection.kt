import kotlin.math.max

fun main(){

    var n = readLine()!!.toInt()
    var s = Array(n, {Pair(0,0)})
    for( i in 0 until n ){
        var pair= readLine()!!.split(" ").map{it.toInt()}
        s[i]= Pair(pair[0], pair[1])
    }

    var leftSorted= s.sortedArrayWith(Comparator{p1,p2 ->
        if(p1.first!=p2.first) p1.first-p2.first else p1.second-p2.second

    }).toMutableList()

    var rightSorted= s.sortedArrayWith(Comparator{p1,p2->
        if(p1.second!=p2.second)p1.second-p2.second else p1.first-p2.first
    }).toMutableList()

    leftSorted.map{
        println(it)
    }
    println(max(intersect(leftSorted.dropLast(1)),intersect(rightSorted.drop(1))))

}
fun intersect(list:List<Pair<Int,Int>>):Int{
    var left= list.maxByOrNull { it.first }!!.first
    var right= list.minByOrNull { it.second }!!.second
    return if(right>left) right-left  else 0
}