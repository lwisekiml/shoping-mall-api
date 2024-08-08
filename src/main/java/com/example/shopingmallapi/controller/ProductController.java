package com.example.shopingmallapi.controller;

import com.example.shopingmallapi.domain.Product;
import com.example.shopingmallapi.dto.AddProductDto;
import com.example.shopingmallapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Product addProduct(@RequestBody AddProductDto addProductDto) {
        return productService.addProduct(addProductDto);
    }

    @GetMapping
    public Page<Product> getProducts(@RequestParam(required = false, defaultValue = "0", name = "categoryId") Long categoryId, @RequestParam(required = false, defaultValue = "0", name = "page") int page) {
        int size = 10;
        if (categoryId == 0) {
            return productService.getProducts(page, size);
        } else {
            return productService.getProducts(categoryId, page, size);
        }
    }

    @GetMapping("/{id}")
    public Product getProducts(@PathVariable Long id) {
        return productService.getProduct(id);
    }
}
