import java.util.Scanner;
public class Solution {

	static class Matrix {
		// Define properties here
		 int[][] array;
		int rows;
		int columns;
			
		// Define constructor here
		public Matrix(int rows, int columns){
			this.rows=rows;
			this.columns=columns;
			this.array=new int[rows][columns];
		}
		
		void input(Scanner sc){
			// Use the Scanner object passed as argument for taking input and not a new Scanner object
			// Complete the function
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					array[i][j]=sc.nextInt();
				}
			}
			
		}
		
		Matrix add(Matrix x){
			// Complete the function
			int[][] ans=new int[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					ans[i][j]=this.array[i][j]+x.array[i][j];
				}
			}
			Matrix suMatrix= new Matrix(rows, columns);
			suMatrix.array=ans;
			return suMatrix;
		}
		
		Matrix subtract(Matrix x){
			// Complete the function
			int[][] ans=new int[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					ans[i][j]=this.array[i][j]-x.array[i][j];
				}
			}
			Matrix suMatrix= new Matrix(rows, columns);
			suMatrix.array=ans;
			return suMatrix;
		}
			
		Matrix transpose(){
			// Complete the function
			int[][] ans=new int[columns][rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					ans[i][j]=this.array[j][i];
				}
			}
			Matrix suMatrix= new Matrix(columns, rows);
			suMatrix.array=ans;
			return suMatrix;
		}
		
		void print(){
			// Complete the function
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(this.array[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	/*
		Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
		a.input() 
		Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
		b.input()
		Matrix c1 = a.add(b)
		Matrix c2 = a.subtract(b)
		Matrix c3 = a.transpose()
		a.print()
	*/
	
}