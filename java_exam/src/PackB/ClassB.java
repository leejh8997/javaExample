package PackB;

import PackA.ClassA;

public class ClassB extends ClassA {
	void test() {
	varPublic = 10;
//	varDefault = 10; 
	varProtected = 10; // 다른 패키지이지만 상속관계라서 접근 가능
//	varPrivate = 10;
	}
}
