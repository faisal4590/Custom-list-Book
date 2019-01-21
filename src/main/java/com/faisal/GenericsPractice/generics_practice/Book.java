package com.faisal.GenericsPractice.generics_practice;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
import lombok.NonNull;

@Data


public class Book {
	
	@NonNull private String book_name; 
	@NonNull private String isbn;
	@NonNull private String authorName;
	@NonNull private LocalDate publishDate;
	@NonNull private double prize;
	
}
