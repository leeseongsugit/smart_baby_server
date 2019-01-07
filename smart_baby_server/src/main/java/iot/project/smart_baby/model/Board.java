package iot.project.smart_baby.model;

import java.sql.Timestamp;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Board {
	private Long id;
	private Date regDate;
	private Timestamp sleepTime;
	private Timestamp wakeupTime;
	private Date totalTime;
	private DayType dayNight;
	private String memo;
	private Date updateDate;
	
}
