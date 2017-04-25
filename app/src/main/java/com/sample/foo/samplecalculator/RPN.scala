package com.sample.foo.samplecalculator

/**
  * Created by darcy on 25/4/17.
  */
class RPN {





  def parse = java.lang.Double.parseDouble _
  def eval(str: String) = {
    str.split(' ').toList.foldLeft(List[Double]())(
      (list, token) => (list, token) match {
        case (x :: y :: zs, "*") => (y * x) :: zs
        case (x :: y :: zs, "+") => (y + x) :: zs
        case (x :: y :: zs, "-") => (y - x) :: zs
        case (x :: y :: zs, "/") => (y / x) :: zs
        case (_, _) => parse(token) :: list
      }).head
  }

}
