package backtracking
// link: https://leetcode.com/problems/all-paths-from-source-to-target/description/

// Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, 
// find all possible paths from node 0 to node n - 1 and return them in any order.

// The graph is given as follows: graph[i] is a list of all nodes you can visit 
// from node i (i.e., there is a directed edge from node i to node graph[i][j]).
//Input: graph = [[1,2],[3],[3],[]]
// Output: [[0,1,3],[0,2,3]]
// Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
import scala.collection.mutable.{ListBuffer, ArrayBuffer}

object AllPathsFromSourceToTarget {
  object sulotion {
    def allPathsSourceTarget(graph: Array[Array[Int]]): List[List[Int]] = {
        //ans is a node index path as a list
       val ans = ListBuffer.empty[List[Int]] 
       dfs(0, ArrayBuffer(0), graph, ans)
       return ans.toList
    }

    def dfs(index: Int, currentState: ArrayBuffer[Int], graph: Array[Array[Int]], ans: ListBuffer[List[Int]]): Unit = {
        // if the currentState contains the last node => then put it to the answer
        if(currentState.contains(graph.size - 1)) {
            ans.append(currentState.toList)
            return // interrupt here
        }

        //main body:
        //nextSteps <= graph(index)
        // record the index into currentState if it is not existed
        // loop nextsteps to put them into the dfs
        // remove the elem from the currentState
        for(nextStep <- graph(index)) {
            if(!currentState.contains(nextStep)) {
                currentState.append(nextStep)
                dfs(nextStep, currentState, graph, ans)
                currentState.remove(currentState.size - 1)
            }
        }
    }
  }
}
