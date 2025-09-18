package operator.ex;

public class OperationEx2 {
    // public: 접근제한자 (모든 곳에서 접근 가능)
    // static: 해당 메서드가 객체를 생성하지 않고도 실행될 수 있음. Heap 영역이 아닌 메서드 영역에 로드됨
    // void: 반환값을 가지지 않음.
    // main: 메서드 이름
    // String[] args: String 타입의 빈 배열 args를 의미함
    public static void main(String[] args) {
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;
        double avg = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
