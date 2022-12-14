/**
 *
 * 条件过滤
 */
fun main(){
    // range表达式
    var age = 10
    if(age in 1..3){
        println("幼儿")
    }else if(age in 4..12){
        println("青少年")
    }else{
        println("其他")
    }

    // when表达式
    var school = "中学"
    var level = when(school){
        "学前班" -> "幼儿"
        "小学"   -> "少儿"
        "中学"   -> "青少年"
        else -> {
            "未知"
        }
    }
    println(level)
}