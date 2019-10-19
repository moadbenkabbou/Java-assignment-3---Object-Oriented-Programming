package com.company;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        char loopAgain;
        // SecureRandom
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        // While loop to repeat the program if user allows
        while (i >= 0)
        {
            int rand1 = 0, rand2 = 0, pos = 0, neg = 0, numQuest = 0, diff = 0, types = 0;
            double right = 0, x;
            // Choose arithmetic problems type
            System.out.println("Please pick a type of arithmetic problem to study. Enter your choice as an integer from 1-5");
            System.out.println("(1) Addition problems only");
            System.out.println("(2) Multiplication problems only");
            System.out.println("(3) Subtraction problems only");
            System.out.println("(4) Division problems only");
            System.out.println("(5) Random mixture of all types");
            types = scnr.nextInt();

            // Addition
            if (types == 1)
            {
                System.out.print("Please enter a difficulty level (1-4): ");
                diff = scnr.nextInt();
                // difficulty 1
                if (diff == 1)
                {
                    // stops at 10 questions
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        // random ints to be used
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                        x = scnr.nextDouble();
                        // if correct
                        if (x == rand1+rand2)
                        {
                            // increments right answers
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        // if wrong
                        else if (x != (rand1+rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        // stop if program reached 10 questions
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }

                    }
                }
                else if (diff == 2)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(100);
                        rand2 = rand.nextInt(100);
                        System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1+rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1+rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 3)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(1000);
                        rand2 = rand.nextInt(1000);
                        System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1+rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1+rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 4)
                {
                    while (numQuest >= 0) {
                        numQuest++;
                        rand1 = rand.nextInt(10000);
                        rand2 = rand.nextInt(10000);
                        System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1+rand2) {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        } else if (x != (rand1+rand2)) {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
            }
            // multiplication
            else if (types == 2)
            {

                System.out.print("Please enter a difficulty level (1-4): ");
                diff = scnr.nextInt();
                if (diff == 1)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1*rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1*rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }

                    }
                }
                else if (diff == 2)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(100);
                        rand2 = rand.nextInt(100);
                        System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1*rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1*rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 3)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(1000);
                        rand2 = rand.nextInt(1000);
                        System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1*rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1*rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 4)
                {
                    while (numQuest >= 0) {
                        numQuest++;
                        rand1 = rand.nextInt(10000);
                        rand2 = rand.nextInt(10000);
                        System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1 * rand2) {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        } else if (x != (rand1 * rand2)) {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
            }
            // subtraction
            else if (types == 3)
            {
                System.out.print("Please enter a difficulty level (1-4): ");
                diff = scnr.nextInt();
                if (diff == 1)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1-rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1-rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }

                    }
                }
                else if (diff == 2)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(100);
                        rand2 = rand.nextInt(100);
                        System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1-rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1-rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 3)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(1000);
                        rand2 = rand.nextInt(1000);
                        System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1-rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1-rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 4)
                {
                    while (numQuest >= 0) {
                        numQuest++;
                        rand1 = rand.nextInt(10000);
                        rand2 = rand.nextInt(10000);
                        System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1-rand2) {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        } else if (x != (rand1-rand2)) {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
            }
            // division
            else if (types == 4)
            {
                System.out.print("Please enter a difficulty level (1-4): ");
                diff = scnr.nextInt();
                if (diff == 1)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1/rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1/rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }

                    }
                }
                else if (diff == 2)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(100);
                        rand2 = rand.nextInt(100);
                        System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1/rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1/rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 3)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        rand1 = rand.nextInt(1000);
                        rand2 = rand.nextInt(1000);
                        System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1/rand2)
                        {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        }
                        else if (x != (rand1/rand2))
                        {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                else if (diff == 4)
                {
                    while (numQuest >= 0) {
                        numQuest++;
                        rand1 = rand.nextInt(10000);
                        rand2 = rand.nextInt(10000);
                        System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                        x = scnr.nextDouble();

                        if (x == rand1/rand2) {
                            right++;
                            pos = rand.nextInt(5);
                            switch (pos) {
                                case 1:
                                    System.out.println("Very good!");
                                    break;
                                case 2:
                                    System.out.println("Excellent!");
                                    break;
                                case 3:
                                    System.out.println("Nice work!");
                                    break;
                                case 4:
                                    System.out.println("Keep up the good work!");
                                    break;
                                default:
                                    System.out.println("Very good!");
                                    break;
                            }
                        } else if (x != (rand1/rand2)) {
                            neg = rand.nextInt(5);
                            switch (neg) {
                                case 1:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 2:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 3:
                                    System.out.println("Don’t give up!!");
                                    break;
                                case 4:
                                    System.out.println("No. Keep trying.");
                                    break;
                                default:
                                    System.out.println("No. Please try again.");
                                    break;
                            }
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
            }
            // random problems
            else if (types == 5)
            {
                System.out.print("Please enter a difficulty level (1-4): ");
                diff = scnr.nextInt();
                int randArith;
                // difficulty 1
                if (diff == 1)
                {
                    // until program reaches 10 questions
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        // random int between 0-3 for the 4 aritmetic problems in
                        // the switch cases below
                        randArith = rand.nextInt(4);
                        switch (randArith) {
                            // addition
                            case 0:
                                rand1 = rand.nextInt(10);
                                rand2 = rand.nextInt(10);
                                System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                                x = scnr.nextDouble();
                                // if right
                                if (x == (rand1+rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                // if wrong
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                                //multiplication
                            case 1:
                                rand1 = rand.nextInt(10);
                                rand2 = rand.nextInt(10);
                                System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1*rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                                // subtraction
                            case 2:
                                rand1 = rand.nextInt(10);
                                rand2 = rand.nextInt(10);
                                System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1-rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                                // division
                            case 3:
                                rand1 = rand.nextInt(10);
                                rand2 = rand.nextInt(10);
                                System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1/rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                // difficulty 2
                else if (diff == 2)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        randArith = rand.nextInt(4);
                        switch (randArith){
                            case 0:
                                rand1 = rand.nextInt(100);
                                rand2 = rand.nextInt(100);
                                System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1+rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 1:
                                rand1 = rand.nextInt(100);
                                rand2 = rand.nextInt(100);
                                System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1*rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                rand1 = rand.nextInt(100);
                                rand2 = rand.nextInt(100);
                                System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1-rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                rand1 = rand.nextInt(100);
                                rand2 = rand.nextInt(100);
                                System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1/rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                // difficulty 3
                else if (diff == 3)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        randArith = rand.nextInt(4);
                        switch (randArith){
                            case 0:
                                rand1 = rand.nextInt(1000);
                                rand2 = rand.nextInt(1000);
                                System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1+rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }

                                break;
                            case 1:
                                rand1 = rand.nextInt(1000);
                                rand2 = rand.nextInt(1000);
                                System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1*rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                rand1 = rand.nextInt(1000);
                                rand2 = rand.nextInt(1000);
                                System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1-rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                rand1 = rand.nextInt(1000);
                                rand2 = rand.nextInt(1000);
                                System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1/rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }
                // difficulty 4
                else if (diff == 4)
                {
                    while (numQuest >= 0)
                    {
                        numQuest++;
                        randArith = rand.nextInt(4);
                        switch (randArith){
                            case 0:
                                rand1 = rand.nextInt(10000);
                                rand2 = rand.nextInt(10000);
                                System.out.println("\nHow much is " + rand1 + " plus " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1+rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 1:
                                rand1 = rand.nextInt(10000);
                                rand2 = rand.nextInt(10000);
                                System.out.println("\nHow much is " + rand1 + " times " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1*rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                rand1 = rand.nextInt(10000);
                                rand2 = rand.nextInt(10000);
                                System.out.println("\nHow much is " + rand1 + " minus " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1-rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                rand1 = rand.nextInt(10000);
                                rand2 = rand.nextInt(10000);
                                System.out.println("\nHow much is " + rand1 + " divided by " + rand2 + "?");
                                x = scnr.nextDouble();
                                if (x == (rand1/rand2)) {
                                    right++;
                                    pos = rand.nextInt(5);
                                    switch (pos) {
                                        case 1:
                                            System.out.println("Very good!");
                                            break;
                                        case 2:
                                            System.out.println("Excellent!");
                                            break;
                                        case 3:
                                            System.out.println("Nice work!");
                                            break;
                                        case 4:
                                            System.out.println("Keep up the good work!");
                                            break;
                                        default:
                                            System.out.println("Very good!");
                                            break;
                                    }
                                }
                                else {
                                    neg = rand.nextInt(5);
                                    switch (neg) {
                                        case 1:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 2:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 3:
                                            System.out.println("Don’t give up!!");
                                            break;
                                        case 4:
                                            System.out.println("No. Keep trying.");
                                            break;
                                        default:
                                            System.out.println("No. Please try again.");
                                            break;
                                    }
                                }
                                break;
                        }
                        if (numQuest == 10)
                        {
                            numQuest = -1;
                            if ((right/10) >= 0.75)
                            {
                                System.out.println("\nCongratulations, you are ready to go to the next level!");
                            }
                            else if ((right/10) < 0.75)
                            {
                                System.out.println("");
                                System.out.println("\nPlease ask your teacher for extra help.");
                            }
                        }
                    }
                }



                // asks user if they would like to repeat
            }
            System.out.println("\nWould you like to begin a new session? Press Y for yes and N for no");
            loopAgain = scnr.next().charAt(0);
            // converting to lowercase to accept "y" regardless if upper or lowercase
            loopAgain = Character.toLowerCase(loopAgain);
            if (loopAgain == 'y')
            {
                i = 0;
                System.out.println("\n\n");
            }
            else if (loopAgain == 'n')
            {
                System.out.println("GoodBye!");
                i = -1; // program terminated
            }
            else
                i = -1; // program terminated

        }



    }
}

