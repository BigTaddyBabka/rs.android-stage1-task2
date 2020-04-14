package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {


        var changeString=a
        var controlString=b

        var  controlString2=""
        if (changeString.compareTo(controlString) == 0){
            println("nice")
        }
        else{
            changeString=changeString.toUpperCase()
            if(changeString.compareTo(controlString) == 0)
            {
                println("nice")
            }
            else
            {
                for(i in 0..changeString.length-1){
                    for(j in 0..controlString.length-1){
                        if(changeString[i]==controlString[j]){
                            controlString2+=changeString[i]
                        }
                    }
                }
                println(controlString2)
                if(controlString2.compareTo(controlString) == 0){
                    return("YES")

                }
                else{
                    return ("NO")
                }

            }
        }

        throw NotImplementedError("Not implemented")
    }
}
