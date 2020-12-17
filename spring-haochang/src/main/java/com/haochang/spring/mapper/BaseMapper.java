package com.haochang.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BaseMapper {
	@Select({"select stock from t_product where id = 26"})
	public Long getStock() throws Exception;
}
