package uk.ac.ebi.pride.archive.dataprovider.common;


import java.io.Serializable;

/**
 * Tuple stores two elements.
 *
 * @quthor Yasset Perez-Riverol
 * @version $Id$
 */

public class Tuple <K, V> implements ITuple<K,V> {
    private K key;
    private V value;

    private int hashCode;

    public Tuple(K key, V value) {
        this.key = key;
        this.value = value;
        this.hashCode = computeHashCode();
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
        this.hashCode = computeHashCode();
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
        this.hashCode = computeHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple)) return false;

        Tuple tuple = (Tuple) o;

        return !(key != null ? !key.equals(tuple.key) : tuple.key != null) && !(value != null ? !value.equals(tuple.value) : tuple.value != null);

    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }

    private int computeHashCode(){
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}