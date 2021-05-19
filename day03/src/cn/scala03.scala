package cn

object scala03 {
  //定义一个方法
  //方法ml参数要求是一个函数，函数的参数必须是两个Int类型
  //返回值类型也是Int类型
  def ml(f:(Int,Int)=>Int):Int={
    f(2,6)
  }

  //定义一个函数f1，参数是两个Int类型，返回值是一个Int类型
  val f1=(x:Int,y:Int)=>x+y
  //在定义一个函数f2
  val f2=(m:Int,n:Int)=>m*n

  //main方法
  def main(args: Array[String]): Unit = {

    //调用ml方法，并传入f1函数
    val r1=ml(f1)
    print(r1)

    //调用ml方法，并传入f2函数
    val r2=ml(f2)
    print(r2)
  }

}
