package demo

fun main() {
    //创建一个学生管理系统（单例），调用start方法
    SystemManager.sharedInstance().start()
}