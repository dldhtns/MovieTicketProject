package movie;

public class Movie {
	// 필드
	String movieName;//영화명
	int price;//금액
	int age;//나이
	int money;//실구매금액
	double rate;//할인율
	String way;//구매방법

	//생성자
	public Movie(String movieName, int price, int age, String way ) {
	//매개변수로 값을 받아서 멤버변수에 넣기
	this.movieName = movieName;
	this.price = price;
	this.age = age;
	this.way = way;
	}

	//메소드 1. 할인율 ->void rateCal()

	//2. 실구매금액 ->void moneyCal()

	//3. 제목인쇄하기 ->void titlePrint()

	//4. 내용 출력하기 ->void dataPrint()

}
