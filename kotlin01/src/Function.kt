/**
 *
 * 函数
 */
fun main(){
    println(doSomething("Jack",22))
    // TODO函数终止运行
    TODO("nothing")
    fix("Jack")
}

// 带String返回值的私有具名函数
private fun doSomething(name:String,age:Int):String{
    return name+age
}

// 默认值参、unit函数
fun fix(name:String,age:Int = 20){
    println(name+age)
}




