fun main() {
    var input = readLine()!!.split(" ")
    var len = input[0].toInt()
    var cnt = input[1].toInt()
    var string = readLine()!!.substring(0, len)
    var subString=""
    var endIndex= string.length-1
    while(endIndex>=0){
        val sub= string.substring(0,endIndex)
        if(string.endsWith(sub) || sub.isBlank()){
            subString=sub
            break
        }
        endIndex--
    }
    val repeat = if(subString.isNotBlank()) string.replaceFirst(subString,"")
    else{ string}

    print(subString)
    for(i in 0 until  cnt){
        print(repeat)
    }

}