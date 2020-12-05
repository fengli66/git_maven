package redistest;

import redis.clients.jedis.Jedis;
import uilt.RedisUtil;

/**
 *
 */
public class RedisTest1 {
    public static void main(String[] args) {
        Jedis jedis = RedisUtil.getJedis();

    }


}
