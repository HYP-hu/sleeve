package com.lin.missyou.repository;

import com.lin.missyou.model.BannerModel;
import org.springframework.boot.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository 仓储
public interface BannerRepository extends JpaRepository<BannerModel, Long> {
    BannerModel findOneById(Long id);
    BannerModel findOneByName(String name);
}
