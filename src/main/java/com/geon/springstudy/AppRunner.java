package com.geon.springstudy;

import com.geon.springstudy.domain.scope.Proto;
import com.geon.springstudy.domain.scope.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    private ApplicationContext ac;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("proto");
        System.out.println(ac.getBean(Proto.class));
        System.out.println(ac.getBean(Proto.class));
        System.out.println(ac.getBean(Proto.class));

        System.out.println("single");
        System.out.println(ac.getBean(Single.class));
        System.out.println(ac.getBean(Single.class));
        System.out.println(ac.getBean(Single.class));

        System.out.println("proto by single");
        System.out.println(ac.getBean(Single.class).getProto());
        System.out.println(ac.getBean(Single.class).getProto());
        System.out.println(ac.getBean(Single.class).getProto());

    }
}
