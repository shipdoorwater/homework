import java.net.*;
class ClientExample4 {
    public static void main(String[] args) {
        if (args.length != 1) { // args의 길이가 \1인 경우 main 종료
            System.out.println(
                "Usage: java ClientExample4 <user-name>");
            return;
        }
        try {
	    // 서버와 연결
            Socket socket = new Socket("192.168.0.73", 6000);

             // 메시지 송신 쓰레드와 수신 쓰레드 생성해서 시작
            Thread thread1 = new SenderThread(socket, args[0]);
            Thread thread2 = new ReceiverThread(socket);

            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}