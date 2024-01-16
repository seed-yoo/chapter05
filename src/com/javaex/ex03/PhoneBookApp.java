package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException {
		
		// Reader 준비
			// 리더 + 버퍼	--> PhoneDB.txt는 UTF-8이다
		Reader fr = new FileReader("C:\\javaStudy\\workspace\\chapter05\\src\\com\\javaex\\ex03\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		// 반복
		while (true) {
			// 파일을 1줄씩 읽는다.
			String str = br.readLine();
			
			// null 이면 반복문 끝.
			if(str == null) {
				break;
			}
			
			String[] personInfo = str.split(",");
			
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			// 출력
			System.out.println("이름: " + name );
			System.out.println("핸드폰: " + hp );
			System.out.println("회사: " + company );
			System.out.println("");
			
		}
		
		
		
		
		
		
		//반복
			// 파일을 1줄 읽음
			
			
			// ,로 분리한다
				// name = 정우성
				// hp = 010-0220-2222
				// company = 02-222-2222
		
			// 출력
		
			// null 이면 반복 종료 null이 아니라면 다시 반복 시작.
		
		// 종료
		br.close();
		
	}

}
