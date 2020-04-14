package subtask5
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        var blockA=blockA
        var  blockB=blockB
        if ( blockB == String::class){
            var blockC=""
            for(i in 0..blockA.size-1)
            {
                if(blockA[i] is String){
                    blockC+=blockA[i] as String
                }
            }
            return blockC
        }
        if ( blockB == Int::class){
            var blockC=0
            for(i in 0..blockA.size-1)
            {
                if(blockA[i] is Int){
                    blockC+=blockA[i] as Int
                }
            }
            return blockC
        }
        if ( blockB == LocalDate::class){
            return blockA
                .filterIsInstance<LocalDate>()
                .max()
                ?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
        }
        throw NotImplementedError("Not implemented")
    }
}