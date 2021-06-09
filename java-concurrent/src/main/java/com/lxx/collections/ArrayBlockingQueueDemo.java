package com.lxx.collections;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * <url title="微信文章">https://mp.weixin.qq.com/s/UYE7PPW_QvnAwTsEG5zGQw</url>
 *
 * 入队阻塞：当队列中的元素个数等于队列长度时，会阻塞向队列中放入元素的操作，当有出队操作取走队列中元素，队列出现空缺位置后，才会再进行入队
 * 出队阻塞：当队列中的元素为空时，执行出队操作的线程将被阻塞，直到队列不为空时才会再次执行出队操作。在上面的代码的出队线程中，我们故意将出队的次数设为了队列中元素数量加一，因此这个线程最后会被一直阻塞，程序将一直执行不会结束
 * @Author lixiaoxiang
 */
public class ArrayBlockingQueueDemo {

    private static void queueTest() throws InterruptedException {
        ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(3);
        int size=7;
        Thread putThread=new Thread(()->{
            for (int i = 0; i <size ; i++) {
                try {
                    queue.put(i);
                    System.out.println("PutThread put: "+i+" - Size:"+queue.size());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread takeThread = new Thread(() -> {
            for (int i = 0; i < size+1 ; i++) {
                try {
                    Thread.sleep(3000);
                    System.out.println("TakeThread take: "+queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        putThread.start();
        Thread.sleep(1000);
        takeThread.start();
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueueDemo.queueTest();
    }
}
