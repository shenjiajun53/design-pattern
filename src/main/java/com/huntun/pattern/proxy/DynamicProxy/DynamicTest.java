package com.huntun.pattern.proxy.DynamicProxy;


import com.huntun.pattern.proxy.DynamicProxy.CGLib.CGAgency;
import com.huntun.pattern.proxy.DynamicProxy.jdk.Agency;
import com.huntun.pattern.proxy.StaticProxy.Person;
import com.huntun.pattern.proxy.StaticProxy.Son;

/**
 * Created by shenjiajun on 2019/04/02 18:41.
 */
public class DynamicTest {
    public static void main(String[] args) {
        Agency agency = new Agency();
        Person person = (Person) agency.getInstance(new Son());
        person.findLove();


        Renter renter = (Renter) agency.getInstance(new Student());
        renter.rentHouse();


        CGAgency cgAgency = new CGAgency();
        try {
            Son son = (Son) cgAgency.getInstance(Son.class);
            son.findLove();

            Student student = (Student) cgAgency.getInstance(Student.class);
            student.rentHouse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
