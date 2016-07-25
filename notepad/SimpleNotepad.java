package notepad;

public class SimpleNotepad implements INotepad {

	private Sheet[] sheets;

	SimpleNotepad(int sheetNumber) {
		if (sheetNumber > 0) {

			this.sheets = new Sheet[sheetNumber];
			for (int index = 0; index < sheets.length; index++) {
				sheets[index] = new Sheet("", "");
			}
		} else {
			System.out.println("Invalid notepad size");
			System.out.println("The notepad will have only one page!");
			this.sheets = new Sheet[1];
			sheets[0] = new Sheet("", "");
		}
	}

	// Adds text to a page
	@Override
	public void addTextTo(String text, int pageNumber) {
		if (pageNumber >= 0 && pageNumber < sheets.length) {
			this.sheets[pageNumber].addText(text);
		}

	}

	// Deletes current text on a page and adds new
	@Override
	public void addTextTo(int pageNumber, String text) {
		if (pageNumber >= 0 && pageNumber < sheets.length) {
			this.sheets[pageNumber].delete();
			this.sheets[pageNumber].addText(text);
		}

	}

	// Delete page
	@Override
	public void delete(int pageNumber) {
		if (pageNumber > 0 && pageNumber < sheets.length) {
			this.sheets[pageNumber].delete();
		}

	}

	// Review all non blank pages
	@Override
	public void reviewAll() {

		for (int sheet = 0; sheet < sheets.length; sheet++) {

			// if (!(sheets[sheet].getTopic()).equals("") ||
			// (!(sheets[sheet].getText().equals("")))) {
			System.out.println("----------------------" + sheet + "----------------------");
			sheets[sheet].review();
			// }

		}

	}

	@Override
	public void addTopicTo(String topic, int pageNumber) {
		if (pageNumber >= 0 && pageNumber < sheets.length) {
			this.sheets[pageNumber].addTopic(topic);
		}

	}

	@Override
	public boolean searchWord(String word) {
		for (Sheet sheet : sheets) {
			if (sheet.searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {

		for (Sheet sheet : sheets) {

			if (sheet.containsDigits()) {
				sheet.review();
			}

		}

	}

}
