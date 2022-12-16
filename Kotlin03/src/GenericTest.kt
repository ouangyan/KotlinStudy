/**
 *
 * 泛型
 */
class MagicBox<T>(item: T){
    var available = false
    private var subject:T = item

    fun fetch() : T?{
        return subject.takeIf { available }
    }
}

class Boy(var name: String,var age: Int)

class Dog(var weight: Int)

fun main() {
    var box:MagicBox<Boy> = MagicBox(Boy("Jack",20))
    box.available = true
    box.fetch()?.run {
        println("you find $name")
    }
}