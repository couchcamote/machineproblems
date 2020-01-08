package com.alexiesracca.excercises.numbers;

public class BitOperation {

public static void main(String[] args) {
    test();
}

public static void test(){
    logicalInverse(2);
    logicalRightShift(170, 1);
    arithmeticRightShift(170, 1);
    arithmeticRightShift(-4097, 1);
    getBit(170, 1);
    setBit(170, 0);
    clearBit(43690, 5);
    clearBitFromMSBtoI(43690, 5);
    clearBitITo0(43690, 5);
    updateBit(43690, 4, true);
    updateBit(43690, 5, false);


}

public static void logicalInverse(int num){
    System.out.println("1) num " + Integer.toBinaryString(num));
    System.out.format("[Int %d > %d logicalInverse] %s > %s %n",
    num,num*-1,Integer.toBinaryString(num), Integer.toBinaryString(-1 * num)
    );
}

public static void logicalRightShift(int num, int i){
    System.out.println("1) num " + Integer.toBinaryString(num));
    int newByte = num >> i;
    System.out.format("[Int %d > logicalRightShift at i= %d] %s > %s %n",
    num,i,Integer.toBinaryString(num), Integer.toBinaryString(newByte)
    );
}

public static void arithmeticRightShift(int num, int i){
    System.out.println("1) num " + Integer.toBinaryString(num));
    int newByte = num >>> i;
    System.out.format("[Int %d > arithmeticRightShift at i= %d] %s > %s %n",
    num,i,Integer.toBinaryString(num), Integer.toBinaryString(newByte)
    );
}

public static void getBit(int num, int i){
        int mask = (1 << i);
        boolean bit =  (num & mask) != 0;
        System.out.format("[Int %d > Get Bit at i=%d] %s | %s > %s %n",
        num,i,Integer.toBinaryString(num), Integer.toBinaryString(mask), (bit?"1":"0"));
}


public static void setBit(int num, int i){
        int mask = (1 << i);
        int newByte =  num | mask;
        System.out.format("[Int %d > Set Bit at i=%d] %s | %s > %s %n",
        num,i,Integer.toBinaryString(num), Integer.toBinaryString(mask),Integer.toBinaryString(newByte)
        );
    }

public static void clearBit(int num, int i){
        int mask = (1 << i);
        System.out.println("1) 1 << i -> " + Integer.toBinaryString(mask));
        mask = ~mask;
        System.out.println("2) ~(1 << i)  -> " + Integer.toBinaryString(mask));
        int newByte =  num & mask;
        System.out.format("[Int %d > Clear Bit at i= %d] %s & %s > %s %n",
        num,i,Integer.toBinaryString(num), Integer.toBinaryString(mask),Integer.toBinaryString(newByte)
        );
    }

public static void clearBitFromMSBtoI(int num, int i){
        int mask = (1 << i) ;
        System.out.println("1) 1 << i -> " + Integer.toBinaryString(mask));
        mask= mask - 1;
        System.out.println("2) (1 << i) - 1 -> " + Integer.toBinaryString(mask));
        int newByte =  num & mask;
        System.out.format("[Int %d > clearBitFromMSBtoI at i= %d] %s & %s > %s %n",
        num,i,Integer.toBinaryString(num), Integer.toBinaryString(mask),Integer.toBinaryString(newByte)
        );
    }

    public static void clearBitITo0(int num, int i){
        int mask = -1;
        System.out.println("1) -1 -> " + Integer.toBinaryString(mask));
        System.out.println("2) (i+1) -> " + Integer.toBinaryString(i+1));
        mask = mask << (i + 1);
        System.out.println("3) -1 << (i+1) -> " + Integer.toBinaryString(mask));
        int newByte =  num & mask;
        System.out.format("[Int %d > clearBitITo0 at i= %d] %s & %s > %s %n",
        num,i,Integer.toBinaryString(num), Integer.toBinaryString(mask),Integer.toBinaryString(newByte)
        );
    }

    public static void updateBit(int num, int i, boolean bitIs1){
        int value = bitIs1?1:0;
        int mask = ~(1 << i);
        int newByte =  (num & mask) | (value << i);
        System.out.format("[Int %d > UpdateBit at i= %d] %s & %s > %s %n",
        num,i,Integer.toBinaryString(num), Integer.toBinaryString(mask),Integer.toBinaryString(newByte)
        );
    }

}