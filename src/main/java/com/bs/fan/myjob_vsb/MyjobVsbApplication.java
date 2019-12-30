package com.bs.fan.myjob_vsb;

import com.bs.fan.myjob_vsb.controller.mainframe.MainFrameController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
@EnableCaching
public class MyjobVsbApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=
                new SpringApplicationBuilder(MyjobVsbApplication.class)
                        .headless(false).run(args);

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrameController mfc=context.getBean(MainFrameController.class);
                mfc.prepareAndOpenFrame();
            }
        });

    }

}
