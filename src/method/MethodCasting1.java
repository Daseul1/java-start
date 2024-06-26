package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); // double을 int에 대입해 컴파일 오류 java: incompatible types: possible lossy conversion from double to int 발생

        // 따라서 형변환 필요
        printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n); // 1
    }
}
