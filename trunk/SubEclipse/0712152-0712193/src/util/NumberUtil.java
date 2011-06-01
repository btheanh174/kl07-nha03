package util;

import java.util.ArrayList;
import java.util.List;

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
	
	public static int parseInt(String str){
		int kq = 0;
		if(str == null)
			return 0;
		try{
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i < str.length(); i++){
				if(Character.isDigit(str.charAt(i))){
					builder.append(str.charAt(i));
				}
			}
			kq = Integer.parseInt(builder.toString());
		}catch(NumberFormatException e){
			
		}
		
		return kq;
	}
	
	public static String getNumberText(Integer number){
		StringBuilder str = new StringBuilder(String.valueOf(number));
		str.reverse();
		for (int i = 3; i < str.length(); i += 4) {
			str.insert(i, ".");
		}
		str.reverse();
		return str.toString();
	}
	
	public static List<Integer> getIntListFromInt(Integer number){
		List<Integer> kq = new ArrayList<Integer>();
		for (int i = 1; i <= number; i++) {
			kq.add(i);
		}
		return kq;
	}
	
	public static float getMin(List<Float> list){
		float kq = 0.0f;
		
		return kq;
	}
}
