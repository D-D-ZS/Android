import java.util.Date;


public class TimeC {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		long a = 86434312L;
		Date data1 = new java.util.Date(System.currentTimeMillis());
		Date data2 = new java.util.Date(a);
		System.out.println(data1);
//		System.out.println(System.currentTimeMillis());
//		System.out.println(a);
		System.out.println("求得时间是：" + data2);
	}
}