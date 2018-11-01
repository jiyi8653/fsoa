package com.product.base;

import java.util.List;
import java.util.Map;

public interface BaseDao<E> {

	E get(Object id);

	List<E> list(Map<String, Object> param);

	int count(Map<String, Object> param);

	int save(E entity);

	int update(E entity);

	int remove(Integer id);

	int batchRemove(Integer[] ids);

}
