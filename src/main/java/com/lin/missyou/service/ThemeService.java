package com.lin.missyou.service;

import com.lin.missyou.model.Theme;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ThemeService {
    List<Theme> findByNames(List<String> names);
    Optional<Theme> findByName(String name);
}
