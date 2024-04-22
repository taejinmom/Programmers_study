package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputText {
    private ReadInputText(){}
    private static class SingletonHelper{
        private static final ReadInputText INSTANCE = new ReadInputText();
    }

    public static ReadInputText getInstance(){
        return SingletonHelper.INSTANCE;
    }

    // InputStreamReader - bufferedReader

        // 입력 한번 받기
        public void UseBufferedReader() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.print("입력하세요 : ");
                // 입력 데이터 읽기
                String str = reader.readLine();
                // 입력 데이터 출력
                System.out.println("입력 값 :" + str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // 여러번 데이터 받기
        public void UseBufferedReaderMultiple() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = "";
                while ((str = reader.readLine()) != null){
                    System.out.println(str);
                }
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
}
