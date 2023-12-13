package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {

		// 파일 목록 생성
		String[] arr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };

		// 1.파일 목록 중에서 txt 파일만 찾으세요
		Stream<String> stream = Arrays.stream(arr);
		stream.filter(s -> s.endsWith(".txt")).forEach(s -> System.out.println(s));

		// 2.확장자별로 파일의 개수를 구하세요
		Stream<String> stream2 = Arrays.stream(arr);
		long txtCount = stream2.filter(s -> s.endsWith(".txt")).count();

		Stream<String> stream3 = Arrays.stream(arr);
		long pdfCount = stream3.filter(s -> s.endsWith(".pdf")).count();

		Stream<String> stream4 = Arrays.stream(arr);
		long imgCount = stream4.filter(s -> s.endsWith(".img")).count();

		System.out.println("txt파일의 개수: " + txtCount);
		System.out.println("pdf파일의 개수: " + pdfCount);
		System.out.println("img파일의 개수: " + imgCount);

		// 3. 파일의 확장자만 추출하여 출력하세요 (hint! (.)점은 문자기호로 (\\.)으로 표현합니다 )
		Stream<String> stream5 = Arrays.stream(arr);
		stream5.map(s -> {
			String[] strArr = s.split("\\.");
			return strArr[1];
		}).distinct().forEach(s -> System.out.print(s + ", "));

	}

}