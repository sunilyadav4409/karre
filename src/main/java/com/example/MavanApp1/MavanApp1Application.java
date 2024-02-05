package com.example.MavanApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavanApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(MavanApp1Application.class, args);
	}

	public int add(int a, int b) {
		int c;
		c=a+b;
		return c;
	}
}
