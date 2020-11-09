package com.haochang.spring.cache;


import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 描述：用户缓存
 * @author: youzhi.gao
 * @date: 2020-11-09 10:51
 */
public class UserCache {

    public static final ConcurrentHashMap<Object, Object> userCache = new ConcurrentHashMap<Object, Object>();

    public static ConcurrentHashMap<Object, Object> getUserCache() {
        return userCache;
    }


    public Object get(Object k){
        Object value = null;
        while (true){
            if(value == null){
                value = userCache.get(k);
            }

            if(value != null){
                return value;
            }
        }
    }
}
