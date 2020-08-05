package top.huangyandi.test;

import top.huangyandi.rpc.annotation.Service;
import top.huangyandi.rpc.api.ByeService;

/**
 * @author huangyandi
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
