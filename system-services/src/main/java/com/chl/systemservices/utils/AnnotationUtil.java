package com.chl.systemservices.utils;


import com.chl.common.annotation.TableName;
import com.chl.common.model.AnnotationResult;
import org.apache.commons.lang3.StringUtils;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/27 18:13
 */
public class AnnotationUtil {

    public static AnnotationResult getTableName(Class<?> clazz)  {
        AnnotationResult result = new AnnotationResult();
        if(clazz ==null){
            result.setErr_msg("Class File Is Null");
        }

        TableName tableName = clazz.getAnnotation(TableName.class);
        if(tableName==null){
            result.setErr_msg("Entity is missing annotation:@TableName");
            return result;
        }
        if(StringUtils.isBlank(tableName.tableName())){
            result.setErr_msg("Entity @TableName Value Can Be Not Null!");
        }
        result.setSuccess(true);
        result.setData(tableName.tableName());
        return result;
    }
}
