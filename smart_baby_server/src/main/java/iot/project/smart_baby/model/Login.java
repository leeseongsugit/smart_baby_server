package iot.project.smart_baby.model;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class Login {
	@NotEmpty(message="사용자 Id를 입력하세요.")
	private String userId;
	@NotEmpty(message="비밀번호를 입력하세요.")
	private String password;
	
	private String url;
	private String reason;		// 로그인 실패 이유
}
