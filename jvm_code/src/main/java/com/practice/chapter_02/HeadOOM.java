package com.practice.chapter_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rth
 * @description: Java堆内存溢出异常测试
 *      VM args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *      将堆的最小值（-Xms20m）和最大值（-Xms20m）设置为一样，可以避免堆自动扩展
 *      -XX:+HeapDumpOnOutOfMemoryError 可以让虚拟机出现内存溢出异常时Dump出当前的内存堆转储快照以便事后进行分析。
 * @date 2023/2/1
 */
public class HeadOOM {
    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
