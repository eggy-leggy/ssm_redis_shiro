package com.ibm.test.redis;

import redis.clients.jedis.ShardedJedis;

public interface IRedisDataSource {

	public abstract ShardedJedis getRedisClient();
    public void returnResource(ShardedJedis shardedJedis);
    public void returnResource(ShardedJedis shardedJedis,boolean broken);
    
}
