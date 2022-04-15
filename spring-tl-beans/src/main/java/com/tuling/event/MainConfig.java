//package com.tuling.event;
//
//import com.tuling.parsebeandefinition.CompentC;
//import com.tuling.parsebeandefinition.CompentD;
//import com.tuling.parsebeandefinition.TulingImportBeanfinitionRegister;
//import com.tuling.parsebeandefinition.TulingImportSelect;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.*;
//import org.springframework.context.event.ApplicationEventMulticaster;
//import org.springframework.context.event.SimpleApplicationEventMulticaster;
//import org.springframework.core.task.SimpleAsyncTaskExecutor;
//import org.springframework.scheduling.annotation.EnableAsync;
//
///**
// * Created by xsls on 2019/7/15.
// */
//@Configuration
//@ComponentScan(basePackages = {"com.tuling.event"})
////@EnableAsync  异步事件
//public class MainConfig {
//
//   /*往SimpleApplicationEventMulticaster设置taskExecutor则为异步事件
//     或者使用@Async*/
//    /*@Bean(name = "applicationEventMulticaster")
//    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
//        SimpleApplicationEventMulticaster eventMulticaster
//                = new SimpleApplicationEventMulticaster();
//
//        //ThreadPoolTaskExecutor
//        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
//        return eventMulticaster;
//    }*/
//
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
//		Order order = new Order();
//		order.setId(1);
//		System.out.println("下单");
//
//		ctx.publishEvent(new OrderEvent(order, "减库存....."));
//	}
//
//
//
//}
