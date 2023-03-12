package com.ayoh.coreshop.service;

// import com.ayoh.coreshop.dto.ProductDto;
import com.ayoh.coreshop.entity.Product;
import com.ayoh.coreshop.entity.ProductSellStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultProductService implements ProductService {

    @Override
    public List<Product> getProducts() {
        //여기서 미리 3개 정도 상품 데이터를 세팅
        //변수를 사용하는 이유: 재활용하기 위해서
        Product product1 = new Product();
        product1.setName("노스페이스 패딩 1");
        //product.setName(1_000_000_000);
        product1.setPrice(198_000);
        product1.setDetails("이건 우리 학창시절에 아주 유행했던 경량화 패딩입니다.");
        product1.setSellStatus(ProductSellStatus.FOR_SALE);
        product1.setRegisteredDate(LocalDateTime.now());

        Product product2 = new Product();
        product2.setName("노스페이스 패딩 2");
        //product.setName(1_000_000_000);
        product2.setPrice(158_000);
        product2.setDetails("이건 우리 학창시절에 아주 유행했던 경량화 패딩입니다.");
        product2.setSellStatus(ProductSellStatus.FOR_SALE);
        product2.setRegisteredDate(LocalDateTime.now());

        Product product3 = new Product();
        product3.setName("노스페이스 패딩 3");
        //product.setName(1_000_000_000);
        product3.setPrice(118_000);
        product3.setDetails("이건 우리 학창시절에 아주 유행했던 경량화 패딩입니다.");
        product3.setSellStatus(ProductSellStatus.FOR_SALE);
        product3.setRegisteredDate(LocalDateTime.now());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        return products;
    }
}
