package com.haochang.spring.mapper;

import com.haochang.spring.model.TStock;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TStockMapper {
    @Delete({
        "delete from t_stock",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into t_stock (id, name, ",
        "product_id, amount)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{productId,jdbcType=BIGINT}, #{amount,jdbcType=BIGINT})"
    })
    int insert(TStock record);

    @Select({
        "select",
        "id, name, product_id, amount",
        "from t_stock",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.BIGINT)
    })
    TStock selectByPrimaryKey(Long id);

    @Select({
        "select",
        "id, name, product_id, amount",
        "from t_stock"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.BIGINT)
    })
    List<TStock> selectAll();

    @Update({
        "update t_stock",
        "set name = #{name,jdbcType=VARCHAR},",
          "product_id = #{productId,jdbcType=BIGINT},",
          "amount = #{amount,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TStock record);
}