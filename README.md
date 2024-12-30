# Uncommon Scala Bug: Private Var with Exception Handling in Setter

This repository demonstrates an uncommon bug in Scala related to using a private `var` with a getter and setter, and throwing an exception in the setter.  This can lead to unexpected behavior when dealing with `Option` or `Try` and can be challenging to debug. 

The bug is demonstrated in `MyClass.scala`. The solution, using pattern matching and Option, can be found in `MyClassSolution.scala`.