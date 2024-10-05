package com.atguigu.lease.common.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * lease
 *
 * @author ChenWei
 * &#064;date 2024-09-12 22:25
 * description:
 */
@Configuration
@EnableConfigurationProperties(MinioProperties.class)
public class MinioConfiguration {
    @Autowired
    private MinioProperties minioProperties;

    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder().endpoint(minioProperties.getEndpoint()).credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey()).build();
    }
}
