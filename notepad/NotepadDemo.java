package notepad;

import java.util.Scanner;

public class NotepadDemo {

	private static final int PAGES_IN_A_NOTEPAD = 3;

	public static void main(String[] args) {

		SimpleNotepad simpleNotepad = new SimpleNotepad(PAGES_IN_A_NOTEPAD);
		String text = "Test Text";

		for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {

			simpleNotepad.addTextTo(null, page);

		}

		for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {

			//simpleNotepad.addTopicTo(("Topic" + page), page);
			simpleNotepad.addTopicTo((null), page);

		}

		simpleNotepad.reviewAll();

		for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {

			simpleNotepad.addTextTo(page, (text + page + " i prenapisah stranicata"));

		}
		simpleNotepad.reviewAll();

		// SecuredNotepad securedNotepad = new SecuredNotepad("qwertyASD",
		// PAGES_IN_A_NOTEPAD);
		//
		//
		// for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {
		//
		// securedNotepad.addTextTo((text + page), page);
		//
		// }
		//
		// for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {
		//
		// securedNotepad.addTopicTo(("SecureadTopic" + page), page);
		//
		// }
		//
		// securedNotepad.reviewAll();
		//
		// ISecuredNotepad inotepad = new SecuredNotepad("1",
		// PAGES_IN_A_NOTEPAD);
		//
		// for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {
		//
		// inotepad.addTextTo((text + page), page);
		//
		// }
		//
		// for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {
		//
		// inotepad.addTopicTo(("VesoSecureadTopic" + page), page);
		//
		// }
		//
		// inotepad.reviewAll();
		// inotepad.showPassword();

		boolean invalidPass = true;

		ElectronicSecuredNotepad electronicNotepad = null;

		while (invalidPass) {
			String password = new Scanner(System.in).nextLine();
			try {

				electronicNotepad = new ElectronicSecuredNotepad(null, PAGES_IN_A_NOTEPAD);
				invalidPass = false;

			} catch (IllegalArgumentException e) {
				invalidPass = true;
				System.out.println("Too weak password!");
			}
		}

		electronicNotepad.start();

		for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {

			electronicNotepad.addTextTo((text + page), page);

		}

		for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {

			electronicNotepad.addTopicTo(("SecureadTopic" + page), page);

		}

		for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {

			electronicNotepad.addTopicTo(("ELECTRONICSecureadTopic" + page), page);

		}

		for (int page = 0; page < PAGES_IN_A_NOTEPAD; page++) {

			electronicNotepad.addTextTo(page, (text + page + " Added new tekst"));

		}

		electronicNotepad.reviewAll();
		electronicNotepad.showPassword();

		System.out.println("End");

	}

}
