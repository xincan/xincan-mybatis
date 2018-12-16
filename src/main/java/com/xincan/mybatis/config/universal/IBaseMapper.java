package com.xincan.mybatis.config.universal;


import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @Description: 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 * @author 张瑶
 * @date 2018/4/22 21:15
 */
@Repository("baseMapper")
public interface IBaseMapper<T> extends BaseMapper<T>, ConditionMapper<T>, IdsMapper<T>, InsertListMapper<T> {
}
