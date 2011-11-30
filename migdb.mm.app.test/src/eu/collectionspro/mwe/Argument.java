package eu.collectionspro.mwe;

/*
 * The class represents one workflow component argument as a key-value pair.  
 */
public class Argument {

	private String key;
	private Object value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
