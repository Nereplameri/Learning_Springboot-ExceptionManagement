package com.alperenavci.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RootEntity<T> {
	
	private boolean result; //Başarılı mı?
	
	private String errorMessage;
	
	private T data;
	
	// Static metot olduğu için sınıf üzerinden çapırılacaklar.
	public static <T> RootEntity<T> ok(T data){
		RootEntity<T> rootEntity = new RootEntity<>();
		rootEntity.setData(data);
		rootEntity.setResult(true);
		rootEntity.setErrorMessage(null);
		return rootEntity;
	}
	
	public static <T> RootEntity<T> error(String errorMessage){
		
		RootEntity<T> rootEntity = new RootEntity<>();
		rootEntity.setData(null);
		rootEntity.setErrorMessage(errorMessage);
		rootEntity.setResult(false);
		
		return rootEntity;
	}
}
