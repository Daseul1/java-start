package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i<3);
    }
}

// 출력 결과
// 현재 숫자는: 10

/*
do-while 문은 최초 한번 항상 실행 됨.
실행 후, 조건식을 검증해서 true 이면 다시 실행하고, false 이면 do-while 문을 빠져나오게 됨.
*/
