package corejava.IOstream;

import java.util.StringTokenizer;

public class StreamClassDemo {
//    public static void main(String[] args) {
//        FileInputStream fis= null;
//        FileOutputStream fos=null;
//        try {
//            fis = new FileInputStream("F:/Phonix training task/src/corejava/Hello.txt");
//            fos=new FileOutputStream("F:/Phonix training task/src/corejava/Hellofixed.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        int i;
//        while(true){
//            try {
//                if (!((i=fis.read())!=-1)) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.print((char) i);
//            try {
//                fos.write((char)i);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        try {
//            fis.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }


//    public static void main(String[] args) throws IOException {
//        FileReader fr=null;
//        FileWriter fw=null;
//
//        try {
//            fr=new FileReader("F:/Phonix training task/src/corejava/Hello.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            fw=new FileWriter("F:/Phonix training task/src/corejava/FileWriter.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        int ch;
//        while ( (ch=fr.read()) != -1){
//            try {
//                fw.write(ch);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }

    public static void main(String[] args) {
        String s="You are the creater of the world";
        StringTokenizer st=new StringTokenizer(s,"a",true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}