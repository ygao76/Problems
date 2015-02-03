/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
       if(node==null){
           return null;
       }
       UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
       Map<Integer,UndirectedGraphNode> visited = new HashMap<Integer, UndirectedGraphNode>();
       visited.put(copy.label,copy);
       DFS(node,copy, visited);
       return copy;
    }
    
    public void DFS(UndirectedGraphNode node, UndirectedGraphNode copy, Map<Integer,UndirectedGraphNode> visited){
        for(UndirectedGraphNode neighbor: node.neighbors){
            if(visited.get(neighbor.label)==null){
                UndirectedGraphNode neighborCopy = new UndirectedGraphNode(neighbor.label);
                visited.put(neighborCopy.label,neighborCopy);
                DFS(neighbor, neighborCopy, visited);
                copy.neighbors.add(neighborCopy);
            }else{
                copy.neighbors.add(visited.get(neighbor.label));
            }
        }
    }
}
