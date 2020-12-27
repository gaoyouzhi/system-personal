package com.haochang.spring.mapper;

import com.haochang.spring.model.TProduct;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

public interface TProductMapper {
    @Delete({
        "delete from t_product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into t_product (id, name, ",
        "price, category, ",
        "stock)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=DECIMAL}, #{category,jdbcType=VARCHAR}, ",
        "#{stock,jdbcType=INTEGER})"
    })
    int insert(TProduct record);

    @Select({
        "select",
        "id, name, price, category, stock",
        "from t_product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER)
    })
    TProduct selectByPrimaryKey(Long id);

    @Select({
        "select",
        "id, name, price, category, stock",
        "from t_product"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER)
    })
    List<TProduct> selectAll();

    @Update({
        "update t_product",
        "set name = #{name,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=DECIMAL},",
          "category = #{category,jdbcType=VARCHAR},",
          "stock = #{stock,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TProduct record);
}