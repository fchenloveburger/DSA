package backtrancking

import org.scalatest.funsuite.AnyFunSuite
import backtracking.Subset
class SubsetTest extends AnyFunSuite {
    test("subset test1") {
        val inputs = Array(1,2,3)
        val outputs = Subset.sulution.subset(inputs)
        val expected = List(List.empty[Int], List(1), List(2), List(1,2), List(3), List(1,3), List(2,3), List(1,2,3))
        println(outputs)
        assert(outputs.toSet == expected.toSet)
    }
}