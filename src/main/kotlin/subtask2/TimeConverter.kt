package subtask2

class TimeConverter {

    // TODO: Complete the following function

        fun toTextFormat(hour: String, minute: String): String {
            var a = hour.toInt()
            var b = minute.toInt()
            val numbers: Array<String> = arrayOf("zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine" )
            if (b > 59) return ""
            if (b == 0) return(numbers[a] + " o' clock")
            else if (b == 1) return ("one minute past " + numbers[a])
            else if (b == 59)  return ("one minute to " + numbers[(a % 12) + 1])
            else if (b == 15) return  ("quarter past " + numbers[a])
            else if (b == 30) return  ("half past " + numbers[a])
            else if (b == 45)return   ("quarter to " + numbers[(a % 12) + 1])
            else if (b <= 30)return  ( numbers[b] + " minutes past " +  numbers[a])
            else if (b > 30) return  ( numbers[60 - b] + " minutes to " +  numbers[(a % 12) + 1])

            throw NotImplementedError("Not implemented")
        }


}
