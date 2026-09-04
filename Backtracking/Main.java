package Backtracking;

public class Main {
    static void main() {
        System.out.println(count(3,3));
    }

    // from 0,0 to 2,2
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    // Rat in a maze
    // Setting up again to start the project on my local
    // seeting up java again
}
