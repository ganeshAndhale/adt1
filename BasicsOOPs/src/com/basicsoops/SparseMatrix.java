package com.basicsoops;

import java.util.Scanner;

public class SparseMatrix {
	int arr[][];
	int row, col;
	public static Scanner sac = new Scanner(System.in);
	
	public void addToArray(int row, int col) {
		this.row = row;
		this.col = col;
		arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j<col; j++) {
				int n = sac.nextInt();
				arr[i][j] = n;
			}
			
		}
		showArray(row, col);
	}
	
	public void showArray(int row, int col) {
		System.out.println(" Array is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void tupleView() {
		System.out.println("The 3-tuple representation of the matrix is:\n");
		System.out.print("Row \t");
		System.out.print("Column \t");
		System.out.println("Value\n");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] != 0) {
					System.out.print(i + " ");
					System.out.print(j + " ");
					System.out.println(arr[i][j] + " ");
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter row");

		int row = sac.nextInt();
		System.out.println("Enter column");
		int col = sac.nextInt();
		
		SparseMatrix sm = new SparseMatrix();
		
		sm.addToArray(row, col);
		sm.tupleView();

	}

}
