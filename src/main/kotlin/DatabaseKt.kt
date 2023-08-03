object DatabaseKt { // вот так просто делается SingleTon на kotlin (причем даже потоки синхронизировать не нужно, он уже синхронизирован)
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(string: String) {
        data.add(string)
    }
}