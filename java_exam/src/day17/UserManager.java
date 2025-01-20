package day17;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserManager {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			// 아이디, 비밀번호, 이름을 입력받아서 TBL_USER에 저장
			
//			boolean idFlg = true;  // 플래그를 이용한 무한루프
			String id = "";
//			while(idFlg) {
			while(true) { 
				System.out.print("아이디 : ");
				id = scan.next();
				String idCheck = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
				ResultSet rs = stmt.executeQuery(idCheck);
//				idFlg = rs.next();
				if(rs.next()) {   // if문을 이용한 무한루프
					System.out.println("이미 사용중인 아이디입니다.");
				} else {
					break;
				}
			}
			
			System.out.print("비밀번호 : ");
			String pwd = scan.next();
			System.out.print("이름 : ");
			String name = scan.next();
			
			String sql = "INSERT INTO TBL_USER(USERID, PASSWORD, USERNAME) VALUES('"+id +"', '"+ pwd+"', '"+ name+"')";
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("가입되었습니다.");
			}
			
//			System.out.println(sql);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
