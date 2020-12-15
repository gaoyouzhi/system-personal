package com.haochang.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BaseMapper {
	@Select({"select id from sys_resource where id = 1"})
	public Long get() throws Exception;
}
