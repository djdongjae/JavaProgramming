package data_structure.hw10_1;
public class Main_201914089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw10_1:오동재");

		// 정점은 6개이고 간선은 없는 방향 그래프 생성
		MatrixGraph graph = new MatrixGraph(6);
		
		// 7개의 간선 삽입
		graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 4);
        graph.insertEdge(0, 5);
        graph.insertEdge(3, 2);
        graph.insertEdge(5, 0);
        graph.insertEdge(5, 1);
        
        // 인접행렬 출력 
        graph.printAdjMatrix();
        
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
        graph.printAdjMatrix();

	}

}

class MatrixGraph {
	
	// 인스턴스 변수
	private int[][] matrix;
	private int n;
	
	// 정점 수를 매개변수로 받아 그래프를 생성
	public MatrixGraph(int n) {
		matrix = new int[n][n]; // 인접 행렬 초기화
		this.n = n; // 인접 행렬의 크기 변수 초기화
	}
	
	// 간선을 매개 변수로 받아 그래프에 삽입
	public void insertEdge(int v1, int v2) {
		if (v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) { // 해당 정점이 범위 밖에 존재하는 정점일 경우
			System.out.println("그래프에 없는 정점입니다!"); // 에러 메세지 출력
		} else { // 해당 범위 내의 정점들일 경우
			matrix[v1][v2] = 1; // 그래프 내 삽입
		}
	}
	
	// 인접행렬의 내용을 모두 출력
	public void printAdjMatrix() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " "); // 전체 순회 후 내용을 출력
			}
			System.out.println();
		}
	}
	
	// 정점을 매개변수로 받아 진출차수를 리턴
	public int outDegree(int v) {
		int count = 0; // 해당 정점의 진출차수 초기화
		for (int i = 0; i < n; i++) { // 정점에 해당하는 행을 순회하며 
			if (matrix[v][i] == 1) { // 해당 간선이 1일 경우
				count++; // 진출차수를 1 증가
			}
		}
		return count; // 진출차수를 리턴
	}
	
	// 간선을 매개변수로 받아 존재 여부를 리턴
	public boolean hasEdge(int v1, int v2) { 
		if (matrix[v1][v2] == 1) { // 해당 간선이 존재할 경우
			return true; // true 리턴
		} else { // 존재하지 않을 경우
			return false; // false 리턴
		}
	}

	// 간선을 매개변수로 받아 삭제
	public void deleteEdge(int v1, int v2) {
		if (v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) { // 해당 정점이 범위 밖에 존재하는 정점일 경우
			System.out.println("그래프에 없는 정점입니다!"); // 에러 메세지 출력
		} else { // 해당 범위 내의 정점들일 경우
			matrix[v1][v2] = 0; // 삭제
		}
	}
}