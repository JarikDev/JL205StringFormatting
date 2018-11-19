package com;

import java.text.MessageFormat;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        String s = "On 22.02.2017 was Hurricane";
        String s2 = "On 23.02.2017 was Sunny";
        String s3 = "On {1} was {0}";
        String s4 = MessageFormat.format(s3, "22.02.2017", "Tornado");
        System.out.println(s4);

        String s5 = "On {1,date,full} was {0}, {2,number,percent} buildings were destroyed !";
        String s6 = MessageFormat.format(s5, "Tornado", new GregorianCalendar(2017,3,22).getTime(),10);
        System.out.println(s6);

        String s55 = "On {1,date,full} was {0}, {2,choice,0#no houses|1#one house|2#{2} buildings}   were destroyed !";
        String s66 = MessageFormat.format(s55, "Tornado", new GregorianCalendar(2017,3,22).getTime(),11);
        System.out.println(s66);
    }
}


































