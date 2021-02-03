package com.haochang.aqs;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 描述：螺旋矩阵
 * @author: youzhi.gao
 * @date: 2021-02-03 09:17
 */
public class Matrix {
    public static void main(String[] args) {
        int len = 4;
        int num = 1;
        int[][] intMatrix = new int[len][len];
        for (int i = 0; i < len; i ++){
            for (int j = 0; j < len; j++) {
                System.out.println(num);
                intMatrix[i][j] = num++;
            }
        }

        List<Integer> result = matrix(intMatrix);

        System.out.println(Arrays.toString(result.toArray()));
    }

    private static List<Integer> matrix(int[][] intMatrix) {
        List<Integer> result = new ArrayList<>();

        if(null == intMatrix || intMatrix.length == 0 || intMatrix[0].length == 0){
            return result;
        }
        int rows = intMatrix.length;
        int columns = intMatrix[0].length;
        int total = rows * columns;
        int row = 0;
        int column = 0;
        boolean[][] visited = new boolean[rows][columns];
        int directionIndex = 0;
        int[][] directions = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int i = 0; i < total; i++) {
            result.add(intMatrix[row][column]);
            visited[row][column] = true;

            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            if(nextRow >= rows || nextColumn >= columns ||  nextColumn < 0 || nextRow < 0 || visited[nextRow][nextColumn]){
                directionIndex = (directionIndex + 1) % 4;
            }

            row += directions[directionIndex][0];
            column += directions[directionIndex][1];

        }

        return result;
    }
}
