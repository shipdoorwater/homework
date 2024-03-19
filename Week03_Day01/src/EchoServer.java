import java.io.*;
import java.net.*;

public class EchoServer {
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverS;

	public EchoServer(int port) {
		try {
			serverS = new ServerSocket(port); // 서버소켓 생성
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		while (true) {
			try {
				System.out.println("클라이언트의 요청을 기다리는 중");
				Socket tcpSocket = serverS.accept();   // 무한루프 돌면서 클라이언트의 요청을 기다리다가 요청이 오면 클라이언트의 소켓과 연결되는 소켓 생성

				System.out.println("클라이언트의 ip주소 : " + tcpSocket.getInetAddress().getHostAddress());  
				// 클라이언트 ip주소 출력

				is = tcpSocket.getInputStream(); 
				os = tcpSocket.getOutputStream();
				bufferR = new BufferedReader(new InputStreamReader(is));
				bufferW = new BufferedWriter(new OutputStreamWriter(os));
				// 소켓의 버퍼 리더, 라이터 생성

				String message = bufferR.readLine(); // Message 에서는 버퍼리더를 통해 읽은 데이터 담기
				System.out.println("수신메시지 : " + message);
				message += System.getProperty("line.separator");
				bufferW.write(message); // 메시지를 다시 버퍼라이터를 통해 데이터 출력
				bufferW.flush(); // 버퍼 비워내기
				bufferR.close();
				bufferW.close();
				tcpSocket.close(); // 종료 프로세스
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new EchoServer(4000);
	}
}
