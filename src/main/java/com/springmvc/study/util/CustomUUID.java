package com.springmvc.study.util;

import java.util.UUID;

public class CustomUUID {

	public static String getId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
