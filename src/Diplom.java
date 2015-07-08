import java.io.FileNotFoundException;

public class Diplom {

    private static int[] a;
    private static String InputArrayFileName = "d:/IdeaProjects/MergeSort/Resources/ArrayRead.txt"; // Diplom.class.getResource("Resources/ArrayRead.txt").toString();
    private static String resultArray = "d:/IdeaProjects/MergeSort/Resources/ResultArray.txt";




    public static void main(String[] args) throws FileNotFoundException { //Main method, entry point.
        System.out.println(InputArrayFileName);
//        WorkFile.write(InputArrayFileName, "1 0 5 1 8 3 0 2");
        String textFromFile = WorkFile.read(InputArrayFileName);
        System.out.println("Массив из файла: " + textFromFile);
        String[] str = textFromFile.split(",");
        a = new int [str.length];
//        System.out.println("'" + textFromFile + "'");
        for (int i = 0; i < str.length; i++) {
           try {
                a[i] = Integer.valueOf(str[i]);
                System.out.println("a[" + i +"] = " + a[i]);
            }
            catch (NumberFormatException e){

           }
        }
        MergeSort.setA(a);
        MergeSort.sort(a);
        for (int i = 0; i < str.length; i++) {
            System.out.println(MergeSort.getAi(i));

        }
         WorkFile.write(resultArray, a);
        a = MergeSort.getA();
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