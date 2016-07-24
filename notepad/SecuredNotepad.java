package notepad;

import java.util.Scanner;

class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {

	private String password;

	SecuredNotepad(String passwrd, int sheetNumber) {
		super(sheetNumber);
		if (passwrd != null && !passwrd.equals("")) {
			this.password = passwrd;
		} else {
			this.password = genPassword(passwrd);
			System.out.println(
					"You have entered invalid password so random pasword was genereted for you: " + this.getPassword());
		}
	}

	private String getPassword() {
		return password;
	}

	@Override
	public void showPassword() {
		String password = enterPassword();

		if (password.equals(this.getPassword())) {
			System.out.println("password: "+ getPassword());
			
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

	public String enterPassword() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		return password;
	}

	public String genPassword(String password) {

		char[] passwordArray = (password.toString()).toCharArray();

		for (int index = 0; index < passwordArray.length; index++) {

			passwordArray[index] += (int) (Math.random() * 15) + 1;

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
