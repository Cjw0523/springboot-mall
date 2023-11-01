package com.chenjinwang.springbootmail.service;

import com.chenjinwang.springbootmail.dto.ProductRequest;
import com.chenjinwang.springbootmail.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
