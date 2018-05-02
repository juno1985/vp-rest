package org.softcits.vp.controller;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

	 @Autowired
	 StringRedisTemplate stringRedisTemplate;
	 
	 @Test
	 public void whenAdd() {
		 stringRedisTemplate.opsForValue().set("k1", "v1", 60, TimeUnit.MINUTES);
	 }
	 
	 @Test
	 public void whenDel() {
		 stringRedisTemplate.delete("k1");
	 }
	 
	 @Test
	 public void whenGet() {
		 System.out.println(stringRedisTemplate.opsForValue().get("k1"));
	 }
	 
	 
}
