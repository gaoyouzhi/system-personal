package com.haochang.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BaseMapper {
	@Select({"select 1 from dual"})
	public Long get() throws Exception;
}
