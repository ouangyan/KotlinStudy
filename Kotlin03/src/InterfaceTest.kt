/**
 *
 * 接口
 * 接口中可以有属性
 */
interface Clickable{
    fun showOff() = println("Clickable>>>showOff()")
}

interface Focusable{
    fun showOff() = println("Focusable>>>showOff()")
}

class ButtonView : Clickable,Focusable{
    /**
     *
     * 实现的两个接口有相同的抽象方法，只需提供一个显示实现
     */
    override fun showOff() {
        // 指定调用指定哪个父类的方法
        super<Clickable>.showOff()
        println("实现了showOff()")
    }
}

fun main() {
    var buttonView = ButtonView()
    buttonView.showOff()
}