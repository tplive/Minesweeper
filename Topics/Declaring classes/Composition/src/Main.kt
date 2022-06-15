class OperatingSystem {
    var name: String = "Unknown"
}
class DualBoot {
    lateinit var primaryOs: OperatingSystem
    lateinit var secondaryOs: OperatingSystem
}