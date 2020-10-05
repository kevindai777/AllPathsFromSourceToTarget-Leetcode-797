//Java Solution

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> temp = new LinkedList<>();
        temp.addFirst(0);
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(temp, 0, graph, result);
        return result;
    }
    
    public void backtrack(LinkedList<Integer> temp, int node, int[][] graph, List<List<Integer>> result) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for (int neighbor : graph[node]) {
            temp.addLast(neighbor);
            backtrack(temp, neighbor, graph, result);
            temp.removeLast();
        }
    }
}