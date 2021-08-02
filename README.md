# tdd-sample-set


Problem Statement

For this exercise, you will be required to write your own implementation for the Set data structure,
this can be written in either Java (write implementation in the Set.java file) or Kotlin (use SetKotlin.kt).

Your set implementation must meet the following requirements:

1. Hold elements of type String
2. Can hold a maximum of 5 elements
3. The order of elements within the set DOES matter
4. Cannot contain duplicate elements
5. Must implement the following methods:
    a. isEmpty(): Determines if the set contains any elements
    b. add(): Add a single, specified element to the set
    c. getSize(): Determines the size of the list
    d. contains(): Determines if the specified element exists within the set
    e. remove(): Removes a single, specified element from the set
    f. clear(): Removes all elements from the set
    
In addition to the above, your implementation must have 100% test coverage.  Test code can be written
in Java (use SetJavaTest file) or Kotlin (SetKotlinTest) utilizing the JUnit framework. 

All code should be written using TDD (Test Driven Development) and the Red Green Refactor pattern (write 
failing test first, then write just enough code to make test pass, finally refactor).  
 
Your implementation cannot rely on the Set class built into Java/Kotlin, you must use a standard array 
to hold all values.

When writing test method names, please follow this convention:

<action/functionName>_<Conditions>_<result>

Ex:
isEmpty_setIsEmpty_returnTrue()

Good luck!