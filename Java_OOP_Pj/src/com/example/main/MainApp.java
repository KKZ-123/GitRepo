package com.example.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Student;

public class MainApp {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Student[] studentArr = new Student[100];
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter Student Name : ");
		String name = br.readLine();
		System.out.print("Enter Student Nickname : ");
		String nickname = br.readLine();
		System.out.print("Enter Address1 : ");
		String address1 = br.readLine();
		System.out.print("Enter Address2 (or press Enter to skip) : ");
		String address2 = br.readLine();
		int [] marks = new int[6];
		
		for(int i = 0; i < 6; i++) {
			System.out.print("Subject " + (i+1) + " : ");
			int mark = Integer.parseInt(br.readLine());
			marks[i] = mark;
		}
		System.out.print("Do you want to add another new student? (yes/no) : ");
	}
}
