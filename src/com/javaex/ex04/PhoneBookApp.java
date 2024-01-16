package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String str;
		
		Reader fr = new FileReader("C:\\javaStudy\\workspace\\chapter05\\src\\com\\javaex\\ex04\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);
		
		// ※ 주의 - 쓰기를 사용하면 원본 파일이 다 없어짐
		Writer out = new FileWriter("C:\\javaStudy\\workspace\\chapter05\\src\\com\\javaex\\ex04\\PhoneDB_원본_inset.txt");
		BufferedWriter bw = new BufferedWriter(out);
		
		// 파일에서 읽은 내용을 리스트로 관리
		// (이름, 핸드폰, 회사)	--> 리스트 이름 : Person
		
		while (true) {
			// 파일을 1줄씩 읽는다.
			str = br.readLine();
			
			// null 이면 반복문 끝.
			if(str == null) {
				break;
			}
			bw.write(str);
			bw.newLine();
			
			String[] Person = str.split(",");
			
			String name = Person[0];
			String hp = Person[1];
			String company = Person[2];
			
			// 출력
			System.out.println("이름: " + name );
			System.out.println("핸드폰: " + hp );
			System.out.println("회사: " + company );
			System.out.println("");
			
		}
		
		// 자신의 정보 Person 리스트에 추가하고
		// 리스트 전체 내용을 PhoneDb.txt에 씀
		String info = "유재석,010-3333-5555,비트";
		String[] Person = info.split(",");
		
		String name = Person[0];
		String hp = Person[1];
		String company = Person[2];
		
		// 출력
		System.out.println("이름: " + name );
		System.out.println("핸드폰: " + hp );
		System.out.println("회사: " + company );
		System.out.println("");
		
		
		bw.write(info);
		
		br.close();
		bw.close();
		sc.close();
	}

}
