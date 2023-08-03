fun main() {
    // SingleTon

    val db = Database()
    db.insertData("1")
    db.insertData("2")

    // представим, что где-то в другом месте программы нужно записать данные в базу
    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")

    for (str in db.data) println(str) // новых данных в бд нет, что логично, ведь у нас есть два разных объекта бд

    println()

    // очень часто бывают случаи, когда из разных классов нужно работать с одним и тем же объектом
    // бд - хороший пример, изменяя ее в одном классе, мы хотим, чтобы изменения были доступны в других
    // для этого существует паттерн SingleTon

    val dbSingleTon = DatabaseSingleTon.getInstance() // теперь мы обращаемся к бд через метод getInstance() -> во всех классах получаем ее уникальный экземпляр
    dbSingleTon.insertData("1")
    dbSingleTon.insertData("2")
    val testSingleTon = TestSingleTon()
    testSingleTon.insertTestData("3")
    testSingleTon.insertTestData("4")

    for (str in dbSingleTon.data) println(str)

    // но это еще не вся магия
    // данный способ актуален для java
    // в котлине можно реализовать объект, который будет являться SingleTon'ом

    DatabaseKt.insertData("aboba")
    DatabaseKt.insertData("bebra")
    println(DatabaseKt.data)
}