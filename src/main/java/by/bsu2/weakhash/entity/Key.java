package by.bsu2.weakhash.entity;

public class Key {
    private int keyUnique;
    private boolean isProcessed;

	public Key(int keyUnique, boolean isProcessed) {
		this.keyUnique = keyUnique;
		this.isProcessed = isProcessed;
	}

	public Key(int key){
    	keyUnique = key;
    }

    public int getKeyUnique() {
        return keyUnique;
    }

    public void setKeyUnique(int keyUnique) {
        this.keyUnique = keyUnique;
    }

	public boolean isProcessed() {
		return isProcessed;
	}

	public void setProcessed(boolean processed) {
		isProcessed = processed;
	}
	public Key changeKey(boolean processed) {
		isProcessed = processed;
		return this;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Key)) return false;

		Key key = (Key) o;

		if (getKeyUnique() != key.getKeyUnique()) return false;
		return isProcessed() == key.isProcessed();

	}

	@Override
	public int hashCode() {
		int result = getKeyUnique();
		result = 31 * result + (isProcessed() ? 1 : 0);
		return result;
	}
}
