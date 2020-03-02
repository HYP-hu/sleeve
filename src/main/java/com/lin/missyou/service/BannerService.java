package com.lin.missyou.service;


import com.lin.missyou.model.Banner;


public interface BannerService {
    Banner getByName(String name);
}

// 代码粒度 不够小 类 承担职责过多
// 替换难度很大

// 策略模式 interface
