package study.forjob;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon9506 {
	static int input = 0, sum = 0;
	static boolean isPerfect = false;
	
	static ArrayList<Integer> inputList;
	static ArrayList<Integer> divisorList;

	public static void main(String[] args) {
		inputList = new ArrayList<Integer>();
		divisorList = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			input = sc.nextInt();

			if (input == -1) {
				sc.close();
				break;
			}

			inputList.add(input);
		}
		
		for(int i=0;i<inputList.size();i++){
			getDivisor(inputList.get(i));

			if (inputList.get(i) == sum) {// 약수의 합이 입력값과 같을 경우
				resultPut(inputList.get(i));
			} else {
				System.out.print(inputList.get(i) + " is NOT perfect.");
			}
			System.out.println();
		}

	}

	public static void getDivisor(int input) {
		sum = 0;
		divisorList.clear(); // 리스트 초기화
		for (int i = 1; i < input; i++) {
			if (input % i == 0) {
				divisorList.add(i);
				sum += i;
			}
		}
	}

	public static void resultPut(int number) {
		System.out.print(number + " = ");
		for (int i = 0; i < divisorList.size(); i++) {

			if (i == (divisorList.size() - 1)) {
				System.out.print(divisorList.get(i));
			} else {
				System.out.print(divisorList.get(i) + " + ");
			}

		}

	}

}
