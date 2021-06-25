class I:
  def runSth: Int = 1

abstract class A:
  def myFun(op: I ?=> Unit) =
    op(using I())
    1

class B extends A
  
@main def hello: Unit = 
  
  B().myFun {
    val res = summon[I].runSth
    org.junit.Assert.assertEquals("", 1, res, "asd")
    // org.junit.Assert.assertEquals("", 1, res)
    println("Hello!")
  }
