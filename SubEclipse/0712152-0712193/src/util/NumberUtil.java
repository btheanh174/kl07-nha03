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
}
