package verbspractice

class IrregularVerb extends Verb{
    Integer number
    VerbGroup group
    Week week

    static belongsTo = [VerbGroup, Week]

    static constraints = {
        number unique: true
    }

    static mapping = {
        version false
    }
}
