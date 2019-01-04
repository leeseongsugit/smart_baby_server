package iot.project.smart_baby.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Baby {
//	@NotEmpty
	private int babyId;
//	@NotEmpty
	private String userId;
//	@NotEmpty
	private String babyName;
//	@NotEmpty
	private Date babyBirth;
	private Date regDate;
	private Date updateDate;
}
