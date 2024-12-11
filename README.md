# Kotlin Empty Collection Exception Handling

This example demonstrates a common error in Kotlin when using collection functions like `first()`, `last()`, or `single()` on potentially empty collections.  These functions throw exceptions if the collection is empty. The solution shows how to safely handle such scenarios.

## Bug

The `bug.kt` file contains code that attempts to access the first element of a potentially empty list.  If the list is empty, a `NoSuchElementException` is thrown.

## Solution

The `bugSolution.kt` file provides a corrected version that handles the potential emptiness using the `getOrElse` function or the safe call operator `?.` and elvis operator `?:`.