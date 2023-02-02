package com.practice.chapter_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rth
 * @description:
 *      VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 *      JDK版本调整为1.6以后，直接运行可能会出现一些问题，需要调整一些idea设置
 *      1. setting --> java Compiler --> 调整对应 module的 Target bytecode version级别
 *      2. project structure --> modules --> 对应模块的 language level 为 6
 * @date 2023/2/1
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        // 使用list保持常量池引用，避免FULL GC回收常量池行为
        List<String> list = new ArrayList<String>();
        // 10MB的PermSize在integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
