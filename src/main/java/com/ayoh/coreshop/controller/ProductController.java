package com.ayoh.coreshop.controller;

import com.ayoh.coreshop.dto.ProductDto;
import com.ayoh.coreshop.entity.Product;
import com.ayoh.coreshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 스트레오타입 어노테이션
 *
 * 컨트롤러의 역할은 사용자의 요청을 받으면 필요한 작업을 담당하는 서비스에게 위임하고, 응답만 적절하게 받아서 뷰로 전달한다.
 */
@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public String getProductPage(Model model){
        List<Product> productDto = productService.getProducts();
        model.addAttribute("result", productDto);
        return "index";
    }

}
