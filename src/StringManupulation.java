/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringManupulation {
    public static void main(String[] args){
        String name = "heo min";

        String[] splitName = name.split(" ");

        String sliceName = name.substring(0, name.indexOf(' '));

        System.out.println(sliceName);

        System.out.println(name);
        System.out.println(splitName[0] + " " + splitName[1]);
    }
}
