package MinimumPathSum_LT_64;

public class MyApproach {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int answer = minPathSum(grid);
        System.out.println(answer);
    }

    public static int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        return minimumPaths(grid, m - 1, n - 1, sum);

    }

    public static int minimumPaths(int[][] grid, int m, int n, int sum) {
        if (m < 0 || n < 0 || m >= grid.length || n >= grid[0].length) {
            return 0;
        }
        sum += grid[m][n];

        if (grid[m - 1][n] > grid[m][n - 1]) {
            sum += minimumPaths(grid, m, n - 1, sum);
        }
        else if (grid[m][n - 1] > grid[m - 1][n]) {
            sum += minimumPaths(grid, m - 1, n, sum);
        }
        return sum;

   }
}
