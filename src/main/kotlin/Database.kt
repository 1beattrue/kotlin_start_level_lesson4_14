class Database {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(string: String) {
        data.add(string)
    }
}