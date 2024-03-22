import java.util.Scanner;
public class LinkedListPractice2 {    
    static LinkNode head;
    static LinkNode cur;
    static LinkNode newNode;
    static LinkNode del;
    

    public static void main(String[] args) {
        
        head = cur = newNode = new LinkNode();
        newNode.next = null;

        newNode.setData(1);
		//newNode.next = null;
		
		//newNode = new LinkNode();
		newNode.next = new LinkNode();
		newNode.next.setData(2);
		newNode.next.next = null;
		
		
		newNode.next.next = new LinkNode();
		newNode.next.next.setData(3);
		newNode.next.next.next = null;
		
		newNode.next.next.next = new LinkNode();
		newNode.next.next.next.setData(4);
		newNode.next.next.next.next = null;
		
		newNode = new LinkNode();
        newNode.setData(5);
		newNode.next = head;
		head =newNode;
		cur = head; 
		
        // 몇 번쨰 추가할거야?
        // 원하는 위치에 데이터 삽입
        // 입력 => 삽입
        
        Scanner sc = new Scanner(System.in);
        int location = sc.nextInt();
        newNode = new LinkNode();
        newNode.setData(6);

        if (location == 1) {
            newNode.next = head;
            head = newNode;            
        } 
              
        else {
            for (int i= 1; i < location-1; i++)
                cur = cur.next;
            newNode.next = cur.next;
            cur.next = newNode;
        }


		// 출력
		cur = head; 
		while(cur != null) {
			System.out.print(cur.getData() + "\t");
			cur = cur.next;			
		} 

        // 삭제
        cur = head;
        System.out.println("몇 번쨰 삭제할래?");
        location = sc.nextInt();

        del = head;
        if (location == 1) {
            head = head.next;
        } else {
            for (int i=1; i < location-1; i++)
                cur = cur.next;
            for (int i =1; i<location; i++)
                del = del.next;
            cur.next = del.next;
        }
        
        cur = head;
		while(cur != null) {
			System.out.print(cur.getData() + "\t");
			cur = cur.next;			
		} 


        // 출력
   }
}
