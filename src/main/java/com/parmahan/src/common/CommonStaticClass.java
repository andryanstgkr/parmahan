package com.parmahan.src.common;

import java.util.UUID;

public class CommonStaticClass {
	public final static String generateUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().toUpperCase();
	}
}
