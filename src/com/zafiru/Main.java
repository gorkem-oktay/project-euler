package com.zafiru;

import com.zafiru.problems.Problem;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Map<Integer, Problem> problems = new HashMap<>();

        File folder = new File(Main.class.getResource("problems/").getFile());

        for (int i = 1; i < folder.listFiles().length; i++)
        {
            Class<Problem> problem = (Class<Problem>) Class.forName("com.zafiru.problems.Problem" + i);
            problems.put(i, problem.getDeclaredConstructor().newInstance());
        }

        System.out.println(problems.get(9).answer());
    }
}
