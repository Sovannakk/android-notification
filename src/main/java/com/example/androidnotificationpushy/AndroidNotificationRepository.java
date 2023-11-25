package com.example.androidnotificationpushy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndroidNotificationRepository extends JpaRepository<DeviceToken, Long> {
}
