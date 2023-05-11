package com.nashtech

import scala.reflect.macros.blackbox
import scala.language.experimental.macros
import scala.annotation.StaticAnnotation

object CaseClassGen {
  def impl(c: blackbox.Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
    import c.universe._
    import Flag._
    val result = {
      annottees.map(_.tree).toList match {
        case q"object $name extends ..$parents { ..$body }" :: Nil =>
          q"""
            object $name extends ..$parents {
              def initializer: ${typeOf[String]} = "someDefaultValue"
              ..$body
            }
          """
        case q"class $name extends ..$parents { ..$body }" :: Nil =>
          q"""
              class $name extends ..$parents {
                def initializer: ${typeOf[String]} = "someDefaultValueForClass"
                ..$body
              }
            """
        case q"$mods class $tpname(..$paramss) extends ..$parents { ..$body }" :: Nil =>
          q"""
              case class $tpname(..$paramss)
           """
        case _ => c.abort(c.enclosingPosition, "Invalid annottee")
      }
    }
    c.Expr[Any](result)
  }
}

class macrosGen extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro CaseClassGen.impl
}