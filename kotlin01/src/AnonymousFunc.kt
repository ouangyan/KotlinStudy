/**
 *
 * 匿名函数
 */
fun main() {
    var count = "OuYangYan".count()
    println(count)
    // 通过匿名函数给标准函数指定特殊规则
    var countA = "Ouyangyan".count({ letter ->
        letter == 'a'
    })
    println(countA)

    // 变量的类型是无参的匿名函数
    // 除少数的情况外，匿名函数不需要return关键字返回，默认返回最后一行语句的结果
    var blessingFunction:()->String
    blessingFunction = {
        val holiday = "NewYear."
        "Happy $holiday"
    }
    println(blessingFunction())

    // 变量的类型是有参数的匿名函数
    // 参数的类型放在匿名函数的类型定义中，参数名则放在函数定义中
    var blessingFunction2:(String)->String = {
        name ->
        val holiday = "NewYear."
        "$name,Happy $holiday"
    }
    println(blessingFunction2("Jack"))

    // 只有一个参数时另一种写法（it代替参数名）
    var blessingFunction3:(String)->String = {
        val holiday = "NewYear."
        "$it,Happy $holiday"
    }
    println(blessingFunction3("Jack"))

    // 匿名函数参数类型推断
    var blessingFunction4 = { name:String,year:Int ->
        val holiday = "NewYear."
        "$name,Happy $holiday $year"
    }
    println(blessingFunction4("Jack",2027))
}