package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 println() : 출력후 다음 라인으로 넘어간다.
 print() : 라인을 넘기지 않고 출력한다.
*/
