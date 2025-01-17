package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx1 {
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			
			System.out.print("[(1) 학생추가 (2) 수정 (3) 삭제 (4) 조회 (5) 종료");
			int menu = scan.nextInt();
			while(true) {
				if(menu == 1) {
					String no ="";
					while(true) {
						System.out.print("학번 입력 : ");
						no = scan.next();
						if(no.length() == 8) {
							break;
						} else {
							System.out.println("학번은 8글자입니다.");
						}
					}
//					if(no.length() < 8 || no.length() >8 ) {
//						System.out.println("8글자 입력");
//						menu = 1;
//						continue;
//					}
					System.out.print("이름 입력 : ");
					String name = scan.next();
					System.out.print("학과 입력 : ");
					String dept = scan.next();
					
					String sql ="INSERT INTO STUDENT(STU_NO,STU_NAME,STU_DEPT) VALUES ('"+no+"', '"+name+"', '"+dept+"')";
					stmt.executeQuery(sql);
					int num = stmt.executeUpdate(sql);
					if(num > 0) {
						System.out.println("추가되었음!");
					} else {
						System.out.println("오류발생!");
					}
				} else if(menu == 2) {
					System.out.print("학번 입력 : ");
					String stuNo = scan.next();
					ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NAME = '" + stuNo +"'");
					if(rs.next()) {
						System.out.println("수정 할 데이터 선택 : ");
						System.out.print("(1) 이름 (2) 학과 (3) 키 => ");
						int column = scan.nextInt();
						if(column >3 || column <1) {
							System.out.println("없는 정보");
							continue;
						}
							
							
						if(column == 1) {
							System.out.print("이름 입력 : ");
							String name = scan.next();
							stmt.executeQuery("UPDATE STUDENT SET STU_NAME = '" + name +"'" +"WHERE STU_NO = '" + stuNo + "'");
						}else if(column == 2) {
							System.out.print("학과 입력 : ");
							String dept = scan.next();
							stmt.executeQuery("UPDATE STUDENT SET STU_NAME = '" + dept +"'" +"WHERE STU_NO = '" + stuNo + "'");
						}else if(column == 3) {
							System.out.print("키 입력 : ");
							String height = scan.next();
							stmt.executeQuery("UPDATE STUDENT SET STU_NAME = '" + height +"'" +"WHERE STU_NO = '" + stuNo + "'");
						} else {
							
						}
						
						
					} else {
						System.out.println("해당 학번을 가진 학생 없음");
					}
				} else if(menu == 3) {
					
				} else if(menu == 4) {
					
				} else if(menu == 5) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("없는 메뉴 입니다.");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
