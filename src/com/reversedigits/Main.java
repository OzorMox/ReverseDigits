package com.reversedigits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        int answer = reverseDigits(17382);
        System.out.println(answer);
    }

    public static int reverseDigits(int N)
    {
        List<Integer> digits = new ArrayList<Integer>();
        while (N > 0)
        {
            digits.add(N % 10);
            N /= 10;
        }
        Collections.sort(digits, Collections.reverseOrder());

        int answer = 0;
        for (int digit : digits)
        {
            answer *= 10;
            answer += digit;
        }

        return answer;
    }
}
