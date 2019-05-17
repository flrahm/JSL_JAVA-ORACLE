package maze;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maze {

	public static void main(String[] args) throws Exception {
		
		////// 파일 읽기 //////////////////////////
		String fileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text//maze.txt"; // 파일명
		Scanner scan = new Scanner(new File(fileName)); // 스캐너 객체 생성
		List<String> inStr = new ArrayList<String>(); // 파일 내용을 읽어서 저장할 스트링 리스트

		while (scan.hasNext()) // 읽어와서 대입
			inStr.add(scan.next());
		scan.close();
		/////////////////////////////////////////
		// 미로 생성 ////////////////
		int[][] maze = new int[100][100]; // 미로를 담을 배열

		int mazeRow = inStr.size(); // 미로 세로크기
		int[] mazeCol = new int[mazeRow]; // 미로 가로 크기를 담을 배열 선언

		for (int i = 0; i < inStr.size(); i++) {
			mazeCol[i] = inStr.get(i).split(",").length; // 가로 크기 계산
		}

		String[] temp;
		for (int i = 0; i < inStr.size(); i++) {
			temp = inStr.get(i).split(",");
			for (int j = 0; j < mazeCol[i]; j++) {
				maze[i][j] = Integer.parseInt(temp[j]);
			}
		}

		//초기값 세팅 //////////////////////////////////////
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
		/* 여기서부터 짜세요*/
		List<Cord> cList = new ArrayList<Cord>();
		
		
		
		
		
		
		///////////////////////////////////////////
		printMaze(maze, mazeRow, mazeCol);

	}
	
	
	
	
	
	
	static void pathFind(int[][] maze, Cord nowCord , List<Cord> cList) {
		
	}
	
	static void resetPath(int[][] maze , int cordX , int cordY) {	// 설정값 되돌리기
		maze[cordY][cordX] = 1;
	}
	
	static void setPath(int[][] maze , int cordX , int cordY) {	// 값 설정
		maze[cordY][cordX] = 9;
	}

	static void printMaze(int[][] maze, int mazeRow, int mazeCol[]) {	// 프린트

		for (int i = 0; i < mazeRow; i++) {
			for (int j = 0; j < mazeCol[i]; j++)
				System.out.print(maze[i][j]);
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}

}
