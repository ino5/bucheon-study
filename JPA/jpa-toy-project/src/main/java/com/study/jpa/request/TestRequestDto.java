package com.study.jpa.request;

import java.time.LocalDateTime;

import com.study.jpa.domain.Test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TestRequestDto {

	private Long id;
	private String writer;
	private String title;
	private String content;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDte;

	// toEntity()는 dto에서 필요한 부분을 빌더패턴을 통해 entity로 만드는 역할
	public Test toEntity() {
		Test test = Test.builder()
						.id(id)
						.writer(writer)
						.title(title)
						.content(content)
						.build();
		return test;
	}
}
