package com.chenjinwang.springbootmail.service;

import com.chenjinwang.springbootmail.dto.ProductRequest;
import com.chenjinwang.springbootmail.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
