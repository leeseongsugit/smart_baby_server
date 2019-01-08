package iot.project.smart_baby.model;

import lombok.Data;

@Data
public class Search {

	private String date;		// 날짜별 검색
	private DayType type;		// 수면 타입 별 검색
	
//	public void setType(DayType type) {
//		this.type = type;
//	}
}
