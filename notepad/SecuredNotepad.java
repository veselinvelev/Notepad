package notepad;

import java.util.Scanner;

class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {

	private static final int NUMBER_OF_LETTERS = 26;
	private static final int NUMBER_OF_DIGITS = 10;
	private static final int MIN_PASS_LEN = 5;
	private static final String RANDOM_PASSWORD_GEN_BASE = "0Aa0Aa";
	String password;

	SecuredNotepad(String password, int sheetNumber) {
		super(sheetNumber);
		if (password != null && !password.equals("")) {
			if (!isStrongPass(password)) {
				throw new IllegalArgumentException("Too week password");
			}
			this.password = password;
		} else {
			this.password = genPassword(RANDOM_PASSWORD_GEN_BASE);
			System.out.println(
					"You have not entered invalid password so random password was genereted for you: " + this.getPassword());
		}
	}

	String getPassword() {
		return password;
	}

	private boolean isStrongPass(String password) {

		if (password == null || password.length() < MIN_PASS_LEN) {
			System.out.println("Weak Password");
			return false;
		}

		boolean hasDigit = hasDigit(password);

		boolean hasSmall = hasSmallLetter(password);

		boolean hasCapital = hasCapitalLetter(password);

		return hasDigit && hasCapital && hasSmall;
	}

	private boolean hasSmallLetter(String password) {
		boolean hasSmall = false;
		for (int index = 0; index < password.length(); index++) {

			if (password.charAt(index) >= 'a' && password.charAt(index) <= 'z') {
				hasSmall = true;
				break;
			}
		}
		return hasSmall;
	}

	private boolean hasCapitalLetter(String password) {
		boolean hasCapital = false;
		for (int index = 0; index < password.length(); index++) {

			if (password.charAt(index) >= 'A' && password.charAt(index) <= 'Z') {
				hasCapital = true;
				break;
			}
		}
		return hasCapital;
	}

	private boolean hasDigit(String password) {
		boolean hasDigit = false;
		for (int index = 0; index < password.length(); index++) {

			if (password.charAt(index) >= '0' && password.charAt(index) <= '9') {
				hasDigit = true;
				break;
			}
		}
		return hasDigit;
	}

	@Override
	public void showPassword() {
		String password = enterPassword();

		if (password.equals(this.getPassword())) {
			System.out.println("password: " + getPassword());

		} else {
			System.out.println("Wrong password");
		}
	}

	@Override
	public void addTopicTo(String topic, int pageNumber) {
		String password = enterPassword();

		if (password.equals(this.getPassword())) {
			super.addTopicTo(topic, pageNumber);
		} else {
			System.out.println("Wrong password");

		}
	}

	String enterPassword() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		return password;
	}

	private String genPassword(String password) {

		char[] passwordArray = (password.toString()).toCharArray();

		for (int index = 0; index < passwordArray.length; index++) {

			if (passwordArray[index] == '0') {
				passwordArray[index] += (int) (Math.random() * NUMBER_OF_DIGITS);
			} else {
				passwordArray[index] += (int) (Math.random() * NUMBER_OF_LETTERS);
			}
		}

		for (int index = 0; index < passwordArray.length; index++) {
			int pos = (int) (Math.random() * passwordArray.length);
			char temp = passwordArray[index];
			passwordArray[index] = passwordArray[pos];
			passwordArray[pos] = temp;
		}

		return new String(passwordArray);
	}

	@Override
	public void addTextTo(int pageNumber, String text) {
		String password = enterPassword();

		if (password.equals(this.getPassword())) {
			super.addTextTo(pageNumber, text);
		} else {
			System.out.println("Wrong password");
		}
	}

	@Override
	public void addTextTo(String text, int pageNumber) {
		String password = enterPassword();

		if (password.equals(this.getPassword())) {
			super.addTextTo(text, pageNumber);
		} else {
			System.out.println("Wrong password");
		}
	}

	@Override
	public void delete(int pageNumber) {
		String password = enterPassword();

		if (password.equals(this.getPassword())) {
			super.delete(pageNumber);
		} else {
			System.out.println("Wrong password");
		}

	}

	@Override
	public void reviewAll() {
		String password = enterPassword();

		if (password.equals(this.getPassword())) {
			super.reviewAll();
		} else {
			System.out.println("Wrong password");
		}

	}
}
