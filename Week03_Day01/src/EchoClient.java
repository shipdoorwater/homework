
import java.io.*;
import java.net.*;

public class EchoClient {
	private String ip;
	private int port;
	private String str;
	BufferedReader file;

	public EchoClient(String ip, int port) throws IOException {
		this.ip = ip;
		this.port = port;
		Socket tcpSocket = getSocket(); // 클라이언트의 소켓 생성
		OutputStream os_socket = tcpSocket.getOutputStream(); // 소켓의 아웃풋스트림 생성
		InputStream is_socket = tcpSocket.getInputStream(); // 소켓의 인풋스트림 생성

		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));
		// OutputStreamWriter를 이용하여 아웃풋스트림에 문자를 쓰는 기능을 제공 (고정배열)
		// BufferdWriter를 통해 가변적인 길이의 버퍼에 문자를 쓰는 기능을 제공
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is_socket));
		// InputStreamReader를 이용하여 인풋스트림에 문자를 읽는 기능을 제공 (고정배열)
		// BufferdReader를 통해 가변적인 길이의 버퍼에 문자를 읽는 기능을 제공
		
		System.out.print("입력 : ");
		file = new BufferedReader(new InputStreamReader(System.in)); // file이라는 입력받는 버퍼리더 새로 생성
		str = file.readLine(); // BufferedReader는 한 줄 씩 읽는 readLine() 메서드 제공
		str += System.getProperty("line.separator");  // \n 랑 같고 str 문자열에는 새로운 줄이 추가된 상태가 됨
		bufferW.write(str); // str에 저장된 버퍼를 소켓으로 출력, write() 메소드를 통해 데이터출력 : 출력의 의미는 데이터가 네트워크로 전송된다는 의미
		bufferW.flush(); // 버퍼에 남아있는 데이터를 다 내보내는 기능 <- 이거 하지 않으면 안된다.
		str = bufferR.readLine(); // BufferReader를 사용하여 다시 외부에서 오는 인풋스트림으로부터 데이터를 읽음 
		System.out.println("Echo Result : " + str); // >> 에코 메시지 출력

		file.close();
		bufferW.close();

		bufferR.close();
		tcpSocket.close();
	}

	public Socket getSocket() { // 생성자
		Socket tcpSocket = null;
		try {
			tcpSocket = new Socket(ip, port); // 클라이언트에서 소켓 생성
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		return tcpSocket;
	}

	public static void main(String[] args) throws IOException {
		new EchoClient("192.168.0.73", 3000);
	}
}
