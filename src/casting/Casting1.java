package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue); // doubleValue = 10.0 : 자동 형 변환도 이루어짐

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue );
    }
}
