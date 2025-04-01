{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /*\
 * Program: Number Pattern Pyramid\
 * Author: Zachariah King\
 * Date: 3/30/25\
 * M3 Assignment\
 */\
\
public class NumberPattern \{\
    public static void main(String[] args) \{\
        // Loop for each row (7 rows)\
        for (int i = 0; i < 7; i++) \{\
            // Print leading spaces for alignment\
            for (int j = 0; j < 6 - i; j++) \{\
                System.out.print(" ");\
            \}\
\
            // Print the first half of the pattern (increasing powers of 2)\
            int value = 1;\
            for (int j = 0; j <= i; j++) \{\
                System.out.print(value + " ");\
                value *= 2;\
            \}\
\
            // Print the second half of the pattern (decreasing powers of 2)\
            value /= 4;  // Adjust value after the loop\
            for (int j = i - 1; j >= 0; j--) \{\
                value /= 2;\
                System.out.print(value + " ");\
            \}\
\
            // Print the @ symbol at the end of each line\
            System.out.println("    @");\
        \}\
    \}\
\}}