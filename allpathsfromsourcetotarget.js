//Objective is to find all paths from a source (always at 0) to a given
//target (always the length of the graph - 1)

let graph = [[1,2],[3],[3],[]]


//O(n * 2^n) solution that uses backtracking to find all possible paths
//n time to write down the solution into the result, and 2^n time to create all paths

let temp = [0]
let result = []
let node = 0

function backtrack(temp, node) {
    if (node == graph.length - 1) {
        result.push([...temp])
        return
    }
        
    for (let neighbor of graph[node]) {
        temp.push(neighbor)
        backtrack(temp, neighbor)
        temp.pop()
    }
}
backtrack(temp, node)

return result