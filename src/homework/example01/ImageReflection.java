package homework.example01;

import java.util.Scanner;

public class ImageReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%s", "원하는 이미지 사이즈 :  ");

		final Scanner scanner = new Scanner(System.in);
		final int input_value = scanner.nextInt();

		final int[][] original_image = new int[input_value][input_value];

		for (int i = 0; i < original_image.length; ++i) {
			for (int j = 0; j < original_image[0].length; ++j) {
				original_image[i][j] = (int) (Math.random() * 256.0);
			}
		}

		System.out.println();

		System.out.println("========= default =========");
		for (final int[] row : original_image) {
			for (final int element : row) {
				System.out.printf("%5d", element);
			}
			System.out.println();
		}
		move_to_Y_AXIS(original_image);
		move_to_X_AXIS(original_image);
		move_to_0_AXIS(original_image);
	}

	// Y축 대칭
	private static void move_to_Y_AXIS(int[][] original_image) {
		final int[][] change_image = new int[original_image.length][original_image.length];

		for (int i = 0; i < original_image.length; ++i) {
			int y = 0;
			for (int j = original_image[0].length - 1; j >= 0; --j) {
				change_image[i][y++] = original_image[i][j];
			}
		}
		System.out.println("\r\n");

		System.out.println("========= Y축대칭 =========");
		for (final int[] row : change_image) {
			for (final int element : row) {
				System.out.printf("%5d", element);
			}
			System.out.println();
		}
	}

	// X축 대칭
	private static void move_to_X_AXIS(int[][] original_image) {
		final int[][] change_image = new int[original_image.length][original_image.length];

		int x = 0;
		for (int i = original_image.length - 1; i >= 0; --i) {
			for (int j = 0; j < original_image[0].length; ++j) {
				change_image[x][j] = original_image[i][j];
			}
			++x;
		}
		System.out.println("\r\n");

		System.out.println("========= X축대칭 =========");
		for (final int[] row : change_image) {
			for (final int element : row) {
				System.out.printf("%5d", element);
			}
			System.out.println();
		}
	}

	// 원점 대칭
	private static void move_to_0_AXIS(int[][] original_image) {
		final int[][] change_image = new int[original_image.length][original_image.length];
		final int[][] change_image2 = new int[original_image.length][original_image.length];

		for (int i = 0; i < original_image.length; ++i) {
			int y = 0;
			for (int j = original_image[0].length - 1; j >= 0; --j) {
				change_image[i][y++] = original_image[i][j];
			}
		}

		int x = 0;
		for (int i = original_image.length - 1; i >= 0; --i) {
			for (int j = 0; j < original_image[0].length; ++j) {
				change_image2[x][j] = change_image[i][j];
			}
			++x;
		}

		System.out.println("\r\n");

		System.out.println("========= 원점대칭 =========");
		for (final int[] row : change_image2) {
			for (final int element : row) {
				System.out.printf("%5d", element);
			}
			System.out.println();
		}

	}

}
