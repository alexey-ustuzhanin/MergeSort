import java.io.*;

public class WorkFile {

//    private static String fileName = "c://Users//John//IdeaProjects//MergeSort//src//ArrayRead.txt";

    public static void write(String fileName, String text) {
        //���������� ����
        File file = new File(fileName);

        try {
            //���������, ��� ���� ���� �� ���������� �� ������� ���
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter ��������� ����������� ������ � ����
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //���������� ����� � ����
                out.print(text);
            } finally {
                //����� ���� �� ������ ������� ����
                //����� ���� �� ���������
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void write(String fileName, int[] arr){
        File file = new File(fileName);

        try {
            //���������, ��� ���� ���� �� ���������� �� ������� ���
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter ��������� ����������� ������ � ����
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //���������� ����� � ����
                for(int i = 0; i < arr.length; i++){
                    out.print(arr[i]);
                        if(i < arr.length-1){
                            out.print(",");
                        }

                }

            } finally {
                //����� ���� �� ������ ������� ����
                //����� ���� �� ���������
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void exists(String fileName) throws FileNotFoundException { //Proverka nalichiya faila
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
    public static String read(String fileName) throws FileNotFoundException {
        //���� ����. ������ ��� ���������� ������
        StringBuilder sb = new StringBuilder();

        exists(fileName);

        try {

            //������ ��� ������ ����� � �����
            File file = new File(fileName);
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //� ����� ��������� ��������� ����
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);

//                    sb.append("\n");
                }
            } finally {
                //����� �� �������� ������� ����
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //���������� ���������� ����� � �����
        return sb.toString();
    }




}
