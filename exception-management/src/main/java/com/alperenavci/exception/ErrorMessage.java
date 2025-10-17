package com.alperenavci.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
	
	private MessageType messageType;
	
	private String ofStatic;
	
	public String prepareErrorMessage() {
		
		// String 'in sonuna string eklemek için kullanacağız
		StringBuilder builder = new StringBuilder();
		
		// enum 'da ayarlanan hatanın mesajını str 'ye ekle
		builder.append(messageType.getMessage());
		
		// Eğer ofStatic 'ten veri geldiyse (yani sonradan str eklemek istersek)
		// o String 'i builder 'e ekler.
		if(ofStatic != null) {
			builder.append(" : " + ofStatic);
		}
		return builder.toString();
	}
}
