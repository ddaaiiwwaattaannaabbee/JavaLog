package jp.techacademy.watanabe.dai.javalog;
import android.util.Log;

/**
 * Created by dai on 2018/03/11.
 */


public class Human extends Animal implements Thinkable{

    private String name;
    private int age;
    private String hobby;

    public Human(String name,int age,String hobby){

        this.name = name;
        this.age = age;
        this.hobby = hobby;

    }

    @Override
    public void say() {
        Log.d("javatest","私の名前は" + name +  "です。年は" + age + "歳です。」");
    }

    @Override
    public void think() {
        Log.d("javatest","「私は" + hobby + "について考える」");
    }
}
