import java.util.Arrays;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        int startColor = image[sr][sc];
        image[sr][sc] = color;
        if ((sr - 1 >= 0) && (image[sr-1][sc] == startColor))      // cell above exists; call floodFill on it
            image = floodFill(image, sr - 1, sc, color);
        if (sr + 1 < image.length && (image[sr+1][sc] == startColor))
            image = floodFill(image, sr + 1, sc, color);
        if (sc - 1 >= 0 && (image[sr][sc-1] == startColor))
            image = floodFill(image, sr, sc - 1, color);
        if (sc + 1 < image[0].length && (image[sr][sc+1] == startColor))
            image = floodFill(image, sr, sc + 1, color);
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(Arrays.deepToString(image));
        image = (floodFill(image,1,0,1));
        System.out.println();
        System.out.println(Arrays.deepToString(image));
    }
}
