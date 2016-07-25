package notepad;

interface INotepad {

	void addTextTo(String text, int pageNumber);

	void addTopicTo(String topic, int pageNumber);

	void addTextTo(int pageNumber, String text);

	void delete(int pageNumber);

	void reviewAll();

	boolean searchWord(String word);

	void printAllPagesWithDigits();

}
