package demo

object scala {
  def main(args: Array[String]): Unit = {

    //使用val定义的变量是不可变的，相当于java里用final修饰的变量
    //val是常量
    val i=111
    //使用var定义的变量是可变的，在Scala中鼓励使用val
    var s="hello"

    print(i)
  }

}
