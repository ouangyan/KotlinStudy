/**
 *
 * 构造方法、次构造方法
 * 属性定义
 * 属性赋值顺序(主构造函数 > 类级别属性赋值 > init初始化块里的属性赋值和函数调用 > 次构造函数)
 * init初始化代码块
 * 查看编译代码  Tools -> Kotlin -> show Kotlin Bytecode  或者双击shift，再输入show Kotlin Bytecode
 * lazy 懒加载
 */
class Player(
    _name:String,
    var age:Int
) {
    // 类级别属性赋值
    var name = _name
    var isNormal = true
    var skill:String

    // 初始化块，执行构造函数中属性的检测、执行初始化方法
    init{
        require(name.isNotBlank()){"name is not null"}
        skill = "scud"
    }

    // 次构造函数（必须直接或间接调用主构造函数）
    constructor(_name:String):this(_name,20){
        isNormal = false
    }
}

fun main() {
    // var player = Player("")

    var player = Player("Rose",22)
    println(player.skill)
}