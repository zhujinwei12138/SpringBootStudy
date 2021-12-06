package com.example.redisdemo.Config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import org.springframework.cache.interceptor.KeyGenerator;
import java.io.ObjectStreamException;
import java.lang.reflect.Method;

/**
 * FileName:RedisConfig
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 10:03:41
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {
    @Override
    @Bean
    public KeyGenerator keyGenerator()
    {
        return new KeyGenerator()
        {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                {
                    StringBuilder stringBuilder=new StringBuilder();
                    stringBuilder.append(target.getClass().getName());
                    stringBuilder.append(method.getName());
                    for(Object obj : params)
                    {
                        stringBuilder.append(obj.toString());
                    }
                    return stringBuilder.toString();
                }
            }
        };
    }
    @SuppressWarnings("rawtypes")
    @Bean
    //缓存管理器

    public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheManager cacheManager = RedisCacheManager.create(connectionFactory);
        //设置缓存过期时间

        return cacheManager;
    }

    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
        StringRedisTemplate template = new StringRedisTemplate(factory);
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
}
