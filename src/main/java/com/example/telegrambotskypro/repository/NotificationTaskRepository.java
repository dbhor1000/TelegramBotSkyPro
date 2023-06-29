package com.example.telegrambotskypro.repository;

import com.example.telegrambotskypro.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {
}
