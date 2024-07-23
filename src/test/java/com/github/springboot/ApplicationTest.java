package com.github.springboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {
  @Autowired private TestRestTemplate restTemplate;

  @Test
  public void helloControllerTest() {
    String body = this.restTemplate.getForObject("/hello", String.class);
    assertThat(body).isEqualTo("Hello world!");
  }
}
