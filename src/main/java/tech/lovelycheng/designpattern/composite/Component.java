package tech.lovelycheng.designpattern.composite;

import java.util.ArrayList;

/**
 * @author chengtong
 * @date 2020/6/30 19:18
 */
public class Component {

    String name;

    ArrayList<Component> subs = new ArrayList<>();

    public Component(String name){
        this.name=name;
    }

    public void addSub(Component component){
        subs.add(component);
    }

    public String print(){

        StringBuilder builder = new StringBuilder("print ");
        builder.append(this.getClass().getSimpleName()).append("(").append(this.name).append(")").append("\n");

        for(Component sub:subs){
            builder.append(sub.print());
        }

        return builder.toString();
    }


}
