package com.ayalamih;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * com.ayalamih
 *
 * @author ayalamih.
 * @date 3:36 PM, 25/01/2018
 * @contact 31007354@qq.com
 */
public class StaticBlockDemo {

    public final static String name;

    private static Timer timer = new Timer();

    static {
        name = "ayalamih";
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date().toString());
            }
        }, 1000L, 3000L);
        System.out.println("---静态块函数---StaticBlockDemo---");
    }

    public StaticBlockDemo() {
        System.out.println("---构造函数---StaticBlockDemo---");
    }

    public static void main(String[] args) {
        System.out.println(StaticBlockDemo.name);
        StaticBlockDemo.test();
        StaticBlockDemo demo = new StaticBlockDemo();
        demo.method();

        App app = new App("btcpay-android", "v1.0");
        System.out.println(app.getName());
    }

    public static void test() {
        System.out.println("静态方法");
    }

    public void method() {
        System.out.println("非静态方法");
    }

    private static class App {
        private String name;
        private String version;

        public App(String name, String version) {
            this.name = name;
            this.version = version;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getVersion() {
            return version;
        }
    }
}
