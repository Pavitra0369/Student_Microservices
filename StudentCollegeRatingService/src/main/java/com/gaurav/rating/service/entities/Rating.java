package com.gaurav.rating.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student_College_Rating")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ratingId;
	private int studentId;
	private int collegeId;
	private int rating;
	private String feedback;
	
}
