```scala
class MyClass(val name: String, initialAge: Int) {
  private var _age: Option[Int] = Some(initialAge)

  def age: Option[Int] = _age

  def age_=(newAge: Int): Unit = {
      _age = if (newAge >= 0) Some(newAge) else None
  }
}

 object MyClassTest extends App {
  val myClass = new MyClass("Alice", 30)
  println(myClass.age) // Some(30)
  myClass.age = -5
  println(myClass.age) // None
  myClass.age = 35
  println(myClass.age) // Some(35)
}
```