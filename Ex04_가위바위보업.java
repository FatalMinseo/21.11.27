import java.util.Random;
import java.util.Scanner;

public class Ex04_������������ {

	public static void main(String[] args) {

		String[] cmp = { "�ָ�", "����", "��" };
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int draw = 0;
		while (true) {
			Random rd = new Random();
			int a = rd.nextInt(3);
			System.out.print("� ���� �� ���ΰ���?");

			String input = sc.next();
			if (input.equals(cmp[a])) {
				System.out.println("�����.");
				draw++;
			} else {
				if (input.equals("�ָ�")) {
					if (cmp[a].equals("����")) {
						System.out.println("�̰���!!");
						win++;
					} else {
						System.out.println("�����Ф�");
						lose++;
					}
				} else if (input.equals("����")) {
					if (cmp[a].equals("��")) {
						System.out.println("�̰���!!");
						win++;
					} else {
						System.out.println("�����Ф�");
						lose++;
					}
				}
				if (input.equals("��")) {
					if (cmp[a].equals("�ָ�")) {
						System.out.println("�̰���!!");
						win++;
					} else {
						System.out.println("�����Ф�");
						lose++;
					}
				}
			}
			System.out.println("����" + " �� : " + win + " �� : " + lose + " �� : " + draw);
			System.out.println("������ " + cmp[a] + "�� �¾��.");
		}

	}
}
