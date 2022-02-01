package Z3;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Zad3 {
    public static void main(String[] args){
        File files[] = new File("C:/").listFiles();
        for (File e:files)
            System.out.print(e.getName()+",");
        System.out.println();

        sortFiles(files);
        for (File e:files)
            System.out.print(e.getName()+",");

    }
    public static void sortFiles(File files[]) {
        Comparator<File> comparator = (x,y)-> {
            if ((x.isDirectory() && y.isDirectory()) || (x.isFile() && y.isFile()))
                return x.getName().compareTo(y.getName());
            if (x.isDirectory() && y.isFile())
                return -1;
            if(x.isFile() && y.isDirectory())
                return 1;
            return 0;
        };
        Arrays.sort(files, comparator);
    }
}
