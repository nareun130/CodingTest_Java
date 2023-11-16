package practice;

import java.util.Scanner;

public class Ice {
	public static int n, m;
	public static int[][] graph = new int[1000][1000];

	// DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
	public static boolean dfs(int x, int y) {
		// 주어진 범위를 벗어나는 경우 즉시 종료
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}

		// 현재 노드를 아직 방문 하지 않았다면
		if (graph[x][y] == 0) {
			// 해당 노드 방문 처리 
			graph[x][y] = 1;
			// 상하좌우 위치 모드 재귀적으로 호출
			dfs(x - 1, y);
			dfs(x, y - 1);
			dfs(x + 1, y);
			dfs(x, y + 1);

			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// n,m 입력 받기
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기

		// 2차원 리스트의 맵 정보 입력받기
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {

				graph[i][j] = str.charAt(j) - '0';
//				graph[i][j] = sc.nextInt();
			}
		}

		// 모든 노드(위치)에 대하여 음료수 채우기
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 현재 위치에서 DFS 수행
				if (dfs(i, j)) {
					result += 1;
				}
			}
		}
		System.out.println(result);

	}
}
