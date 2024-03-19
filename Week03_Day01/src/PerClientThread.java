
import java.io.*;
import java.net.*;
import java.util.*;
class PerClinetThread extends Thread {
	
    // ArrayList 객체를 여러 스레드가 안전하게 공유할 수 있는 동기화된 리스트로 만듭니다.
    static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

    Socket socket;
    PrintWriter writer;
    
    PerClinetThread(Socket socket) {
        this.socket= socket;  // 객체 주입 -> 외부에서 오는 소켓으로 생성자 주입
        try {
            writer = new PrintWriter(socket.getOutputStream());  // 소켓의 아웃풋스트림 생성 하고 다시 라이터 객체 만들기
            list.add(writer); // 프린트라이터 탑입 객체를 list에 넣기.-> 클라이언트별 프린터라이터 객체를 담기
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void run() {
        String name = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 버퍼리더 생성
	    
            // 수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장
            name = reader.readLine();           
            sendAll("#" + name + "님이 들어오셨습니다");
            while (true) {
                String str = reader.readLine();// 대화내용을 문자열별로 str에 담기
                if (str == null) 
                    break;
                sendAll(name + ">" + str);  // 수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            list.remove(writer);
            sendAll("#" + name + "님이 나가셨습니다"); // 사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보냅니다.
            try {
                socket.close();
            }
            catch (Exception ignored) {
            }
        }
    }
	
    // 서버에 연결되어 있는 모든 클라이언트로 똑같은 메시지를 보냅니다.
    private void sendAll(String str) {  
        for (PrintWriter writer : list) { // 버퍼에 담긴 내용을 다시 클라이언트별로 보내기
            writer.println(str);
            writer.flush();
        }
    }
}
