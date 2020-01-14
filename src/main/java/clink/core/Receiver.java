package clink.core;

import java.io.Closeable;
import java.io.IOException;

public interface Receiver extends Closeable {

    /**
     * 用来回调第一层缓冲发送到数据信息
     */
    void setReceiveListener(IoArgs.IoArgsEventProcessor processor);

    /**
     * 到IOProvider中进行注册
     */
    boolean postReceiveAsync() throws IOException;

    /**
     * 获取读取数据的时间
     *
     * @return 毫秒
     */
    long getLastReadTime();
}
