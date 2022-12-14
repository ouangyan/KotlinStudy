/**
 *
 * 匿名函数
 *   具名函数中匿名函数当参数
 *   lambda简写
 */
fun main() {
    var showDiscount = { goodsName:String,hour:Int ->
        val year = 2027
        "${year}年，双11${goodsName}促销活动倒计时${hour}小时"
    }
    showOnBoard("卫生纸",showDiscount)

    // 简写(如果一个函数的lambda参数排在最后，或者是唯一参数，那么括住lambda值参的一对圆括号可以省略)
    showOnBoard("卫生纸"){goodsName:String,hour:Int ->
        val year = 2027
        "${year}年，双11${goodsName}促销活动倒计时${hour}小时"
    }
}

private fun showOnBoard(goodsName:String,showDiscount:(String,Int) -> String){
    var hour = (1..24).shuffled().last()
    println(showDiscount(goodsName,hour))
}