package New1;

import java.time.LocalDate;

public class Question {
	int questionID;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	LocalDate creatDate;
	Exam[] exams;
}
