/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringExample {
    public static void main(String[] args){
        String myStr = "Hello world!";
        String myStr2 = "안녕하세요";

        String result = myStr + myStr2;

        String result2 = myStr + 3;

        String name = "soongon";


     //   String sliced = myStr.toLowerCase(); // 소문자로 모두 바꿔줌

     //   String sliced = myStr.substring(0,5); // 문자열 인덱스 0~ 5까지 출력

//        boolean sliced = myStr.contains("wor"); // 해당 문자열을 포함하고 있는지 체크, 리턴값 True, false

        String firstCharacter = name.substring(1, 7);
        String reminder = name.substring(0, 1);

        name = firstCharacter + reminder + "ay";

        System.out.println(name);

    //    System.out.println(sliced);

        System.out.println(result);

        System.out.println(result2);

    }
}








