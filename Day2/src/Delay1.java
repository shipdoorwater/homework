import java.util.Scanner;
public class Delay1 {
	
		int num;
	   String[] name; 
	   int[][] score;
	   float[] avg;
	   Scanner sc = new Scanner(System.in);
	
	   public static void main(String[] args) {
	       System.out.println("몇 명의 성적을 관리합니까?");
	       Scanner sc = new Scanner(System.in);
	       
	       Delay1 result = new Delay1();

	       result.arr(sc);
	       result.inputStudent(sc);
	       result.disp();
	   }	   
	   
	   // 배열 선언하기
	   public void arr(Scanner sc) {
		   num = sc.nextInt();
		   name = new String[num] ;
		   score = new int[num][4];
		   avg = new float[num];	   
	   }
	   
	   // 학생들의 점수 받기
	   public void inputStudent(Scanner sc) {
		   
	       for (int i = 0; i < num; i++) {
	           name[i] = sc.next();
	           for (int j = 0; j < 3; j++) {
	               score[i][j] = sc.nextInt();
	               score[i][3] += score[i][j];
	           }
	           avg[i] = (score[i][3])/3.f;
	       }
	   }
	   // 출력
	   public void disp() {
	       for (int student = 0; student < num; student++) {
	           System.out.print("학생: " + name[student] + "\t");
	           for (int sco : score[student]) {
	               System.out.print(sco + "\t");
	           }
	           System.out.print("평균:" + avg[student] + "\n");
	       }
	   }
	   



	  

	
}
