package com.example.androidnotificationpushy;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AndroidNotificationService {
    private final AndroidNotificationRepository androidNotificationRepository;
    public void sendSamplePush(PushyPushRequest pushyPushRequest) {
        try {
            PushyAPI.sendPush(pushyPushRequest);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public void getDeviceToken(String token) {
        DeviceToken deviceToken = new DeviceToken(null, token);
        androidNotificationRepository.save(deviceToken);
    }
}
