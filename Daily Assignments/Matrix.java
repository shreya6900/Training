package day45;

public class Matrix 
{
	    private int a[][];
	    public Matrix(int r, int c) {
	        a = new int[r][c];
	    }
	    public void fillMatrix(int[][] values) {
	        if (values.length != a.length || values[0].length != a[0].length) {
	            System.out.println("Error");
	            return;
	        }

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[0].length; j++) {
	                a[i][j] = values[i][j];
	            }
	        }
	    }

	    public void printMatrix() {
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[0].length; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) 
	    {
	            int[][] values = { {2,1,5}, {3,7,4}, {9,8,3} 
	      };
	        Matrix a = new Matrix(3, 3);
	        a.fillMatrix(values);
	        System.out.println("Matrix:");
	        a.printMatrix();
	    }
	}