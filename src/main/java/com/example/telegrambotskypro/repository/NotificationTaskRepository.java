package com.example.telegrambotskypro.repository;

import com.example.telegrambotskypro.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);

    List<NotificationTask> findAllByNotificationDateTimeAndChatId(LocalDateTime localDateTime, long chatId);

    @Modifying
    @Query("DELETE FROM NotificationTask  WHERE message like %:nameLike%")
    void removeAllLike(@Param("nameLike") String nameLike);

}
