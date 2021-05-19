package cn.feng

object scala {
  def main(args: Array[String]): Unit = {
    val x=1
    /*//判断x的值，将结果赋给y
    val y=if (x>0) 1 else -1
    //打印y的值
    print(y)*/

    /*//支持混合类型表达式
    val z=if (x>1) 1 else "error"
    //打印z的值
    print(z)*/

    //如果缺失else，相当于if(x>2) 1 else ()
    /*val m=if (x>2) 1
    print(m)*/

    /**
     * 在scala中每个表达式都有值，scala中有个Unit类，用作不返回任何结果的方法的结果类型，
     * 相当于java中的void，Unit只有一个实例值，写成（）
     */
   /* val n=if(x>2) 1 else ()
    print(n)*/

    //if和else if
    /*val k=if (x<0) 0
    else if (x >= 1) 1 else -1
    print(k)*/

    /*val a=10
    val b=20
    //在scala中{}包含一系列表达式，块中最后一个表达式的值就是块的值
    //下面就是一个块表达式
   val result ={
      val c=b-a
      val d=b-c
      d //块中最后一个表达式的值
    }
    //result的值就是块表达式的结果
    print(result)*/

    //for（i<- 表达式），表达式1 to 10 返回一个Range(区间)
    //每次循环将区间中的一个值赋给i
    /*for (i<- 1 to 10)
      print(i)

    //for(i<- 数组)
    val arr =Array("a","b","c","d")
    for (i <- arr)
      print(i)*/

    //高级for循环
    //每个生成器都可以带一个条件，注意： if前面没有分号
    /*for (i  <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 * i+j)+"")
      print()*/

    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val v =for (i<- 1 to 10)yield i*10
    print(v)
  }

}
