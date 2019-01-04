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
//	@NotEmpty
	private String userId;
//	@NotEmpty
	private String password;
//	@NotEmpty
	private String parName;
	private String parBirth;
//	@NotEmpty
	private String email;
	private Date regDate;
	private Date updateDate;
}
