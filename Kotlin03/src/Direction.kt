/**
 *
 * 枚举
 * 每个枚举类的常量只有一个实例
 * 枚举类有构造函数、属性、函数
 */
enum class Direction(){
    EAST,
    WEST,
    SOUTH,
    NORTH;

//    fun judgeDirection(direction:Direction) : String{
//        return when(direction){
//            Direction.EAST -> "当前方位：东方"
//            Direction.WEST -> "当前方位：西方"
//            Direction.SOUTH -> "当前方位：北方"
//            Direction.NORTH -> "当前方位：南方"
//        }
//    }
}

fun main() {
    // 每一个枚举常量就是一个对象
    println(Direction.EAST)
    println(Direction.EAST is Direction)

    // 枚举中的函数
//    println(Direction.EAST.judgeDirection(Direction.NORTH))
}