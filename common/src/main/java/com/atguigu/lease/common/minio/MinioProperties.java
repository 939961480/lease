package com.atguigu.lease.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * lease
 *
 * @author ChenWei
 * &#064;date 2024-09-12 22:38
 * description:
 */
@ConfigurationProperties(prefix = "minio")
@Data
public class MinioProperties {

    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucketName;

}
