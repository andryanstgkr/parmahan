package com.parmahan.src.common;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

import com.parmahan.src.constant.Constants;

public class CommonStaticClass {
	public final static String generateUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().toUpperCase();
	}

	public final static Date getDate(String param, int day) {
		LocalDate localDate = LocalDate.now();

		ZoneId defaultZoneId = ZoneId.systemDefault();
		
		if (param.equals(Constants.NEXT_DATE)) {
			localDate = LocalDate.now().plusDays(day);
		} else if (param.equals(Constants.PREV_DATE)) {
			localDate = LocalDate.now().minusDays(day);
		}
		Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
		return date;
	}

}
