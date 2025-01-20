package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserUpdate {

	public static void main(String[] args) {
		// 아이디를 입력받아서 없는 아이디면
		// '없는 아이디 입니다' -> 다시 입력하도록
		// 있는 아이디일 경우
		// 나이 값을 입력받아서 업데이트
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			while(true) {
				System.out.print("아이디 : ");
				String id = scan.next();
				String sql ="SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					System.out.println("나이 : ");
					int age = scan.nextInt();
					String sql2 = "UPDATE TBL_USER SET AGE = " + age + " WHERE USERID = '" + id + "'";
					stmt.executeUpdate(sql2);
					break;
				} else {
					System.out.println("없는 아이디 입니다.");
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
