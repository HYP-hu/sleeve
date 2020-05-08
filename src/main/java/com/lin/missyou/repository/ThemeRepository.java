package com.lin.missyou.repository;

import com.lin.missyou.model.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
    @Query("select t from Theme t where t.name in (:names)")
    // @Param的作用是重命名 然后带入到JPQL语句中
    List<Theme> findByNames(@Param("names") List<String> names);
    // Optional避免空指针得出现
    Optional<Theme> findByName(String name);
}
