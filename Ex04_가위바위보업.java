import java.util.Random;
import java.util.Scanner;

public class Ex04_가위바위보업 {

	public static void main(String[] args) {

		String[] cmp = { "주먹", "가위", "보" };
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int draw = 0;
		while (true) {
			Random rd = new Random();
			int a = rd.nextInt(3);
			System.out.print("어떤 것을 낼 것인가요?");

			String input = sc.next();
			if (input.equals(cmp[a])) {
				System.out.println("비겼어요.");
				draw++;
			} else {
				if (input.equals("주먹")) {
					if (cmp[a].equals("가위")) {
						System.out.println("이겼어요!!");
						win++;
					} else {
						System.out.println("졌어요ㅠㅠ");
						lose++;
					}
				} else if (input.equals("가위")) {
					if (cmp[a].equals("보")) {
						System.out.println("이겼어요!!");
						win++;
					} else {
						System.out.println("졌어요ㅠㅠ");
						lose++;
					}
				}
				if (input.equals("보")) {
					if (cmp[a].equals("주먹")) {
						System.out.println("이겼어요!!");
						win++;
					} else {
						System.out.println("졌어요ㅠㅠ");
						lose++;
					}
				}
			}
			System.out.println("승패" + " 승 : " + win + " 패 : " + lose + " 무 : " + draw);
			System.out.println("상대방은 " + cmp[a] + "를 냈어요.");
		}

	}
}
