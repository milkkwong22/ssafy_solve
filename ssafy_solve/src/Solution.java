import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Atom {
	
	int posX;
	int posY;
	int direction;
	int energy;
	ArrayList<Integer> impactList = new ArrayList<>();
	
	public Atom(int posX, int posY, int direction, int energy) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.direction = direction;
		this.energy = energy;
	}
	
}하

static void search(Atom atom1, Atom atom2) {
	int d = 0;
	if (atom1.posX == atom2.posX) {
		if (atom1.direction == 0 && atom2.direction == 1) {
			d = (atom2.posY - atom1.posY)/2;
		} else if (atom1.direction == 1 && atom2.direction == 0 ) {
			d = (atom1.posY - atom2.posY)/2;
		}
	} else if (atom1.posY == atom2.posY) {
		if (atom1.direction == 2 && atom2.direction == 3) {
			d = (atom1.posX - atom2.posX)/2;
		} else if (atom1.direction == 3 && atom2.direction == 2) {
			d = (atom2.posX - atom1.posX)/2;
		}
	} else if (atom1.posX - atom2.posX == atom1.posY - atom2.posY) {
//		if (atom1.direction) {
//	}
	
}


public class Solution {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static ArrayList<Atom> atoms;
	static int result;


	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			result = 0;
			// 입략
			int N = Integer.parseInt(br.readLine());
			for (int i = 0 ; i < N ; i ++) {
				st = new StringTokenizer(br.readLine());
				atoms.add(new Atom(
						Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken())
						));
			}
			

		}
		bw.flush();

	}

}
