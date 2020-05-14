package ko.maeng.baekjoon;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class No10699 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("UTC+0"));
		String dateTime = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(dateTime);
	}
}
