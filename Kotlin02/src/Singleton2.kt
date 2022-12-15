/**
 *
 * 对象表达式
 */
open class Student{
    open fun load() = "Student loading..."
}

fun main() {
    val s = object : Student(){
        override fun load() = "anonymous loading..."
    }
    println(s.load())
}