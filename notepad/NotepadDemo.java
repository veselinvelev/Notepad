package notepad;

public class NotepadDemo {

	public static void main(String[] args) {

//		SimpleNotepad simpleNotepad = new SimpleNotepad(5);
		String text = "Az se kazvam Veso";

//		for (int page = 0; page < 5; page++) {
//
//			simpleNotepad.addTextTo((text + page), page);
//
//		}
//
//		for (int page = 0; page < 5; page++) {
//
//			simpleNotepad.addTopicTo(("VesoTopic" + page), page);
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
//			securedNotepad.addTopicTo(("VesoSecureadTopic" + page), page);
//
//		}
//		
//		securedNotepad.reviewAll();
		
		
		
		
		
		ISecuredNotepad inotepad = new SecuredNotepad("1", 3);
		
		
		for (int page = 0; page < 3; page++) {

			inotepad.addTextTo((text + page), page);

		}
		
		for (int page = 0; page < 3; page++) {

			inotepad.addTopicTo(("VesoSecureadTopic" + page), page);

		}
		
		inotepad.reviewAll();
		inotepad.showPassword();


		System.out.println("End");

	}

}
