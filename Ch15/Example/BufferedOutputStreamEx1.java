import java.io.*;

class BufferedOutputStreamEx1 {
    public static void main(String args[]) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt");
            // BufferedOutputStream의 버퍼 크기를 5로 한다.
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
            // 파일 123.txt에 1부터 9까지 출력한다.
            for (int i='1'; i<='9'; i++) {
                bos.write(i);
            }
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}