package repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
    void add(T item);
    void edit(List<T> items);
}

