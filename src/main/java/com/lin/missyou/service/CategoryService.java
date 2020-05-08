package com.lin.missyou.service;

import com.lin.missyou.model.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    Map<Integer, List<Category>> getAll();
}
