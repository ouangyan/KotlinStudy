import java.io.File

/**
 *
 * 伴生对象
 * companion object
 */
open class ConfigMap{
    // 只存在一份，只有当ConfigMap实例化或load()被调用才存储
    companion object{
        private const val PATH = "xxxx"
        fun load() = File(PATH).readBytes()
    }
}

fun main() {
    ConfigMap.load()
}