package top.huangyandi.rpc.transport;

import top.huangyandi.rpc.serializer.CommonSerializer;

/**
 * 服务器类通用接口
 *
 * @author huangyandi
 */
public interface RpcServer {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    void start();

    <T> void publishService(T service, String serviceName);

}
