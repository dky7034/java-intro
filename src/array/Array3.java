package array;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화

        // 배열의 위치를 나타내는 숫자를 index 라고 함
        // 인덱스(index)는 0부터 시작함
//        arr[0] = 100;
//        arr[1] = 24;
//        arr[2] = 39;
//        arr[3] = 40;
//        arr[4] = 59;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("학생: " + (i+1) + ", 점수: " + arr[i]);
        }
    }
}
