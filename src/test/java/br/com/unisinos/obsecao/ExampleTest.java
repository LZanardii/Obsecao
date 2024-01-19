package br.com.unisinos.obsecao;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
public class ExampleTest {

  @BeforeAll
  static void setup() {
    log.info("@BeforeAll - executes once before all test methods in this class");
  }

  @BeforeEach
  void init() {
    log.info("@BeforeEach - executes before each test method in this class");
  }

  @AfterEach
  void tearDown() {
    log.info("@AfterEach - executed after each test method.");
  }

  @AfterAll
  static void done() {
    log.info("@AfterAll - executed after all test methods.");
  }

  @Test
  void runBefore(){

  }
}
