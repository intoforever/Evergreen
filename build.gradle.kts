plugins {
    kotlin("jvm") version "1.9.0" apply false
    id("java")
    id("org.springframework.boot") version "3.2.5" apply false
    id("io.spring.dependency-management") version "1.1.4" apply false
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

allprojects {
    group = "com.evergreen"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

subprojects {

    // ────────────────────────────────────────────────────────────────────────
    // 1) 공통 플러그인
    // ────────────────────────────────────────────────────────────────────────
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    // ────────────────────────────────────────────────────────────────────────
    // 2) 공통 의존성 선언
    // ────────────────────────────────────────────────────────────────────────
    dependencies {
        // Spring
        implementation("org.springframework.boot:spring-boot-starter:3.2.5")
        implementation("org.springframework.boot:spring-boot-devtools:3.2.5")
        implementation("org.springframework.boot:spring-boot-starter-web:3.2.5")
        implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.5") // JPA
        implementation("org.springframework.boot:spring-boot-starter-data-redis:3.2.5") // REDIS
        testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.5") // JUnit5

        // Lombok
        implementation("org.projectlombok:lombok:1.18.30")
        annotationProcessor("org.projectlombok:lombok:1.18.30")

        // PostgreSQL
        runtimeOnly("org.postgresql:postgresql:42.7.3")
    }
}
