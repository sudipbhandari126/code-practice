package com.sudip.random;




public class Zomentum {

/*


n +ve

3

1 2 3
    4
    5


 x x x
 x x x
 x x x


 right(n), down(n), left(n),     up(n-1) right(n-1) down(n-1) left (n-1)

 0 0 0
 0 0 0
 0 0 0

 fillValues(grid, 0, 0, 1)


 fillValues(int[][] grid, int i, int j, int prevValue){
 //change direction when you reach edge, or encounter non zero
 if (i < 0 || i> n || j<0 || j > n || grid[i][j]!=0) return;

 grid[i][j]=prevValue;
 fillValues(grid, i, j+1, prevValue++);

 fillValues(grid, i+1, j, prevValue++);

   fillValues(grid, i, j--, prevValue++);

    fillValues(grid, i-1, j, prevValue++);

 }



 */


    private static void fillValues(int[][] grid, int i, int j, int prevValue, int n, String msg){
        //change direction when you reach edge, or encounter non zero
        if (i < 0 || i>= n || j<0 || j >= n || grid[i][j]!=0) return;

        grid[i][j]=prevValue;
        //System.out.println(msg);

        //right
        fillValues(grid, i, j+1, prevValue+1,n,"right");

        //down
        fillValues(grid, i+1, j, prevValue+1,n,"down");

        //left
        fillValues(grid, i, j-1, prevValue+1,n,"left");

        //up
        fillValues(grid, i-1, j, prevValue+1,n,"up");

    }

    public static void main(String[] args) {

        int n = 4;
        int[][] grid = new int[n][];

        for (int i=0;i<n;i++){
            grid[i] = new int[n];
        }

        fillValues(grid,0,0,1,n,"right");

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }


    }





}
