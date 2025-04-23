plugins {
	id("java")
	id("org.springframework.boot") version "3.4.4"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.vulpuxmecatroncus"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(23)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")

	// Used to add local jar projects
	implementation(files("../../common/build/libs/common-1.0-SNAPSHOT.jar"))
	
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	
	testImplementation("org.mockito:mockito-core:5.5.0")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
	useJUnitPlatform()
	jvmArgs("-javaagent:" + configurations.testRuntimeClasspath.get().find { it.name.contains("byte-buddy-agent") })
	jvmArgs("-Xshare:off")
}
