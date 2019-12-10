import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class DepthFirstSearch {

    public static void main(String[] args) {
        test();
    }

    public static void test(){

        System.out.println("\n===[Depth First Traversal]===");

        DFSNode node40 =new DFSNode(40);
		DFSNode node10 =new DFSNode(10);
		DFSNode node20 =new DFSNode(20);
		DFSNode node30 =new DFSNode(30);
		DFSNode node60 =new DFSNode(60);
		DFSNode node50 =new DFSNode(50);
        DFSNode node70 =new DFSNode(70);
        
        DFSNode [] allNodes = {node40, node10, node20,  node30, node60, node50, node70};
 
		node40.addNeighbor(node10);
		node40.addNeighbor(node20);
		node10.addNeighbor(node30);
		node20.addNeighbor(node10);
		node20.addNeighbor(node30);
		node20.addNeighbor(node60);
		node20.addNeighbor(node50);
		node30.addNeighbor(node60);
		node60.addNeighbor(node70);
        node50.addNeighbor(node70);

        DepthFirstSearch dfsInstance = new DepthFirstSearch();

        System.out.println("\n[Depth First Traversal - using Recursion]");
        dfsInstance.dfs(node40);
        System.out.println("\n[Depth First Traversal - using Stack]");
        dfsInstance.resetNode(allNodes);
        dfsInstance.dfsWithStack(node40);
       
    }

    private void resetNode(DFSNode[] nodes){
        
        for(DFSNode node : nodes){
            node.visited = false;
        }        
    }   

    public void dfs(DFSNode node){
        if(node == null) return;

        System.out.print(node.data + " ");
        node.visited = true;

        for(DFSNode neighbor : node.getNeighbors()){
            if(!neighbor.visited){
                dfs(neighbor);
            }
        }
    }

    public void dfsWithStack(DFSNode node){

        if(node == null) return;

        Stack <DFSNode> stack = new Stack<DFSNode>();

        stack.push(node);

        while(!stack.empty()){
            DFSNode current = stack.pop();

            if(!current.visited){
                System.out.print(current.data + " ");
                current.visited = true;
            }

            List<DFSNode> neighbors = current.getNeighbors();

            for(DFSNode neighbor : neighbors){
                if(!neighbor.visited){
                    stack.push(neighbor);
                }

            }

        }

    }


    
}


class DFSNode{

    int data;
    boolean visited;
    List<DFSNode> neighbors;

    public DFSNode(int data){
        this.data = data;
        this.neighbors = new ArrayList<DFSNode>();
    }

    public void addNeighbor(DFSNode neighborNode){
        neighbors.add(neighborNode);
    }

    public void setNeighbors(List<DFSNode> neighbors){
        this.neighbors = neighbors;
    }

    public List<DFSNode> getNeighbors() {
        return neighbors;
    }
}
