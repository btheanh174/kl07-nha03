package util;

public class NumberUtil {
	public static int parse(String str){
		int kq = 0;
		try{
			kq = Integer.parseInt(str);
		}catch(NumberFormatException e){
			kq = 0;
		}
		return kq;
	}
}
