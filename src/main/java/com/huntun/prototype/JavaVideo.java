package com.huntun.prototype;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by shenjiajun on 2019/04/02 17:04.
 */
@Data
public class JavaVideo implements Serializable {
    public String videoName;
    public Long videoLength;

    public JavaVideo(String videoName, Long videoLength) {
        this.videoName = videoName;
        this.videoLength = videoLength;
    }
}
