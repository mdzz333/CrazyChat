package com.crazychat.chat.client;

import com.crazychat.chat.client.impl.UserClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "crazychat-user", fallback = UserClientImpl.class)
public interface UserClient {
    /**
     * 获取用户名
     * @param userId
     * @return
     */
    @GetMapping("/name/{user_id}")
    String getUserNameById(@PathVariable("user_id") String userId);

    /**
     * 获取用户id
     * @param userId
     * @return
     */
    @GetMapping("/user_id/{user_id}")
    String getUserAvatarById(@PathVariable("user_id") String userId);
}