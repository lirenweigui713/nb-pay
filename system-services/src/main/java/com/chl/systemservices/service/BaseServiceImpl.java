package com.chl.systemservices.service;

import com.chl.common.model.AnnotationResult;
import com.chl.systemservices.mapper.BaseMapper;
import com.chl.systemservices.utils.AnnotationUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/27 17:36
 */
// 测试使用反射获取注解上表名和直接写表名得性能损失
public class BaseServiceImpl<T> implements BaseService<T>{

    BaseMapper<T> baseMapper;


    @Override
    public T add(T entity) {
        AnnotationResult result = AnnotationUtil.getTableName(entity.getClass());
        if(!result.isSuccess()){

        }
        return null;
    }

    @Override
    public boolean addWithList(List<T> entityList) {
        return false;
    }

    @Override
    public boolean delete(T entity) {
        return false;
    }

    @Override
    public boolean deleteWithList(List<T> entityList) {
        return false;
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public List<T> updateWithList(List<T> entityList) {
        return null;
    }

    @Override
    public List<T> query(Map<String, Object> params) {
        return null;
    }

    @Override
    public T queryWithPK(Integer pk) {
        return null;
    }

    @Override
    public T queryWithPk(Long pk) {
        return null;
    }
}
