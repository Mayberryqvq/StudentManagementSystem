package demo

import kotlin.system.exitProcess

class SystemManager private constructor(){
    val studentManager = StudentManager.sharedInstance()//创建一个StudentManager的对象（单例）
    companion object{
        private val instance = SystemManager()
        fun sharedInstance() = instance
    }

    fun start(){
        println("欢迎来到鹅厂教育学生管理系统！！")
        while (true){
            Menu.showMainMenu()
            when(IOManager.getInput(true)){
                "1" -> {
                    studentManager.showStudentList()
                }
                "2" -> {
                    dealwithQuery()
                }
                "3" -> {
                    studentManager.addStudent()
                }
                "4" -> {
                    Menu.sayGoodBye()
                    exitProcess(0)
                }
            }

        }
    }

    private fun dealwithQuery(){
        Menu.showQueryMenu()
        when(IOManager.getInput(true)){
            "1" -> {
                print("请输入学生编号:")
                val id = IOManager.getInput(false)
                val student = studentManager.findStudentById(id!!)
                studentManager.showStudent(student)
            }
            "2" -> {
                print("请输入学生姓名")
                val name = IOManager.getInput(false)
                val student = studentManager.findStudentByName(name!!)
                studentManager.showStudent(student)
            }
            "3" -> {
                print("请输入学生专业:")
                val major = IOManager.getInput(false)
                val student  = studentManager.findStudentByMajor(major!!)
                studentManager.showStudent(student)
            }

        }
    }
}