package com.lin.missyou.repository;

import com.lin.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository 仓储
public interface BannerRepository extends JpaRepository<Banner, Long> {

    Banner findOneById(Long id);
    Banner findOneByName(String name);
}
