package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력: a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력: a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력: a * b = 10

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 출력:  a / b = 2
        // int 형끼리 계산하면 결과값다 int 형으로 출력됨 => 소수점 숫자는 사라지게 되는 것

        //  나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력: a % b = 1

//        int z = 10 / 0; // 0으로 나누는 것은 수학에서 혀용되지 않으므로 예외 에러 발생
                          // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
