package notepad;

public abstract class Notepad implements INotepad {

	Sheet[] sheets;

	public Notepad(int sheetNumber) {
		if (sheetNumber > 0) {

			this.sheets = new Sheet[sheetNumber];
		} else {
			System.out.println("Invalid notepad size");
		}
	}

	// Adds text to a page
	@Override
	public void addTextTo(String text, int pageNumber) {
		if (pageNumber > 0 && pageNumber < sheets.length) {
			this.sheets[pageNumber].addText(text);
		}

	}

	// Deletes current text on a page and adds new
	@Override
	public void addTextTo(int pageNumber, String text) {
		if (pageNumber > 0 && pageNumber < sheets.length) {
			this.sheets[pageNumber].delete();
			this.sheets[pageNumber].addText(text);
		}

	}

	@Override
	public void delete(int pageNumber) {
		if (pageNumber > 0 && pageNumber < sheets.length) {
			this.sheets[pageNumber].delete();
		}

	}

	@Override
	public void reviewAll() {

		for (int sheet = 0; sheet < sheets.length; sheet++) {

			if (!(sheets[sheet].getTopic()).equals("") || (!(sheets[sheet].getText().equals("")))) {
				System.out.println("----------------------" + sheet + "----------------------");
				sheets[sheet].review();
			}

		}

	}

}
