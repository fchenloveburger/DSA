package backtrancking

import org.scalatest.funsuite.AnyFunSuite
import backtracking.AllPathsFromSourceToTarget

class AllPathsFromSourceToTargetTest extends AnyFunSuite {
    test("All path 1 ") {
        val inputs = Array(Array(1,2),Array(3),Array(3),Array.empty[Int])

        val outputs = AllPathsFromSourceToTarget.sulotion.allPathsSourceTarget(inputs)

        val expected = List(List(0,1,3), List(0,2,3))
        
        assert(outputs == expected)
    }  
}
