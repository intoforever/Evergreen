plugins {
    kotlin("jvm") version libs.versions.kotlin.jvm.get() apply false
    id("org.springframework.boot") version libs.versions.spring.boot.get() apply false
    id("io.spring.dependency-management") version libs.versions.spring.dependency.management.get() apply false
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
    }

    dependencies {
        // Spring
        implementation(libs.spring.boot.starter)
        implementation(libs.spring.boot.devtools)
        implementation(libs.spring.boot.starter.data.jpa) // JPA
        implementation(libs.spring.boot.starter.data.redis) // REDIS
        testImplementation(libs.spring.boot.starter.test) // JUnit5

        // Lombok
        implementation(libs.lombok)
        annotationProcessor(libs.lombok)

        // PostgreSQL
        runtimeOnly(libs.postgresql)
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}
