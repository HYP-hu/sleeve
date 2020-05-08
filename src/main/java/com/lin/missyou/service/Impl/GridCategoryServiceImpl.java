package com.lin.missyou.service.Impl;

import com.lin.missyou.model.GridCategory;
import com.lin.missyou.repository.GridCategoryRepository;
import com.lin.missyou.service.GridCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GridCategoryServiceImpl implements GridCategoryService {
    @Autowired
    private GridCategoryRepository gridCategoryRepository;

    @Override
    public List<GridCategory> getGridCategoryList() {
        return gridCategoryRepository.findAll();
    }
}
