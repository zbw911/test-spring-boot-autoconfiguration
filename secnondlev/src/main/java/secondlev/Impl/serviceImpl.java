package secondlev.Impl;

import com.thirdlev.tttt.DoSth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import secondlev.MyService;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 9:27.
 */
@Service
public class serviceImpl implements MyService {

    @Autowired
    DoSth doSth;

    @Override
    public String niHao() {
        return doSth.sayhello();
    }
}
