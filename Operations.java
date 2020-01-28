package java_0128;//package - 현재 파일의 위치(폴더 구조)
//import - 현재 파일이 사용하는 class의 위치
public class Operations {
	int memberTest;
	/*
	class 내부에 존재하는 것
	 데이터 - member variable
	 함수 - member method
	메서드의 구성
		접근 제한자(access modifier)
		return type
		method name
		parameter list - 메서드에 일을 시킬 때, 필요한 외부 데이터를 명시
	
	*/
	public static void plus() {//no return, no parameter
		System.out.println(7+8);
	}
	public static void plus(int a, int b) {//no return
		System.out.println(a+b);
	}//overload - parameter가 다르면, 같은 이름의 메서드라도 중복 선언 가능 
	public static int plus2(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		plus();
		plus(5,6);
	}
}
