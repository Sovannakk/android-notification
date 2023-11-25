package com.example.androidnotificationpushy;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
@AllArgsConstructor
public class AndroidNotificationController {

    private final AndroidNotificationService androidNotificationService;

    @PostMapping
    public String sendSamplePush(@RequestBody PushyPushRequest pushyPushRequest){
        androidNotificationService.sendSamplePush(pushyPushRequest);
        return "Success";
    }

    @GetMapping("/token")
    public void getDeviceToken(@RequestParam("token") String token){
        androidNotificationService.getDeviceToken(token);
    }
}
