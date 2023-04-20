package SnakesAndLadders_LT_909;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class myApproach {
    public static void main(String[] args) {
        int[][] board = {{-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}};


        int answer = snakesAndLadders2(board);
        System.out.println(answer);
    }
//
//    public static int snakesAndLadders(int[][] board) {
//
//        Queue<Integer> q = new ArrayDeque<>();
//
//        q.add(1);
//
//        int level = 1;
//        Set<Integer> visited = new HashSet<>();
//
//        while (!q.isEmpty()) {
//
//            //no of elements in each level
//            //initially one is added
//            int count = q.size();
//
//            for (int i = 0; i < count; i++) {
//
//                //now queue is empty
//                int current = q.poll();
//
//                for (int d = 1; d <= 6; d++) {
//
//                    //current =1, here we go from 2 to 7
//                    int updated = current + d;
//
//                    // within range
//                    if (updated <= Math.pow(board.length, 2)) {
//
//                        // snake and ladder logic
//
//                        if (board[board.length - level][d-1] != -1) {
//                            updated = board[board.length - level][d-1];
//                            if (updated == Math.pow(board.length, 2)) return level;
//                        }
//                    }
//                    if (!visited.add(updated)) continue;
//                    q.add(updated);
//                }
//            }
//            level++;
//        }
//        return -1;
//    }


    public static int snakesAndLadders2(int[][] board)  {

        int n = board.length;

        Queue<Integer> q = new ArrayDeque<Integer>();

        q.add(1);

        int level = 1;
        Set<Integer> visited = new HashSet<>();

        while (!q.isEmpty()) {

            int count = q.size();

            for (int i=0; i<count; i++) {

                int current = q.poll();

                for (int d=1; d<=6; d++){

                    int updated = current+d;
                    // within range
                    if (updated > n*n) break;

                    // snake and ladder logic
                    int row = (updated-1)/n;
                    int col;
                    if ((row)%2==0) {
                        col = (updated-1)%n;
                    } else {
                        col = n-(updated-1)%n-1;
                    }
                    int boardValue = board[n-row-1][col];

                    if (boardValue != -1){
                        updated = boardValue;
                    }

                    if (updated == n*n) return level;

                    if (!visited.add(updated)) continue;

                    q.add(updated);

                }

            }
            level++;

        }

        return -1;

    }
}

