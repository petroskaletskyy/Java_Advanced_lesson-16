package ua.lviv.lgs.shared;

import java.util.List;

public interface AbstractCrud<T> {

	void create(T t);

	T read(int id);

	void update(T t, String property, String newValue) throws Exception;

	void delete(int id);

	List<T> readAll();

}
