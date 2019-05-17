package maze;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maze {

	public static void main(String[] args) throws Exception {
		
		////// ���� �б� //////////////////////////
		String fileName = "E:\\���̺귯��\\����\\eclipse-workspace\\text//maze.txt"; // ���ϸ�
		Scanner scan = new Scanner(new File(fileName)); // ��ĳ�� ��ü ����
		List<String> inStr = new ArrayList<String>(); // ���� ������ �о ������ ��Ʈ�� ����Ʈ

		while (scan.hasNext()) // �о�ͼ� ����
			inStr.add(scan.next());
		scan.close();
		/////////////////////////////////////////
		// �̷� ���� ////////////////
		int[][] maze = new int[100][100]; // �̷θ� ���� �迭

		int mazeRow = inStr.size(); // �̷� ����ũ��
		int[] mazeCol = new int[mazeRow]; // �̷� ���� ũ�⸦ ���� �迭 ����

		for (int i = 0; i < inStr.size(); i++) {
			mazeCol[i] = inStr.get(i).split(",").length; // ���� ũ�� ���
		}

		String[] temp;
		for (int i = 0; i < inStr.size(); i++) {
			temp = inStr.get(i).split(",");
			for (int j = 0; j < mazeCol[i]; j++) {
				maze[i][j] = Integer.parseInt(temp[j]);
			}
		}

		//�ʱⰪ ���� //////////////////////////////////////
		int startX = 1;
		int startY = 1;
		int endX = mazeCol[mazeRow-1]-2;
		int endY = mazeRow-2;
		setPath(maze,startX,startY);
		setPath(maze,endX,endY);
		printMaze(maze, mazeRow, mazeCol);
		
		
		Cord start = new Cord(startX,startY);
		Cord end = new Cord(endX,endY);
		///////////////////////////////////////////////////
		/* ���⼭���� ¥����*/
		List<Cord> cList = new ArrayList<Cord>();
		
		
		
		
		
		
		///////////////////////////////////////////
		printMaze(maze, mazeRow, mazeCol);

	}
	
	
	
	
	
	
	static void pathFind(int[][] maze, Cord nowCord , List<Cord> cList) {
		
	}
	
	static void resetPath(int[][] maze , int cordX , int cordY) {	// ������ �ǵ�����
		maze[cordY][cordX] = 1;
	}
	
	static void setPath(int[][] maze , int cordX , int cordY) {	// �� ����
		maze[cordY][cordX] = 9;
	}

	static void printMaze(int[][] maze, int mazeRow, int mazeCol[]) {	// ����Ʈ

		for (int i = 0; i < mazeRow; i++) {
			for (int j = 0; j < mazeCol[i]; j++)
				System.out.print(maze[i][j]);
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}

}
