package com.evergreen.scheduler.domain.model;

import lombok.Getter;

import java.io.Serializable;

/**
 * 1. MQ 전송용 메시지 (Serializable 객체로 정의)
 * 2. taskId 포함하여 추적 가능
 */
@Getter
public class NotificationMessage implements Serializable {

    private final TaskId taskId;
    private final String target; // "all" 또는 그룹
    private final String content; // 이번 주 기도자는 OOO입니다.

    public NotificationMessage(TaskId taskId, String target, String content) {
        this.taskId = taskId;
        this.target = target;
        this.content = content;
    }

    @Override
    public String toString() {
        return "NotificationMessage{" +
            "taskId=" + taskId +
            ", target='" + target + '\'' +
            ", content='" + content + '\'' +
            '}';
    }
}
