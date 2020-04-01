package com.chl.systemservices.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/27 17:28
 */
public interface BaseMapper<T> extends Mapper {

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
