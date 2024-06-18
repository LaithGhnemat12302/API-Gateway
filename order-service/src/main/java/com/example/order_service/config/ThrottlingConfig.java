//package com.example.order_service.config;
//import io.github.resilience4j.ratelimiter.RateLimiter;
//import io.github.resilience4j.ratelimiter.RateLimiterConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.Duration;
//
////This configuration sets up a rate limiter with 10 requests allowed per second.
//@Configuration
//public class ThrottlingConfig {
//
//    @Bean
//    public RateLimiter rateLimiter() {
//        return RateLimiter.of("myRateLimiter",
//                RateLimiterConfig.custom()
//                        .limitForPeriod(10) // 10 requests per period
//                        .limitRefreshPeriod(Duration.ofSeconds(1)) // 1 second
//                        .build());
//    }
//}
