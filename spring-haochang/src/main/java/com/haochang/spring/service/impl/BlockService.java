package com.haochang.spring.service.impl;

import com.haochang.spring.service.BaseService;
import org.codehaus.jackson.map.Serializers.Base;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: 描述：实现接触接口
 * @author: youzhi.gao
 * @date: 2020-10-22 20:19
 */
@Component("baseService")
public class BlockService implements BaseService {
}
