package otilor.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebsocketController {
    
    @MessageMapping("/sendMessage")
    @SendTo("/topic/updates")
    public String sendMessage(String message) {
        return message;
    }
}
