package com.evergreen.scheduler.domain.model;

import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 1. toNotificationMessage()로 MQ 메시지 변환
 */
@Getter
public class ScheduleTask {

    private final TaskId taskId;
    private final String prayerNm;
    private final LocalDateTime scheduledTime;

    public ScheduleTask(TaskId taskId, String prayerNm, LocalDateTime scheduledTime) {
        this.taskId = taskId;
        this.prayerNm = prayerNm;
        this.scheduledTime = scheduledTime;
    }

    public NotificationMessage toNotificationMessage() {
        String content = "이번 주 대표 기도자는 " + prayerNm + "입니다 🙏🏻";
        return new NotificationMessage(taskId, "all", content);
    }
}
