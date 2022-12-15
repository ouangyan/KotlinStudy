/**
 *
 * object 对象声明（声明单例）
 */
object ApplicationConfig{
    init{
        println("ApplicationConfig loading...")
    }

    fun doSomething(){
        println("doSomething")
    }
}

fun main() {
    ApplicationConfig.doSomething()
}