package com.example.demo.vo;

import java.io.Serializable;

public class WordVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String eng;
	private String kor;
	
	public WordVo() {
	}
	
	public WordVo(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}
	
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	
	
}
