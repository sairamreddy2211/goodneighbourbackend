plugins {
	java
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.goodneighbour"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.postgresql:postgresql:42.2.22")
	implementation("io.jsonwebtoken:jjwt-api:0.12.6")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.4")
	implementation("org.springframework.boot:spring-boot-devtools:3.3.4")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
