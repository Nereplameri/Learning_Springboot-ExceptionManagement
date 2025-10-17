package com.alperenavci.controller.Impl;

import com.alperenavci.model.RootEntity;

public class RestBaseController {
	
	public <T> RootEntity<T> ok(T data){
		return RootEntity.ok(data);
	}
	
	public <T> RootEntity<T> error(String error){
		return RootEntity.error(error);
	}
}
