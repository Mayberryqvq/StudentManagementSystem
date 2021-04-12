package demo

class Menu {
    companion object{
        val main_menu:Array<String> = arrayOf("学生列表","查询","添加学生","退出系统")
        val query_menu:Array<String> = arrayOf("编号查询","姓名查询","专业查询","返回")

        private fun showMenu(menus:Array<String>){
            println("---------------------")
            for (i in 1..menus.size){
                println("$i. ${menus[i - 1]}")
            }
            println("---------------------")
        }

        fun showMainMenu(){
            showMenu(main_menu)
        }

        fun showQueryMenu(){
            showMenu(query_menu)
        }

        fun sayGoodBye(){
            println("------------------")
            println("感谢您的使用，欢迎下次再来!!!")
            println("------------------")
        }
    }
}