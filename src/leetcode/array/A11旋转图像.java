package leetcode.array;

/**
 * 旋转图像
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 * 示例 1:
 *
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 * 示例 2:
 *
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 */

public class A11旋转图像 {

    /**
     * 旋转 = 转置 + 翻转
     * @param matrix
     */
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        if (n == 1) return;

        // 转置
        for (int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                exchange(matrix, i, j, j, i);
            }
        }

        // 翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                exchange(matrix, i, j, i, n-1-j);
            }
        }

    }


    public void exchange(int[][] matrix, int i, int j, int k, int l) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = tmp;
    }

}
