package iot.project.smart_baby.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
//	@NotEmpty(message="필수 항목입니다.")
//	@Length(min=4, message="4글자 이상 입력하세요.")
	private String userId;
//	@NotEmpty(message="필수 항목입니다.")
	private String password;
//	@NotEmpty(message="필수 항목입니다.")
	private String parName;
	private String parBirth;
//	@NotEmpty(message="필수 항목입니다.")
	private String babyName;
//	@NotEmpty(message="필수 항목입니다.")
	private Date babyBirth;
//	@NotEmpty(message="필수 항목입니다.")
	private String email;
	private Date regDate;
	private Date updateDate;
}
