import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int DA=sc.nextInt();
        int DB=sc.nextInt();
        System.out.println(cal_num(A,B,DA,DB));
	}
	
	static String cal_num(String A,String B,int DA,int DB){
		int PA = find(A, DA);
		int PB = find(B, DB);
		if (PA != 0) {
			if (PB != 0) {
				return Integer.toString(PA * PB);
			} else {
				return "�ڶ����ַ�����������";
			}
		} else {
			return "��һ���ַ�����������";
		}
	 }
	
	static int find(String s,int c){
		/*
		 * charתString�ķ�����
		 *  String s=Character.toString(c);
			String s=new String(new char[]{c});
			String s=""+c;		
			String s=String.valueOf(c);
			
		   charתint��String ����
			String s=Integer.toString(char ch) chתint��ASCII�� 'ch'
		   intתString
			Integer.toString(int i)	  "i"
		 */
		int cal=0,count=0;
		String temp="";
		String strOfc=Integer.toString(c); //int transfer String
		String str;
		for(int i=0;i<s.length();i++){ 
			str=Character.toString(s.charAt(i)); //char transfer String
			System.out.println("str:"+str);
			System.out.println("c:"+strOfc);
			if((str).equals(strOfc)){
				count=count+1;
				System.out.println(count);
			}
		}
		for(int i=0;i<count;i++){
			temp=temp.concat(strOfc); //temp��ʼֵ����Ϊnull
		}
		System.out.println("�����"+temp);
		cal=Integer.parseInt(temp);
		return cal;	
	}
	
}
