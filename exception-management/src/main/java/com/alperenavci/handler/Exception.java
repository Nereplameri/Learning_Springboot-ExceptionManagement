package com.alperenavci.handler;

import java.util.Date;

import lombok.Data;

@Data
public class Exception<E> {
	
	private String hostName;
	
	private String path;
	
	private Date createTime;
	
	// Generic olduğu için string, Map, object hepsi gelebilir.
	private E message;
}
