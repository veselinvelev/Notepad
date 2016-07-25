package notepad;



class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;

	ElectronicSecuredNotepad(String passwrd, int sheetNumber) {
		super(passwrd, sheetNumber);
		this.setStarted(false);

	}

	@Override
	public void showPassword() {
		if (!this.isStarted()) {
			System.out.println("Device not started!");
			return;
		}
		super.showPassword();
	}

	@Override
	public void addTopicTo(String topic, int pageNumber) {
		if (!this.isStarted()) {
			System.out.println("Device not started!");
			return;
		}
		super.addTopicTo(topic, pageNumber);
	}

	@Override
	public void addTextTo(int pageNumber, String text) {
		if (!this.isStarted()) {
			System.out.println("Device not started!");
			return;
		}
		super.addTextTo(pageNumber, text);
	}

	@Override
	public void addTextTo(String text, int pageNumber) {
		if (!this.isStarted()) {
			System.out.println("Device not started!");
			return;
		}
		super.addTextTo(text, pageNumber);
	}

	@Override
	public void delete(int pageNumber) {
		if (!this.isStarted()) {
			System.out.println("Device not started!");
			return;
		}
		super.delete(pageNumber);

	}

	@Override
	public void reviewAll() {
		if (!this.isStarted()) {
			System.out.println("Device not started!");
			return;
		}
		super.reviewAll();
	}

	@Override
	public void start() {
		this.setStarted(true);

	}

	@Override
	public void stop() {
		setStarted(false);

	}

	private void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

}
