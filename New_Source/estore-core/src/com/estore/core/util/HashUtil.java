package com.estore.core.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class HashUtil {
	
	public static String generateHash(String input) throws UnsupportedEncodingException{
		StringBuilder hash = new StringBuilder();
		
		try{
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.reset();
			md5.update(input.getBytes("UTF-8"));
			//byte[] hashedBytes = md5.digest();
			//hash.append(hashedBytes.toString());
			BigInteger bigInt = new BigInteger(1, md5.digest());
			hash.append(bigInt.toString());
		}catch(NoSuchAlgorithmException e){
			
		}
		
		return hash.toString();
	}
	
	public static String generateSalt(int length){
		StringBuilder salt = new StringBuilder();
		// Phat sinh chuoi salt
		char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z','w'};
		Random random = new Random();
		for(int i = 0; i < length; i++){
			salt.append(chars[random.nextInt(chars.length)]);
		}
		//
		return salt.toString();
	}
}
