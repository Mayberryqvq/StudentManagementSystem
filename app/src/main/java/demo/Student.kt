package demo

class Student(val id: String, val name:String, val major:String){
    fun showInfo(){//对象方法 直接输出该对象的属性
        println("$id\t\t  $name\t\t  $major\t\t")
    }
}