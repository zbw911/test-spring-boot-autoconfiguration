package com.thirdlev.tttt.Impl;

import com.thirdlev.tttt.DoSth;
import org.springframework.stereotype.Service;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 9:25.
 */
@Service
public class DoSthImpl implements DoSth {
    @Override
    public String sayhello() {
        return "hello";
    }
}
