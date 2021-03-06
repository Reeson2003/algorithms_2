package ru.reeson2003.task3.table;

public interface HashTable<T> extends Iterable<T> {

    void add(T value);

    void remove(T value);

    boolean contains(T value);

    String print();

    void unite(HashTable<T> another);

    void intersect(HashTable<T> another);

    void differ(HashTable<T> another);

    void symDiffer(HashTable<T> another);
}
