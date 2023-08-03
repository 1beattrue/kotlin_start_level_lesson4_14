class DatabaseSingleTon private constructor() { // запретили создание объектов снаружи
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(string: String) {
        data.add(string)
    }

    companion object { // метод getInstance() должен быть статическим, так как снаружи мы не можем создать экземпляр класса -> единственный способ к нему обратиться
        var db: DatabaseSingleTon? = null
        fun getInstance(): DatabaseSingleTon { // метод получения экземпляра
            db?.let { // если null - ничего не вернет
                return it
            }
            val instance = DatabaseSingleTon()
            db = instance
            return instance
        }
    }
}