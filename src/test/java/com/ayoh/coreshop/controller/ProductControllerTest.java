package com.ayoh.coreshop.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

// import static org.junit.jupiter.api.Assertions.*;
/**
 * 컨트롤러 클래스.
  * */
@WebMvcTest(controllers = ProductController.class)
class ProductControllerTest {

    @Test
    @DisplayName("")
    void getProductPage() {
    }
}