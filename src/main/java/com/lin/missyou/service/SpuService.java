package com.lin.missyou.service;

import com.lin.missyou.model.Spu;

import java.util.List;

public interface SpuService {
    Spu getById(Long id);
    Spu getSpu(Long id);
    List<Spu> getLatestPagingSpu();
}
