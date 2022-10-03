package verbspractice

import org.joda.time.LocalDate

class Week {
    Integer number
    LocalDate startDate

    static hasMany = [verbs: IrregularVerb]

    static constraints = {
        number unique: true
        startDate unique: true
    }

    static mapping = {
        version false
    }
}
