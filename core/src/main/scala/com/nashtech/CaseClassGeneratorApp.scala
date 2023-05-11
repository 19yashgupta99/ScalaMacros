package com.nashtech
@macrosGen
object Pallav {
  val stt = this.initializer
}

@macrosGen
class NewOne{
  val boom = this.initializer
}

@macrosGen
class rson(val name: String, val age: Int)


object CaseClassGeneratorApp extends App {

  val paramsAsListOfTuple:List[(String, String)] = List(("name", "String"), ("age", "Int"))

  println(Pallav.stt)

  val obj = new NewOne

  println(obj.boom)

  val abc = rson("PAllav", 25)

  println(abc.name)

  case class NP(name: String, age: Int){
    def hello: String = "hello0000"
  }

  val sObj = NP("gupta", 23)

  println(sObj.hello)

}



































