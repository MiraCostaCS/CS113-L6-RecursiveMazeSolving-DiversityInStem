public class MyProgram {

    // Main method for testing
    public static void main(String[] args) {
        int[][] maze = {
            {0, 1, 0, 0},
            {0, 0, 0, 1},
            {1, 0, 1, 0},
            {0, 0, 0, 0}
        };
    
        int n = maze.length;
        int[][] solution = new int[n][n];
    
        if (solveMaze(maze, 0, 0, solution)) {
            System.out.println("Path found:");
            printSolution(solution);
        } else {
            System.out.println("No path found.");
        }
    }
}
