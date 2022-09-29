package verbspractice

abstract class Verb {
    String base
    String simplePast
    String pastParticiple
    String translation
    Category category

    static belongsTo = [Category]

    static constraints = {
        base unique: true
        simplePast unique: true
        pastParticiple unique: true
    }
    static mapping = {
        tablePerHierarchy false
        version false
    }
}
