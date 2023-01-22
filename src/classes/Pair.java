package classes;

public class Pair<K,V> {		// <> com dos letras maiusculas dentro, DATOS GENERICOS

	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
// Getter & Setters
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	
@Override
	public String toString() {
		return "Key = " + this.key + ", Value = " + this.value;
	}
	
}
