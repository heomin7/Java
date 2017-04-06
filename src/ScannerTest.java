import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ScannerTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("단어를 입력하시고 엔터를 치세요.");
      //  in.nextLine(); //프로그램이 일시 정지되고 입력을 기다림, enter키 받으면 in 객체에 값이 받아짐


        String inputted = in.nextLine();

        System.out.println("키보드로 입력한 글자는:" + inputted);

        int strCount = (inputted.length()) * (inputted.length());

        String revise = inputted.substring(0,1).toUpperCase() + inputted.substring(1);


        System.out.println("$$" + revise + strCount + "##");




    }
}
