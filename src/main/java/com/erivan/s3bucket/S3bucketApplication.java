package com.erivan.s3bucket;

import com.amazonaws.services.s3.model.Bucket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.erivan.s3bucket.service.BucketServices.createBucket;
import static com.erivan.s3bucket.service.ObjectsServices.listObjects;
import static com.erivan.s3bucket.service.ObjectsServices.uploadObject;

@SpringBootApplication
public class S3bucketApplication {

	public static void main(String[] args) {

		SpringApplication.run(S3bucketApplication.class, args);

		//lista todos os buckets que eu tenho
//		listOfBuckets();

		//lista as informações que eu tenho a um bucket especifico
//		String bucket_name = "erivan-cledson-console2";
//		Bucket b = getBucket(bucket_name);
//		System.out.println(b.toString());

		//lista os objetos dentro do bucket
//		listObjects("erivan-cledson-console2");

		//enviando um novo arquivo para o bucket
//		String bucket_name = "erivan-cledson-console2";
//		Bucket b = createBucket(bucket_name);
//		if(b != null){
//			System.out.println(b.toString());
//			uploadObject(bucket_name, "ola.png");
//		}

	}

}
