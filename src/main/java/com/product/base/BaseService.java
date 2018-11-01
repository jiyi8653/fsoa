package com.product.base;

import java.util.List;
import java.util.Map;

public abstract class BaseService<E> {

	protected abstract BaseDao<E> getMapper();

	public E get(Object id) {
		return getMapper().get(id);
	}

	public List<E> list(Map<String, Object> param) {
		return getMapper().list(param);
	}

	public int count(Map<String, Object> param) {
		return getMapper().count(param);
	}

	public boolean save(E entity) {
		return getMapper().save(entity) > 0 ? true : false;
	}

	public boolean update(E entity) {
		return getMapper().update(entity) > 0 ? true : false;
	}

	public boolean remove(Integer id) {
		return getMapper().remove(id) > 0 ? true : false;
	}

	public boolean batchRemove(Integer[] ids) {
		return getMapper().batchRemove(ids) == ids.length ? true : false;
	}

}
