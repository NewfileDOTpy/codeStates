import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        # 배열 범위 초과
//        int[] array = {2,4,6};
//        System.out.println(array[3]);
// ---------------------------------------------
//        # ')' expected
//        int i;

//        for (i=1; i<=5; i++{     컴파일 에러
//            System.out.println(i);
//        }
//-----------------------------------------------
//        # 0으로 나누었을때 ArithmeticException발생
//        System.out.println(4*4);
//        try{
//            System.out.println(4/0);  // 예외발생  특정 숫자를 0으로 나눴을때 발생  런타임 에러 JVM에서 감지
//        }
//        catch (Exception e2) {
//            System.out.println("런타임?");
//        }
//        catch (ArithmeticException e){
//            System.out.println("0으로 나눔!");
//        }
//        finally {
//            System.out.println("오류 클리어!");
//        }
//-----------------------------------------------
//        # 예외 정보 얻기
//        try {
//            System.out.println("[소문자 알파벳 출력 프로그램]");
//            printMyName(null);
//            printMyName("abc");
//        }catch (ArithmeticException e){
//            System.out.println("ArithmeticException 에러 발생!");
//
//        }
//        catch (NullPointerException e2){
//            System.out.println("NullPointerException 에러 발생");
//            System.out.println("e.getMessage:" + e2.getMessage());  // 예외정보 얻기 1
//            System.out.println("e.toString:"+ e2.toString());  // 예외정보 얻기 2
//            e2.printStackTrace(); //예외정보 얻기 3
//        }
//        finally {
//            System.out.println("[프로그램 종료]");
//        }
//    }
//
//    static void printMyName(String str){
//        String upperCaseAlphabet = str.toUpperCase();
//        System.out.println(upperCaseAlphabet);

        try {
            //exceptionPrac();
           throwException();
        }
        catch (Exception e) {
            System.out.println("오류2");
        }
    }

    static void throwException() throws ClassNotFoundException{
        Class.forName("?");


    }

    static void exceptionPrac () throws Exception{
        System.out.println("오류발생");
    }
}

/* 컴파일 에러 : 자바 컴파일러가 오류를 감지함, IDE에서부터 친절하게 빨간줄을 그어줌
*  런타임 에러 : JVM에서 감지 즉 IDE나 컴파일러에서 감지되지 않음.
*
*
* */

