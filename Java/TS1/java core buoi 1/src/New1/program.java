package New1;

import java.net.Socket;
import java.time.LocalDate;
import java.util.Date;

public class program {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "maketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "saleoff";

		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = ("Test");

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = ("Dev");

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = ("Test");

		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "ngobakha@ad.com";
		account1.useName = "kha";
		account1.fullName = "ngo ba kha";
		account1.department = department1;
		account1.position = position3;
		account1.creatDate = LocalDate.of(2020, 9, 15);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "ngokhoi@ad.com";
		account2.useName = "khoi";
		account2.fullName = "ngo khoi";
		account2.department = department2;
		account2.position = position1;
		account2.creatDate = LocalDate.of(2020, 1, 15);

		Account account3 = new Account();
		account3.accountID = 3;
		account3.email = "huanrose@ad.com";
		account3.useName = "huan";
		account3.fullName = "bui xuan huan";
		account3.department = department3;
		account3.position = position2;
		account3.creatDate = LocalDate.of(2020, 9, 5);

		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "mua quat";
		group1.creator = account1;
		group1.creatDate = LocalDate.of(2020, 9, 5);

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "bay nhay";
		group2.creator = account2;
		group2.creatDate = LocalDate.of(2020, 9, 5);

		Group group3 = new Group();
		group3.groupID = 1;
		group3.groupName = "hip hop";
		group3.creator = account3;
		group3.creatDate = LocalDate.of(2020, 9, 5);

		Group[] groupsOfAccount1 = { group3, group2 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group1, group2, group3 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group2 };
		account3.groups = groupsOfAccount3;

		Account[] accountOfGroup1 = { account1, account2 };
		group1.accounts = accountOfGroup1;

		Account[] accountOfGroup2 = { account1, account2, account3 };
		group2.accounts = accountOfGroup2;

		Account[] accountOfGroup3 = { account1 };
		group3.accounts = accountOfGroup3;

		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeID = 1;
		typeQuestion1.typeName = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeID = 1;
		typeQuestion2.typeName = TypeName.MULIPLE_CHOICE;

		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeID = 1;
		typeQuestion3.typeName = TypeName.ESSAY;

		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryID = 1;
		categoryQuestion1.categoryName = ("Java");

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryID = 2;
		categoryQuestion2.categoryName = ("NET");

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryID = 3;
		categoryQuestion3.categoryName = ("SQL");

		Question question1 = new Question();
		question1.questionID = 1;
		question1.content = ("cach mua quat");
		question1.category = categoryQuestion3;
		question1.type = typeQuestion3;
		question1.creator = account1;
		question1.creatDate = LocalDate.of(2020, 9, 5);

		Question question2 = new Question();
		question2.questionID = 2;
		question2.content = ("cach mua quat");
		question2.category = categoryQuestion2;
		question2.type = typeQuestion2;
		question2.creator = account2;
		question2.creatDate = LocalDate.of(2020, 9, 5);

		Question question3 = new Question();
		question3.questionID = 3;
		question3.content = ("cach mua quat");
		question3.category = categoryQuestion1;
		question3.type = typeQuestion1;
		question3.creator = account3;
		question3.creatDate = LocalDate.of(2020, 9, 5);

		Ansewer ansewer1 = new Ansewer();
		ansewer1.answerID = 1;
		ansewer1.content = ("quay tay goc 50");
		ansewer1.question = question1;
		ansewer1.isCorrect = true;

		Ansewer ansewer2 = new Ansewer();
		ansewer2.answerID = 2;
		ansewer2.content = ("nhay cao len");
		ansewer2.question = question3;
		ansewer2.isCorrect = false;

		Ansewer ansewer3 = new Ansewer();
		ansewer3.answerID = 3;
		ansewer3.content = ("bay xa vao");
		ansewer3.question = question2;
		ansewer3.isCorrect = true;

		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = "A001";
		exam1.title = ("de bay nhay");
		exam1.category = categoryQuestion1;
		exam1.duration = 60;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of(2020, 9, 5);

		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = "A002";
		exam2.title = ("de nhay");
		exam2.category = categoryQuestion1;
		exam2.duration = 60;
		exam2.creator = account2;
		exam2.createDate = LocalDate.of(2020, 9, 5);

		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = "A003";
		exam3.title = ("de bay");
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.creator = account3;
		exam3.createDate = LocalDate.of(2020, 9, 5);

		System.out.println("thong tin phong ban 1");
		System.out.println("useName:" + account1.useName);
		System.out.println("id:" + account1.accountID);

		// Q1
		if (account2.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		} else {
			System.out.println("nhan vien nay cos phong ban la 2");
		}
		;

		// Q2
		if (account2.groups.length == 0) {
			System.out.println("Nhan vien nay chua tham gia group ca");
		} else if (account2.groups.length == 1 || account2.groups.length == 0) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		;

		// Q3
		if (account2.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		} else {
			System.out.println("nhan vien nay cos phong ban la " + account2.department.departmentName);
		}
		;
		// Q4
		if (account1.position.positionName == ("Dev")) {
			System.out.println("Đây là Developer");
		} else {
			System.out.println("Người này không phải là Developer");
		}

		// Q5
		switch (account1.groups.length) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		}
		// Q6
		switch (account2.groups.length) {
		case 0:
			System.out.println("Nhan vien nay chua tham gia group ca");
			break;
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		case 4:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
		;
		// Q7

		switch (account1.position.positionName) {
		case ("Dev"):
			System.out.println("Đây là Developer");
			break;

		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
		;
		// Q8

		Account[] accounts = { account1, account2, account3 };
		for (Account account : accounts) {
			System.out.println("Email:" + account.email);
			System.out.println("FullName:" + account.fullName);
			System.out.println("DepartmentName:" + account.department.departmentName);
			System.out.println("\n");
		}
		;

		// Q̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣̣́̃̉́̃̃̀9
		Account[] accounts1 = { account1, account2, account3 };
		for (Account account : accounts1) {
			System.out.println("ID" + account.department.departmentID);
			System.out.println("name" + account.useName);
		}
		;

		// Q10
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("thông tin account" + i + "là");
			System.out.println("Email:" + accounts[i].email);
			System.out.println("FullName:" + accounts[i].fullName);
			System.out.println("DepartmentName:" + accounts[i].department.departmentName);
			System.out.println("\n");
		}
		;

		// Q11
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("ID:" + accounts[i].department.departmentID);
			System.out.println("Name:" + accounts[i].department.departmentName);
			System.out.println("\n");
		}
		;

//		Q12
		for (int i = 0; i < 2; i++) {
			System.out.println("thông tin account" + i + "là");
			System.out.println("Email:" + accounts[i].email);
			System.out.println("FullName:" + accounts[i].fullName);
			System.out.println("DepartmentName:" + accounts[i].department.departmentName);
			System.out.println("\n");
		}
		;

		// Q13
		for (int i = 0; i < accounts.length; i++)
			if (i == 1) {
				System.out.println("thông tin account" + (i) + "là");
				System.out.println("Email:" + accounts[i].email);
				System.out.println("FullName:" + accounts[i].fullName);
				System.out.println("DepartmentName:" + accounts[i].department.departmentName);
				System.out.println("\n");
			}
		;
		// Q14
		for (int i = 0; i < accounts.length; i++)
			if (accounts[i].accountID < 1) {
				System.out.println("thông tin account" + i + "là");
				System.out.println("Email:" + accounts[i].email);
				System.out.println("FullName:" + accounts[i].fullName);
				System.out.println("DepartmentName:" + accounts[i].department.departmentName);
				System.out.println("\n");
			}
		;

		// Q15
		for (int i = 0; i <= 20; i = i+2) {
			System.out.println(i);
		}
		;
		// Q16 10
		int i = 0;
		while ( i < accounts.length) {
			System.out.println("thông tin account" + i + "là");
			System.out.println("Email:" + accounts[i].email);
			System.out.println("FullName:" + accounts[i].fullName);
			System.out.println("DepartmentName:" + accounts[i].department.departmentName);
			System.out.println("\n");
			i++;
		}
		;
		//Q16 11
		int x = 0;
		while ( x < accounts.length) {
			System.out.println("ID:" + accounts[x].department.departmentID);
			System.out.println("Name:" + accounts[x].department.departmentName);
			System.out.println("\n");
			x++;
		}
		;
		//Q16 12
		int y = 0;
		while ( y < 2) {
			System.out.println("thông tin account" + y + "là");
			System.out.println("Email:" + accounts[y].email);
			System.out.println("FullName:" + accounts[y].fullName);
			System.out.println("DepartmentName:" + accounts[y].department.departmentName);
			System.out.println("\n");
			y++;
		};
		//Q16 13
		
				

	}
}
