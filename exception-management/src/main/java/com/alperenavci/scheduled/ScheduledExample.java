package com.alperenavci.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
	
	// cron = (saniye) (dakika) (saat) (Ayın-günü) (Haftanın-günü)
	@Scheduled(cron = "12 12 12 * * *")
	public void write1To10() {
		System.out.println("It worked!");
	}
}
