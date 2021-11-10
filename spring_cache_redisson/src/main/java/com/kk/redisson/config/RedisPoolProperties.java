package com.kk.redisson.config;

import lombok.Data;
import lombok.ToString;

/**
 * @author luokexiong
 * @version 1.0 2020/12/25
 * @since 1.0.0
 */
@Data
@ToString
public class RedisPoolProperties {
    private int minimumIdleSize;

    private int connectTimeout;

    private int idleConnectionTimeout;

    private int size;
}
