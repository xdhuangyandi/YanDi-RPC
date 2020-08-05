package top.huangyandi.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.huangyandi.rpc.annotation.Service;
import top.huangyandi.rpc.api.HelloObject;
import top.huangyandi.rpc.api.HelloService;

/**
 * @author huangyandi
 */
@Service
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到消息：{}", object.getMessage());
        return "这是Impl1方法";
    }

}
