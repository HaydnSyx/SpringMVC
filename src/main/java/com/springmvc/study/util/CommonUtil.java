package com.springmvc.study.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class CommonUtil {

	public static boolean isEmpty(String source) {
		return source == null || "".equals(source.trim());
	}

	public static String md5Encode(String source) throws UnsupportedEncodingException {

		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
		}

		byte[] byteArray = source.getBytes("UTF-8");
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();

		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16) {
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}

		return hexValue.toString();
	}
}
