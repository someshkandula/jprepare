package com.leet;

class ByteToShort {
    public static void main(String[] args)
    {
        int z = 2;
        System.out.println (z << 8);

        short t = (short)(z << 8 | -92);
        System.out.println ("t: "+t);

    }
}