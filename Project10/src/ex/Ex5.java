package ex;

import java.util.Scanner;

/*
 * 고객 상담 전화 배분 프로그램 구현하기
 * - 입력 숫자에 따라 정책 선택
 * */
public class Ex5 {
	public static void main(String[] args) {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("1 : 한명씩 차례로 할당 ");
		System.out.println("2 : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("3 : 우선순위가 높은 고객 먼저 할당 ");
		
		Scanner scanner = new Scanner(System.in);
		int num  =  scanner.nextInt(); //문자를 입력받아서 num변수에 저장 (숫자 입력 + 엔터)
		
		Scheduler scheduler = null;
		
		if(num == 1){ //입력받은 값이 r이면 RoundRobin 클래스 생성
			scheduler = new RoundRobin();
		}
		else if(num == 2){ //입력받은 값이 l이면 LeastJob 클래스 생성
			scheduler = new LeastJob();
		}
		else if(num == 3){ //입력받은 값이 p이면 PriorityAllocation 클래스 생성
			scheduler = new PriorityAllocation();
		}
		else{
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall(); //어떤 정책인가와 상관없이 인터페이스에 선언한 메소드 호출
		scheduler.sendCallToAgent();
		
	}
}

//상담원 한명씩 돌아가며 동일하게 상담 업무 배분
class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
		
	}

}

//현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분
class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담정화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
		
	}

}

//등급이 높은 고객의 전화부터 대가열에서 가져와 업무 능력이 높은 상담원 우선 배분
class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬이 높은 상담원에게 우선적으로 배분합니다.");
		
	}
}