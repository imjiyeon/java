package main;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter로 쓰기
 * */
public class Ex09 {

	public static void main(String[] args) {

		try {
			// 문자 기반 출력 스트림 생성
			FileWriter fw = new FileWriter("writer.txt");
			
			// 문자 하나 출력
			fw.write('A');
			
			// 문자열 출력
			fw.write("안녕하세요");
			
			// 특수기호 출력
			fw.write('\n');
			
			// 배열 출력
			char[] arr = { 'a', 'b', 'c' };
			fw.write(arr);

			// 버퍼: 데이터를 임시로 저장하는 공간. 데이터를 효율적으로 처리하기 위해 일정량을 모았다가 한번에 처리
			// filewriter의 버퍼크기 : 8kb
			fw.flush(); // 버퍼에 남아있는 데이터 강제로 출력하기. 이부분이 없으면 데이터가 출력안될 수 있음

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
