package subtask1

class DateFormatter {

    // TODO: Complete the following function

        fun toTextDay(day: String, month: String, year: String): String {
            var day = day
            var mounth = month
            var year = year
            var mounthName = ""
            var dayInt: Int = 0
            var mounthCode: Int = 0
            var yearCode: Int = 0
            var centruCode: Int = 0
            var lastNumbers: Int = 0
            var dayOfWeek: Int = 0
            if (day.toInt() < 32 && mounth.toInt() < 13) {
                if (year.toInt() % 4 !== 0 && day == "29") {
                    return ("Такого дня не существует")
                }
                if (mounth == "1" || mounth == "10") {
                    mounthCode = 1
                    if (mounth == "1") {
                        mounthName = "января"
                    }
                    if (mounth == "10") {
                        mounthName = "октября"
                    }
                }
                if (mounth == "5") {
                    mounthCode = 2
                    mounthName = "мая"
                }
                if (mounth == "8") {
                    mounthCode = 3
                    mounthName = "августа"
                }
                if (mounth == "2" || mounth == "3" || mounth == "11") {
                    mounthCode = 4
                    if (mounth == "2") {
                        mounthName = "февраля"
                    }
                    if (mounth == "3") {
                        mounthName = "марта"
                    }
                    if (mounth == "11") {
                        mounthName = "ноября"
                    }
                }
                if (mounth == "6") {
                    mounthCode = 5
                    mounthName = "июня"
                }
                if (mounth == "9" || mounth == "12") {
                    mounthCode = 6
                    if (mounth == "9") {
                        mounthName = "сентября"
                    }
                    if (mounth == "12") {
                        mounthName = "декабря"
                    }
                }
                if (mounth == "4" || mounth == "7") {
                    mounthCode = 0
                    if (mounth == "4") {
                        mounthName = "апреля"
                    }
                    if (mounth == "7") {
                        mounthName = "июля"
                    }
                }
                if (year.dropLast(2) == "20") {
                    yearCode = 6
                }
                if (year.dropLast(2) == "19") {
                    yearCode = 0
                }
                lastNumbers = year.drop(2).toInt()
                dayInt = day.toInt()
                yearCode = (centruCode + lastNumbers + lastNumbers / 4) % 7
                if (year.toInt() % 4 == 0) {
                    dayOfWeek = ((dayInt + mounthCode + yearCode) % 7) - 1
                } else {
                    dayOfWeek = (dayInt + mounthCode + yearCode) % 7
                }

                if (dayOfWeek == 0) {
                    return (day + " " + mounthName + ", суббота")
                }
                if (dayOfWeek == 1) {
                    return (day + " " + mounthName + ", воскресенье")
                }
                if (dayOfWeek == 2) {
                    return (day + " " + mounthName + ", понедельник")
                }
                if (dayOfWeek == 3) {
                    return (day + " " + mounthName + ", вторник")
                }
                if (dayOfWeek == 4) {
                    return (day + " " + mounthName + ", среда")
                }
                if (dayOfWeek == 5) {
                    return (day + " " + mounthName + ", четверг")
                }
                if (dayOfWeek == 6) {
                    return (day + " " + mounthName + ", пятница")
                }
            } else {
                return ("Такого дня не существует")
            }
            throw NotImplementedError("Not implemented")

        }

}
