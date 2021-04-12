package demo


class StudentManager private constructor(){
    //定义动态空数组以后续存储学生对象
    val studentList = mutableListOf<Student>()
    //单例设计模式
    companion object{
        //定义静态属性接受这个对象
        private val INSTANCE = StudentManager()
        //定义静态方法返回这个对象
        fun sharedInstance()= INSTANCE
    }

    fun showStudentList(){
        if (studentList.size == 0){
            println("暂时没有学生数据")
        }else{
            println("编号\t\t  姓名\t\t  专业\t\t  ")
            studentList.forEach{
                it.showInfo()
            }
        }
    }

    fun showStudent(student:Student?){
        if (student == null){
            println("该学生不存在")
        }else{
            student.showInfo()
        }
    }

    fun findStudentById(id:String):Student?{
        studentList.forEach {
            if (it.id == id){//将输入的参数与学生数组中每一个元素的参数一一比较，如果一样
                return it//返回该学生
            }
        }
        return null//查找不到则返回空
    }

    fun findStudentByName(name:String):Student?{
        studentList.forEach {
            if (it.name == name){
                return it
            }
        }
        return null
    }

    fun findStudentByMajor(major:String):Student?{
        studentList.forEach {
            if (it.major == major){
                return it
            }
        }
        return null
    }

    fun addStudent(){
        print("请输入学生姓名:")
        val name = IOManager.getInput(false)
        print("请输入学生专业:")
        val major = IOManager.getInput(false)
        val student = Student("${studentList.size + 1}",name!!,major!!)
        studentList.add(student)
        print("添加学生成功！！")

    }
}