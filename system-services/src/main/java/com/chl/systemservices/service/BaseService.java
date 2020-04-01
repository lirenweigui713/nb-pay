package com.chl.systemservices.service;

import java.util.List;
import java.util.Map;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/27 17:21
 */
public interface BaseService<T> {

    T add(T entity);

    boolean addWithList(List<T> entityList);

    boolean delete(T entity);

    boolean deleteWithList(List<T> entityList);

    T update(T entity);

    List<T> updateWithList(List<T> entityList);

    List<T> query(Map<String,Object> params);

    T queryWithPK(Integer pk);

    T queryWithPk(Long pk);

}
