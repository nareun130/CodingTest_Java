package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	private int x;
	private int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

public class Maze {
	public static int n, m;
	public static int[][] graph = new int[201][201];

	// 이동할 네 방향 (상, 하, 좌, 우)
	public static int dx[] = { -1, 1, 0, 0 };
	public static int dy[] = { 0, 0, -1, 1 };

	public static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x, y));

		// 큐가 빌 때까지 반복
		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			// 현재 위치에서 4가지 방향으로 위치 확인
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				// 미로찾기 공간을 벗어나면 무시
				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;

				// 괴물이 있으면 무시
				if (graph[nx][ny] == 0)
					continue;
				// 해당 노드를처음 방문하는 경우에만 최단거리 기록
				if (graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node(nx, ny));
				}
			}
		}
		// 가장 오른쪽 아래까지의 최단거리 반환
		return graph[n - 1][m - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		// 버퍼 지우기
		sc.nextLine();

		// 맵 정보 입력 받기
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		System.out.println(bfs(0, 0));
	}

}
