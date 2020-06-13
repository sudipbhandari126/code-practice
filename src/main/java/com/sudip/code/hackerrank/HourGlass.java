package com.sudip.code.hackerrank;

public class HourGlass {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        System.out.println(hourglassSum(arr));
    }


    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("rows=" + rows + " and cols=" + cols);

        for (int i=0; (i+3)  <= (arr.length);i++){
            for (int j=0;(j+3) <= (arr[i].length);j++){
                System.out.println("max sum called with i=" + i + " and j=" + j);
                maxSum=Math.max(sumBox(arr,i,j),maxSum);
            }
        }
        return maxSum;
    }


    private static int sumBox(int[][] arr,int i, int j){
        //sum in hourglass (3X3)
        int sum=0;
        for (int x = i; x<(i+3); x++){
            for (int y=j;y<(j+3); y++){
                if (x==(i+1) && ((y==0)||(y==2))) continue;
                //System.out.println("x=" + x + " and y=" + y);
                sum+=arr[x][y];
            }
        }
        return sum;
    }

}
