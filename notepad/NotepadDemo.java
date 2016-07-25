package notepad;

public class NotepadDemo {

	private static final int PAGES_IN_A_NOTEPAD = 3;

	public static void main(String[] args) {

//		SimpleNotepad simpleNotepad = new SimpleNotepad(5);
		String text = "Test Text";

//		for (int page = 0; page < 5; page++) {
//
//			simpleNotepad.addTextTo((text + page), page);
//
//		}
//
//		for (int page = 0; page < 5; page++) {
//
//			simpleNotepad.addTopicTo(("Topic" + page), page);
//
//		}
//
//		simpleNotepad.reviewAll();
//
//		for (int page = 0; page < 5; page++) {
//
//			simpleNotepad.addTextTo(page, (text + page + " i prenapisah stranicata"));
//
//		}
//		simpleNotepad.reviewAll();
		
		
//		SecuredNotepad securedNotepad = new SecuredNotepad("qwerty", 3);
//		
//		
//		for (int page = 0; page < 3; page++) {
//
//			securedNotepad.addTextTo((text + page), page);
//
//		}
//		
//		for (int page = 0; page < 3; page++) {
//
//			securedNotepad.addTopicTo(("SecureadTopic" + page), page);
//
//		}
//		
//		securedNotepad.reviewAll();
		
		
		
		
		
//		ISecuredNotepad inotepad = new SecuredNotepad("1", 3);
		
		
//		for (int page = 0; page < 3; page++) {
//
//			inotepad.addTextTo((text + page), page);
//
//		}
//		
//		for (int page = 0; page < 3; page++) {
//
//			inotepad.addTopicTo(("VesoSecureadTopic" + page), page);
//
//		}
//		
//		inotepad.reviewAll();
//		inotepad.showPassword();
		
		
		ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad("", -3);
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
