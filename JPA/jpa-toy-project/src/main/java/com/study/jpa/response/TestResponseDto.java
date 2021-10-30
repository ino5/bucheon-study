package com.study.jpa.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestResponseDto {

	private String writer;

	@Builder
	public TestResponseDto(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return writer + "님" + " 데이터가 성공적으로 저장 되었습니다.";
	}

}