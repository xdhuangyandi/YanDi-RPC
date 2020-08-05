package top.huangyandi.test;

import top.huangyandi.rpc.annotation.ServiceScan;
import top.huangyandi.rpc.serializer.CommonSerializer;
import top.huangyandi.rpc.transport.RpcServer;
import top.huangyandi.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 * @author huangyandi
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
