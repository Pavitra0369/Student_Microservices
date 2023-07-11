package com.gaurav.student.service.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RatingC {

	private int ratingId;
	private int studentId;
	private int collegeId;
	private int rating;
	private String feedback;
}
