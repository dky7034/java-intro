package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2 x 3 2차원 배열을 만들기
        int[][] arr = new int[10][10];

        // 반복문을 사용해서 2차원 배열에 값 넣기
        int input = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input++;
            }
        }

        // 반복문을 사용해서 2차원 배열 값 출력하기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
