package com.chenjinwang.springbootmail.service;

import com.chenjinwang.springbootmail.dto.ProductQueryParams;
import com.chenjinwang.springbootmail.dto.ProductRequest;
import com.chenjinwang.springbootmail.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
