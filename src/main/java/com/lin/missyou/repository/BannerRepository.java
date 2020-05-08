package com.lin.missyou.repository;

import com.lin.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//@Repository 仓储
public interface BannerRepository extends JpaRepository<Banner, Long> {
//    @Query(value = "select id from Spu where id =?1")
    Banner findOneById(Long id);
    Banner findOneByName(String name);
}
