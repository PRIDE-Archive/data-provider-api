package uk.ac.ebi.pride.archive.dataprovider.common;

import java.io.Serializable;
import java.util.Objects;

/**
 * Data structure contains three elements
 *
 * @author rwang
 * Date: 24/06/11
 * Time: 14:20
 */
public class Triple<K, V, T> implements Serializable{
    private K first;
    private V second;
    private T third;

    public Triple(K first, V second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triple)) return false;

        Triple triple = (Triple) o;

        return (Objects.equals(first, triple.first)) && !(!Objects.equals(second, triple.second)) && !(!Objects.equals(third, triple.third));

    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        return result;
    }
}
