package github.petterobam.serialver;

import java.io.ObjectStreamClass;

public class TestMain {
    public static void main(String[] args) {
        ObjectStreamClass st = ObjectStreamClass.lookup(Test1.class);
        System.out.println(st.getSerialVersionUID());
    }

    // cd /Users/oyj-petter/Workspace/Java ; /usr/bin/env
    // /Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home/bin/java
    // -Dfile.encoding=UTF-8 -cp
    // /var/folders/_b/q0tq8shs711c8k6m111vb7kh0000gn/T/cp_a44pwqdjbauhzgs9s6zspgm2e.jar
    // github.petterobam.serialver.TestMain
}
