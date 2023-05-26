package data_structure.lab10_2_2;

public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab10_2:오동재");

		ListGraph graph = new ListGraph(7); // 정점수 4인 방향 그래프
		graph.insertEdge(0, 1);
		graph.insertEdge(0, 2);
		graph.insertEdge(0, 4);
		graph.insertEdge(0, 5);
		graph.insertEdge(3, 2);
		graph.insertEdge(5, 0);
		graph.insertEdge(5, 1);

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