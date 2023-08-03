class TestSingleTon {
    fun insertTestData(string: String) {
        DatabaseSingleTon.getInstance().insertData(string)
    }
}