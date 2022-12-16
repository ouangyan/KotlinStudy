/**
 *
 * 密封类
 * 密封类兼顾枚举类的特性并延展
 * 密封类子类可以多次创建多个实例对象
 */
sealed class LicenseStatus{
    object UnQualified : LicenseStatus()
    object Learning : LicenseStatus()
    class Qualified(val licenseId: String) : LicenseStatus()
}

class Driver(val status: LicenseStatus){
    fun checkLicense() : String{
        return when(status){
            is LicenseStatus.UnQualified -> "没有驾驶证，不能驾驶"
            is LicenseStatus.Learning -> "驾驶证在考取中，通过后才能驾驶"
            is LicenseStatus.Qualified -> "可以驾驶，驾驶证编号：${this.status.licenseId}"
        }
    }
}

fun main() {
    val licenseStatus = LicenseStatus.Qualified("1qaz1234567")
    val driver = Driver(licenseStatus)
    println(driver.checkLicense())
}