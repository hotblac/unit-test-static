# JUnit static fields 
This is a demonstration of problems with using JUnit with an application that uses `static` fields to manage application state. The tests in this project fail intermittently - by design.
A discussion of the issue and suggested fixes in [Don't Panic: JUnit and static fields](https://www.dontpanicblog.co.uk/2025/12/18/junit-and-static-fields/).

The main branch contains JUnit 6 tests. There's also a branch showing the same issue with [JUnit 4](https://github.com/hotblac/unit-test-static/tree/junit4).
