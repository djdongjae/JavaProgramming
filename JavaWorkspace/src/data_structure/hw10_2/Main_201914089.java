package data_structure.hw10_2;

public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw10_2:오동재");

		// 정점은 6개이고 간선은 없는 방향 그래프 생성
		ListGraph graph = new ListGraph(6);
		
		// 7개의 간선 삽입
		graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 4);
        graph.insertEdge(0, 5);
        graph.insertEdge(3, 2);
        graph.insertEdge(5, 0);
        graph.insertEdge(5, 1);
        
        // 인접행렬 출력 
        graph.printAdjList();
        
        // 그래프의 모든 정점에 대한 진출차수 출력
        for (int i = 0; i < 6; i++) {
        	System.out.print(graph.outDegree(i) + " ");
        }
        
        // 다음 7개의 간선에 대한 간선의 존재 여부 출력
        System.out.print("\n" + graph.hasEdge(5, 1) + " ");
        System.out.print(graph.hasEdge(1, 2) + " ");
        System.out.print(graph.hasEdge(0, 3) + " ");
        System.out.print(graph.hasEdge(0, 2) + " ");
        System.out.print(graph.hasEdge(0, 1) + " ");
        System.out.print(graph.hasEdge(0, 5) + " ");
        System.out.print(graph.hasEdge(3, 2) + "\n");
        
        // 다음 4개의 간선 삭제
        graph.deleteEdge(0, 2);
        graph.deleteEdge(0, 1);
        graph.deleteEdge(0, 5);
        graph.deleteEdge(3, 2);
        
        // 삭제 이후 인접행렬 출력
        graph.printAdjList();

	}

}

class ListGraph {
	private Node[] list; // 인접리스트
	private int n; // vertex 개수

	private class Node { // 단순 연결 리스트 노드 구조
		int vertex;;
		Node link;
	}

	public ListGraph(int n) { // 정점이 n개이고, 간선이 없는 그래프 생성
		list = new Node[n];
		this.n = n;
	}

	public void insertEdge(int v1, int v2) { // 그래프에 간선 <v1, v2> 삽입
		Node newNode = new Node();
		newNode.vertex = v2;
		newNode.link = list[v1];
		list[v1] = newNode;
	}
	
	public int outDegree(int v) {
		int count = 0;
		for (Node temp = list[v]; temp != null; temp = temp.link) {
			count++;
		}
		return count;
	}
	
	public boolean hasEdge(int v1, int v2) {
		for (Node temp = list[v1]; temp != null; temp = temp.link) {
			if (temp.vertex == v2) {
				return true;
			}
		}
		return false;
	}
	
	public void deleteEdge(int v1, int v2) {
		for (Node temp = list[v1]; temp != null; temp = temp.link) {
			if (temp.vertex == v2) {
				temp.
			}
		}
		return false;
	}

	public void printAdjList() { // 인접 리스트를 모두 출력
		for (int i = 0; i < n; i++) {
			System.out.print("정점 " + i + "의 인접리스트");
			for (Node temp = list[i]; temp != null; temp = temp.link) {
				System.out.print(" -> " + temp.vertex);
			}
			System.out.println();
		}
	}
}