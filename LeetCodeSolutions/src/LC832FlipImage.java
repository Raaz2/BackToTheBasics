public class LC832FlipImage {
  // LC832 Flip Image
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for (int[] row : image) {
            for (int i : row) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
        image = flipAndInvertImage(image);
        for (int[] row : image) {
            for (int i : row) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }


    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return image;
    }
}
