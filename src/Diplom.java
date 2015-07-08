import java.io.FileNotFoundException;

public class Diplom {

    private static int[] a;
    private static String fileName = "c://Users//John//IdeaProjects//MergeSort//src//ArrayRead.txt";
    private static String resultArray = "c://Users//John//IdeaProjects//MergeSort//src//ResultArray.txt";



    public static void main(String[] args) throws FileNotFoundException { //Main method, entry point.
        WorkFile.write(fileName, "1 0 5 11 8 3 0 2 ");
        String textFromFile = WorkFile.read(fileName);
        System.out.println(textFromFile);
        String[] str = textFromFile.split(" ");
        a = new int [str.length];
        for (int i = 0; i < str.length; i++) {
            try {
                a[i] = Integer.valueOf(str[i]);
                System.out.println(a[i]);
            }
            catch (NumberFormatException e){

            }
        }
        MergeSort.sort(a);
        for (int i = 0; i < str.length; i++) {
            System.out.println(MergeSort.getA());
        }
//        for (int i = 0; i <textFromFile.length(); i++){
//            a[i]=Integer.parseInt(String.valueOf(textFromFile.charAt(i)));
//        }
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }
        //       MergeSort.sort(textFromFile);
//        a = getArray();
//        printArray(a);
//        sort(a);
//        System.out.println();
//        printArray(a);
    }


}