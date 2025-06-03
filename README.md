# 🌿 Evergreen
🐣 MSA 기반 알림봇 서비스 도전기

---

## 📌 프로젝트 개요

**Evergreen**은 교회 내 대표기도 알림 업무를 자동화하기 위해 기획된  
**카카오톡 기반 스케줄 알림 시스템**입니다.

매주 반복되는 수작업 알림 업무를 자동화하고,  
실제 사용자의 부담을 덜어드리는 것을 목표로 합니다.

> "사람이 직접 반복하던 알림 업무를 기술로 대신할 수 있을까?"  
> 라는 질문에서 출발한 사이드 프로젝트입니다.

---

## 🎯 프로젝트 목표

- ✨ **반복 업무 자동화**: 매주 카카오톡으로 기도자에게 자동 알림 발송  
- 📅 **정기 스케줄 기반 시스템**: 요일/시간 기준 자동 트리거  
- 💬 **사용자 친화적 인터페이스**: 별도 앱 없이 카카오톡 메시지로 알림 전달  
- 🧪 **백엔드 아키텍처 실험**: Docker, Redis, RabbitMQ, Kafka 등 주요 기술 직접 도입/비교

---

## 🧱 기술 스택 및 구조

| 영역 | 기술 스택 | 선택 이유 |
|------|------------|------------|
| Backend | Java 21 + Spring Boot 3 | REST API 구성 및 스케줄링에 적합 |
| Database | PostgreSQL | JPA와의 호환성과 SQL 표준 준수, 복잡한 타입 매핑 우수 |
| Infra | Docker + Jenkins + AWS EC2 | 일관된 배포 환경과 CI/CD 자동화 실습 |
| Frontend | React | 관리자 UI (스케줄 관리 및 로그 확인 등) |
| Messaging | KakaoTalk Friends API (또는 알림톡) | 사용자가 익숙한 채널, 인증 방식 검토 중 |
| Cache | Redis | 전송 이력 및 예약 상태 캐싱 |
| Message Queue | RabbitMQ | 알림 전송 작업 비동기 분리 및 처리 안정성 확보 |
| Event Stream | Kafka | 알림 이벤트를 스트리밍으로 수집 및 후처리 확장 기반 확보 |

---

## 🧠 학습 목적 및 의도

이번 프로젝트는 단순한 기능 구현을 넘어서,  
**실제 문제를 기술로 해결하고자 하는 기획-설계-실험 과정을 전부 경험하는 것**을 목표로 하고 있습니다.

특히 다음과 같은 역량을 체득하고자 합니다:

- **JPA와 SQL 표준 기반 설계의 궁합 이해**
- **Redis, RabbitMQ, Kafka 등 메시징/캐시 아키텍처 실전 적용**
- **Docker 기반 환경 구성과 Jenkins를 통한 자동화 배포 경험**

---

## 📎 관련 링크

- 📄 [Velog 기록 바로가기](https://velog.io/@intoforever)

---

## 🙋🏻‍♀️ Author

- **지현 한 (Han Ji-Hyun)**  
- Junior Backend Developer  
- 관심 기술: Spring, JPA, Infra, Messaging, Distributed Systems

---

> Evergreen처럼, 작지만 끊임없이 성장하는 백엔드 개발자가 되고 싶습니다. 🌿
