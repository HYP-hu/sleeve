package com.lin.missyou.service;

import com.lin.missyou.model.Spu;
import com.lin.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService{

    @Autowired
    private SpuRepository spuRepository;

    @Override
    public Spu getById(Long id) {
        Spu spu = spuRepository.findOneById(id);
        return spu;

    }

    @Override
    public Spu getSpu(Long id) {
        Spu spu = spuRepository.findOneById(id);
        return spu;
    }

    @Override
    public List<Spu> getLatestPagingSpu() {
        return this.spuRepository.findAll();
    }
}
