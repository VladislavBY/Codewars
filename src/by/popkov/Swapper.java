package by.popkov;

import java.util.Arrays;

class Swapper{

    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        arguments[0] = args[1];
        arguments[1] = temp;
    }

    public static void main(String[] args) {
        Swapper a = new Swapper(new Object[]{1,2});
        a.swapValues();
        System.out.println(Arrays.toString(a.arguments));
    }
}
