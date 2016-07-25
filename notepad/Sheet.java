package notepad;

class Sheet {

	private String topic;
	private String text;

	Sheet(String topic, String text) {

		setTopic(topic);
		setText(text);
	}

	void addText(String text) {

		if (text != null) {
			this.text += text;
		} else {
			System.out.println("Invalid text input.");
		}
	}

	void addTopic(String topic) {

		if (topic != null) {
			this.topic = topic;
		} else {
			System.out.println("Invalid topic input.");
		}
	}

	void delete() {
		this.setText("");
	}

	void review() {
		System.out.println(this.getTopic());
		System.out.println();
		System.out.println(this.getText());
		System.out.println("------------------------------------------------");
	}

	boolean searchWord(String word) {

		return (this.getText()).contains(word);
	}

	boolean containsDigits() {

		for (int index = 0; index < this.getText().length(); index++) {

			if (this.getText().charAt(index) >= '0' && this.getText().charAt(index) <= '9') {
				return true;
			}

		}
		return false;
	}

	private String getTopic() {
		return topic;
	}

	private void setTopic(String topic) {
		if (topic != null) {
			this.topic = topic;
		} else {
			this.topic = "";
		}
	}

	String getText() {
		return text;
	}

	private void setText(String text) {
		if (text != null) {
			this.text = text;
		} else {
			this.text = "";
		}
	}

}
