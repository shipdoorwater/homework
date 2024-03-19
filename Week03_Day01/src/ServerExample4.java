import java.net.*;
class ServerExample4 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null; // 지금은 서버소켓이 null 인 상태
        try {
            serverSocket = new ServerSocket(9002);  // 서버소켓 생성
            while (true) { 
                Socket socket = serverSocket.accept();  // 클라이언트 요청이 오면 소켓 생성 무한루프 
                Thread thread = new PerClinetThread(socket); // 생성된 소켓은 PerClientThread로 생성
                thread.start(); 
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
