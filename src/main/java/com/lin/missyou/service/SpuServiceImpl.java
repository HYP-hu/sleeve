package com.lin.missyou.service;

import com.lin.missyou.model.Spu;
import com.lin.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService{


    @Autowired
    private SpuRepository spuRepository;

    @Override
    public Spu getSpu(Long id) {
        Spu spu = spuRepository.findOneById(id);
        return spu;
    }

    @Override
    public Page<Spu> getLatestPagingSpu(Integer pageNum, Integer size) {
        Sort sort = Sort.by("createTime").descending();
        Pageable page = PageRequest.of(pageNum, size, sort);
        return this.spuRepository.findAll(page);
    }

}
