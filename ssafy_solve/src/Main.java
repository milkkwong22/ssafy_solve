import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
	int posX;
	int posY;
	int time;

	public Point(int posX, int posY, int time) {
		this.posX = posX;
		this.posY = posY;
		this.time = time;
	}

}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N;
	static int M;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { -1, 1, 0, 0 };
	static boolean[][] map;
	static boolean[][] visited;
	static Queue<Point> queue = new LinkedList<>();
	static LinkedList<Queue<Point>> queueList = new LinkedList<>();
	
	static int bfs() {
		int depth = 0;
		queueList.add(new LinkedList<>());
		queueList.add(new LinkedList<>());
		queueList.get(0).add(new Point(0, 0, 0));
		
		while(!queueList.isEmpty()) {
			Queue<Point> presentQueue = queueList.getFirst();
			Queue<Point> nextQueue = queueList.getLast();
			while (!presentQueue.isEmpty()) {
				
			}
		}
		
		
		return 0;
	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int input = Integer.parseInt(st.nextToken());
				if (input == 1) {
					map[i][j] = true;
				} 
				
			}
		}

	}

}
