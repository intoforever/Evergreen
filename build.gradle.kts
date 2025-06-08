plugins {
    alias(libs.plugins.spring.boot) apply false
    alias(libs.plugins.spring.dependency.management) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    id("java")
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
    val libs = rootProject.libs
    dependencies {
        // Spring
        implementation(libs.spring.boot.starter)
        implementation(libs.spring.boot.starter.web)
        implementation(libs.spring.boot.devtools)
        implementation(libs.spring.boot.starter.data.jpa)
        implementation(libs.spring.boot.starter.data.redis)
        testImplementation(libs.spring.boot.starter.test)

        // Lombok
        implementation(libs.lombok)
        annotationProcessor(libs.lombok)

        // DB
        runtimeOnly(libs.postgresql)

        // Jackson
        implementation(libs.jackson.databind)
    }
}
