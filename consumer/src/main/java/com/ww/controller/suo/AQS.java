package com.ww.controller.suo;


import jdk.nashorn.internal.runtime.regexp.joni.ast.Node;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created by 安利丹 on 2020/3/8.
 */
public class AQS {


    /** Marker to indicate a node is waiting in shared mode */
    // 标识节点在共享模式
//    static final Node SHARED = new Node();
    /** Marker to indicate a node is waiting in exclusive mode */
    // 标识节点在独占模式
    static final Node EXCLUSIVE = null;

    /** waitStatus value to indicate thread has cancelled */
    // 此线程已经取消
    static final int CANCELLED =  1;
    /** waitStatus value to indicate successor's thread needs unparking */
    // 标识当前节点的后继节点需要被唤醒
    static final int SIGNAL    = -1;
    /** waitStatus value to indicate thread is waiting on condition */
    // 线程在等待condition条件
    static final int CONDITION = -2;
    /**
     * waitStatus value to indicate the next acquireShared should
     * unconditionally propagate
     */
    //  共享模式node节点有可能处于这种状态，表示锁的下一次获取可以无条件传播
    static final int PROPAGATE = -3;

    /**
     * 取值范围
     *  SIGNAL: 当前节点对应的后继节点的线程需要被唤醒  -1
     *  CANCELLED: 此线程已经取消，可能中断或超时 1
     *  CONDITION: 此node节点处于条件队列中  -2
     *  PROPAGATE: 当前场景下后续的acquireShared能够得以执行。  -3
     *   0: 对于正常的同步节点，该字段初始化为0
     */
    volatile int waitStatus;

    volatile Node prev;

    volatile Node next;

    /**
     * The thread that enqueued this node.  Initialized on
     * construction and nulled out after use.
     */
    volatile Thread thread;

    Node nextWaiter;

    /**
     * Returns true if node is waiting in shared mode.
     */

    final Node predecessor() throws NullPointerException {
        Node p = prev;
        if (p == null)
            throw new NullPointerException();
        else
            return p;
    }



}
