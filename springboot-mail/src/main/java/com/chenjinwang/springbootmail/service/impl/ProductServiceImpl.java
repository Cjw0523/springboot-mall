package com.chenjinwang.springbootmail.service.impl;

import com.chenjinwang.springbootmail.dao.ProductDao;
import com.chenjinwang.springbootmail.model.Product;
import com.chenjinwang.springbootmail.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
