//package com.nashtech
//
//import scala.language.experimental.macros
//import scala.reflect.macros.blackbox
//import scala.reflect.macros.blackbox.Context
//
//object CaseClassGenerator {
//
////  def generateCaseClass(className: String, params: List[(String, String)]): Any = macro generatorImpl
////
////  def generatorImpl(c: Context)(className: c.Expr[String], params: c.Expr[List[(String, String)]]): c.Expr[Any] = {
////    import c.universe._
////
////    val listOfParams = reify{
////      params.splice.map{
////        k =>
////          q"${k._1}: ${k._2}"
////      }
////    }
////
////    println(listOfParams)
////
////    val fName = className.toString()
////
////    var str: StringBuilder = new StringBuilder(s"case class ${fName}(")
////
////
////    reify{
////      listOfParams.splice.map{
////        params =>
////          println(params)
////          str.append(params + ", ")
////      }
////    }
////
////    println(str.toString())
////
////    val fstr = "" //str.toString().replace((str.charAt(str.lastIndexOf(",") - 1).toString) + " ", ")")
////
////
////
//////
//////
////    println(fstr)
////
////    // Create the case class definition
//////    val caseClassDef =
//////      q"""case class Person(name: String, age: Int)"""
////
////
////    val name = TypeName(c.freshName("GeneratedCaseClass"))
////
////    val param = q"val name: String"
////
////    val caseClassDef = q"case class $name($param)"
////
////    c.Expr(caseClassDef)
////
////  }
//
//  def generateCaseClass(fieldName: String): Any = macro generateCaseClassImpl
//
//  def generateCaseClassImpl(c: blackbox.Context)(fieldName: c.Expr[String]): c.Expr[Any] = {
//    import c.universe._
//
////    val name = TypeName("GeneratedCaseClass")
////
////    val param = q"val $fieldName: String"
//
//
//    val caseClassDef =
//      q"""
//         case class Person(name: String)
//         """
//
//    c.Expr(caseClassDef)
//  }
//
//
//}
