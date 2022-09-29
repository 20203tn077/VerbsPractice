package verbspractice

class VerbGroup {
    Integer number
    String name

    static hasMany = [verbs: IrregularVerb]

    static constraints = {
        number unique: true
        name unique: true
    }

    static mapping = {
        version false
    }
}
