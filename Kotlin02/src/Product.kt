import java.io.File

/**
 *
 * 继承
 * open、override关键字 （open关键字修饰的类与方法才能继承与重写）
 * 多态： 父类类型的引用子类类型的对象
 * is操作符 类类型检测
 * as操作符 类类型转换
 * Any 超类
 */
open class Product(val name: String){
    fun description() = "Product ${name}"
    open fun load() = "Nothing..."
}

class LuxuryProduct : Product("Luxury"){
    override fun load() = "LuxuryProduct Loading..."

    fun special() = "LuxuryProduct special function"
}

fun main() {
    val product:Product = LuxuryProduct()
    println(product.load())
    println(product is Product)
    println(product is LuxuryProduct)
    println(product is File)
    if(product is LuxuryProduct){
        println((product as LuxuryProduct).special())
    }
}