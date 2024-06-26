package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

/*
 if 조건이 만족할 때는 true가 반환되지만,
 (else 문이 없는 경우) 조건을 만족하지 않으면 return 문이 실행되지 않아서
 return 문을 누락했다는 컴파일 오류(java: missing return statement) 발생
 따라서, 모든 조건이 만족하도록 로직 구성 필요
*/