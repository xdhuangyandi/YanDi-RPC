package top.huangyandi.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 * @author huangyandi
 */
public interface LoadBalancer {

    Instance select(List<Instance> instances);

}
