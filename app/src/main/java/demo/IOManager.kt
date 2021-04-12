package demo

//定义和输入输出有关的类
class IOManager {
    //定义静态方法,无需创建对象直接调用
    companion object{
        //可能有返回值也可能没有 所以是可选值类型
        fun getInput(result:Boolean):String?{
            if (result) {//参数为true则提示用户选择操作
                println("请选择操作:")
            }//参数为false则返回用户输入的字符
            return readLine()
        }
    }
}