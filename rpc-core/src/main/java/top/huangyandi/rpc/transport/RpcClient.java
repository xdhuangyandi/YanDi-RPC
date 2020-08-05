package top.huangyandi.rpc.transport;

import top.huangyandi.rpc.entity.RpcRequest;
import top.huangyandi.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 * @author huangyandi
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
