package github.petterobam.serialver;

import java.io.Serializable;

public class Test1 implements Serializable {
    private long l1;
    private int i2;
    private String s3;

    public long getL1() {
        return l1;
    }

    public void setL1(long l1) {
        this.l1 = l1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }
}