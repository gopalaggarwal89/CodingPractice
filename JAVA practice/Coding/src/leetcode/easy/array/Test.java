package leetcode.easy.array;

import info.learn.oops.User;

import java.util.Optional;

public class Test
{

    public static void main(String[] args)
    {
        Optional<User> data = null;

        if(data.isPresent()){
            System.out.println("Success");
        }else
        {
            System.out.println("Failure");
        }
    }
}
