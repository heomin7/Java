/**
 * Created by danawacomputer on 2017-04-04.
 */
public class VarTypeExample {
    public static void main(String[] args){
        //integer type
        int myInt = 1_000_000_000;//-2^31 ~ 2^31 -1
        long myLong = 1_000_000_000_000_000_000L;//-2^64 ~ 2^64 - 1 (100경 정도...)
        //100경 정도 더 큰 것은 class 제공함

        //float
        double myDouble = 3.14; //java에서는 double만 사용하면 됨

        //string type
        String myStr = "Hello world";

        char myChar = 'a';

        //boolean type
        boolean myBool = true;

        System.out.println(myBool);



    }

}
