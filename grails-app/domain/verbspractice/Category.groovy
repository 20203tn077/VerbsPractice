package verbspractice

class Category {
    String name

    static constraints = {
        name unique: true
    }

    static mapping = {
        version false
    }
}
