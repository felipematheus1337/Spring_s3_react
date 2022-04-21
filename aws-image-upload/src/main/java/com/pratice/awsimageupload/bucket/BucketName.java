package com.pratice.awsimageupload.bucket;


public enum BucketName {
    PROFILE_IMAGE("awsjava-image");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
