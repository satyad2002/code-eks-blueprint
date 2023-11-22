package com.asx.holdiay.HolidayCalender;

import com.asx.holdiay.HolidayCalender.configuration.LocalDateConverter;
import com.asx.holdiay.HolidayCalender.configuration.LocalDateTimeConverter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;


@SpringBootApplication
@ComponentScan(basePackages = { "com.asx.holdiay.HolidayCalender", "com.asx.holdiay.HolidayCalender.api" , "com.asx.holdiay.HolidayCalender.configuration"})
public class HolidayCalenderApplication implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
        new SpringApplication(HolidayCalenderApplication.class).run(args);
    }

  

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
