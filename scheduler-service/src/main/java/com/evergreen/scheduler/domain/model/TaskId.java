package com.evergreen.scheduler.domain.model;

import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

/**
 * 1. 불변 객체
 * 2. UUID 기반 ID 생성
 * 3. ID기반 equals / hashCode 구현
 */
@Getter
public class TaskId {

    private final String value;

    public TaskId(String value) {
        this.value = value;
    }

    public static TaskId newId() {
        return new TaskId(UUID.randomUUID().toString());
    }

    public static TaskId from(String value) {
        return new TaskId(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaskId taskId = (TaskId) o;
        return Objects.equals(value, taskId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "TaskId{" +
            "value='" + value + '\'' +
            '}';
    }
}
