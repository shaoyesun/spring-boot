package com.example.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 17-2-15.
 */
@Controller
public class WebsocketController {

    private static final Logger log = LoggerFactory.getLogger(WebsocketController.class);

    @MessageMapping("/welcome")//1.从页面接收消息
    @SendTo("/topic/getResponse")//2.向页面推送消息
    public WiselyResponse say(WiselyMessage message) throws Exception {
        return new WiselyResponse("Welcome, " + message.getName() + "!");
    }

    @RequestMapping("/websocket")
    String websocketTest() {
        log.info("websocketTest");
        return "websocket";
    }

}
