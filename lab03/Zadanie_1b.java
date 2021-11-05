import java.util.Scanner;
import java.util.Objects;
public class Zadanie_1b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj napis str: ");
        String str = in.nextLine();
        System.out.print("Podaj znak Substr: ");
        String SubStr = in.nextLine();
        System.out.println(""+SubStr+" powtarza sie "+countSubStr(str, SubStr)+" razy w napisie: "+str+"");
    }

    public static int countSubStr(String str, String SubStr) {
        int count = 0;
        for(int i = 0; i < str.length() - SubStr.length(); ++i)
            if (Objects.equals(str.substring(i, i + SubStr.length()), SubStr))
                ++count;
        return count;
    }
}
