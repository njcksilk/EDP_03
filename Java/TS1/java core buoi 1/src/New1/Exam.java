package New1;

import java.time.LocalDate;

public class Exam {
	int examID;
	String code;
	String title;
	CategoryQuestion category;
	int duration;
	Account creator;
	LocalDate createDate;
	Question[] questions;
}
