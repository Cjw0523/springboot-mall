package com.chenjinwang.springbootmail.dao;

import com.chenjinwang.springbootmail.dto.ProductRequest;
import com.chenjinwang.springbootmail.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
