package basic;

import java.util.ArrayList;

class Node {
	private int index;
	private int distance;

	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}

	public void show() {
		System.out.print("(" + this.index + "," + this.distance + ")");
	}
}

public class AdjancyList {

	// 행 3개인 인접 리스트 -> 2차원 리스트
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			graph.add(new ArrayList<Node>());
		}
		// 노드 0에 연결된 노드 정보
		graph.get(0).add(new Node(1, 7));
		graph.get(0).add(new Node(2, 5));
		// 노드 1에 연결된 노드 정보
		graph.get(1).add(new Node(0, 7));
		// 노드 2에 연결된 노드 정보
		graph.get(2).add(new Node(0, 5));

		// 그래프 출력
		for (int i = 0; i < graph.size(); i++) {
			for (int j = 0; j < graph.get(i).size(); j++) {
				graph.get(i).get(j).show();
			}
   			System.out.println();
		}
	}

}
