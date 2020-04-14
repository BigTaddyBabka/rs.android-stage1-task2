package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(sentence: String): String {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val vowels = "aeiouy"
        val consonants = "bcdfghjklmnpqrstvwxz"
        val text: Array<String> = sentence.trim().split(" ").toTypedArray()
        var newWord: String
        var maxNumber = 0
        var sortSentence: List<String> = emptyList()
        var isPangram = true

        if(sentence.trim() == "") return ""

        for (i in alphabet.indices)
            if (!(sentence.toLowerCase()).contains(alphabet[i])){
                isPangram = false
                break
            }

        if (isPangram){
            for (i in text.indices){
                var count = 0
                newWord = text[i].trim()
                for (letter in newWord)
                    if (vowels.contains(letter.toLowerCase())){
                        count++
                        newWord = newWord.replace(letter, letter.toUpperCase())
                    }
                if (newWord != "") {
                    newWord = count.toString() + newWord
                    text.set(i, newWord)}

                if (count > maxNumber) maxNumber = count
            }
        }
        else{
            for (i in text.indices){
                var count = 0
                newWord = text[i].trim()
                for (letter in newWord)
                    if (consonants.contains(letter.toLowerCase())){
                        count++
                        newWord = newWord.replace(letter, letter.toUpperCase())
                    }
                if(newWord != ""){
                    newWord = count.toString() + newWord
                    text.set(i, newWord)
                }
                if (count > maxNumber) maxNumber = count
            }
        }

        for(i in 0..maxNumber)
            for (word in text.iterator()){
                if(word.take(1) == "$i")
                    sortSentence += word
            }

        return sortSentence.joinToString(" ")

    }
}

