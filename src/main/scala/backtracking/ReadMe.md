### Backtracking

#### Basic Idea
```
public int backtrack(STATE curr, OTHER_ARGUMENTS...) {
    if (BASE_CASE) {
        // modify the answer
        return 0;
    }

    int ans = 0;
    for (ITERATE_OVER_INPUT) {
        if(condition) { // when to skip
            // modify the current state
            ans += backtrack(curr, OTHER_ARGUMENTS...)
            // undo the modification of the current state
        }
    }
}
```


### Basic Example:
All the subset of a Set:

1. modify answer: when the ans set not contain the answer
2. iterate every elem from input
3. skip condition: when the currentState has already contain the elem
4. add the current elem to the current state
5. remove the current elem from the current state

### Code eval for [1,2,3]
```
1. currentState = [1], backTrackStack = 0
2. currentState = [1], backTrackStack = [from1]
3. currentState = [], backTrackStack = [from1] 
4. currentState = [2], backTrackStacck = [from1]
5. currentState = [2], backTrackStacck = [from1, from2]
6. currentState = [], backTrackStacck = [from1, from2]
7. currentState = [3], backTrackStacck = [from1, from2]
8. currentState = [3], backTrackStacck = [from1, from2, from3]
9. currentState = [0], backTrackStacck = [from1, from2, from3] 
10. currentState = [1,2], backTrackStacck = [from2, from3]
11. currentState = [1,2], backTrackStacck = [from2, from3, from[1,2]]
12. currentState = [1], backTrackStacck = [from2, from3, from[1,2]] 
13. currentState = [1,3], backTrackStacck = [from2, from3, from[1,2]] 
14. currentState = [1,3], backTrackStacck = [from2, from3, from[1,2], from[1,3]] 
15. currentState = [1], backTrackStacck = [from2, from3, from[1,2], from[1,3]]
16. currentState = [2], backTrackStacck = [from3, from[1,2], from[1,3]]
......
```


Tips
1. remember the basic structure
2. for each backtracking, understanding if you like to go through all the elems in the next level or just some of them.