package notepad;

interface ISecuredNotepad extends INotepad {

	String enterPassword();

	String genPassword(String password);

	void showPassword();
}
