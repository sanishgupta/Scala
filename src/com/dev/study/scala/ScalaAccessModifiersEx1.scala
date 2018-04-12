package com.dev.study.scala

/**
 *  the access modifiers private and protected, and if we are not
 *   using either of these two keywords, then access will be assumed as
 *   public.
 */
// Private Example
class Outer {
  class Inner {
    private def f() { println("f") }

    class InnerMost {
      f() // OK
    }
  }
  //(new Inner).f() // Error: f is not accessible
}

// Protected Example
class Super { // Public as default
  protected def f() { println("f"); } // Protected defined
}

class Sub extends Super {
  f()
}

class Other {
  //(new Super).f() // Error: f is not accessible
}

//Public 
class Outer1 {
  class Inner1 {
    def f() { println("f") }

    class InnerMost {
      f() // OK
    }
  }
  (new Inner1).f() // OK because now f() is public
}
object ScalaAccessModifiersEx1 {

}