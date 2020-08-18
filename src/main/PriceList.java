package src.main;

import java.util.HashMap;
import java.util.Map;

public class PriceList {

    static Map<String, Integer> spockPriceList = new HashMap<String, Integer>();
    static Map<String, Integer> rimPriceList = new HashMap<String, Integer>();
    static Map<String, Integer> tubePriceList = new HashMap<String, Integer>();
    static Map<String,Integer> tyrePriceList = new HashMap<String, Integer>();

    static Map<String ,Integer> rearShockPriceList = new HashMap<String, Integer>();
    static Map<String, Integer> suspensionSockPriceList = new HashMap<String, Integer>();
    static Map<String, Integer> framePriceList = new HashMap<String, Integer>();

    static Map<String, Integer> handleBarPriceList = new HashMap<String, Integer>();
    static Map<String, Integer> breakLeaverList = new HashMap<String, Integer>();
    static Map<String, Integer> handGripList = new HashMap<String, Integer>();
    static Map<String, Integer> shifterPriceList = new HashMap<String, Integer>();

    static Map<String , Integer> seatPostPriceList = new HashMap<String, Integer>();
    static Map<String, Integer> seatCoverPriceList = new HashMap<String, Integer>();

    static Map<String, Integer> cassettePriceList = new HashMap<String, Integer>();
    static Map<String, Integer> chainPriceList = new HashMap<String, Integer>();
    static Map<String, Integer> chainPaddlePriceList = new HashMap<String, Integer>();


    static {
        //wheel price
        spockPriceList.put("avon",2);
        spockPriceList.put("local",1);

        rimPriceList.put("avon",2);
        rimPriceList.put("local",1);

        tubePriceList.put("avon",2);
        tubePriceList.put("local",1);

        tyrePriceList.put("avon",2);
        tyrePriceList.put("local",1);

        //Frame Price

        rearShockPriceList.put("avon",2);
        rearShockPriceList.put("local",1);

        suspensionSockPriceList.put("avon",2);
        suspensionSockPriceList.put("local",2);

        framePriceList.put("avon",2);
        framePriceList.put("local",2);

        //Handle

        handleBarPriceList.put("avon",2);
        handleBarPriceList.put("local",1);

        breakLeaverList.put("avon",2);
        breakLeaverList.put("local",1);

        handGripList.put("avon", 2);
        handGripList.put("local",1);

        shifterPriceList.put("avon", 2);
        shifterPriceList.put("local",1);

        //Seat Price list

        seatPostPriceList.put("avon",2);
        seatPostPriceList.put("local",1);

        seatCoverPriceList.put("avon",2);
        seatCoverPriceList.put("local",1);

        // Chain Price List

        cassettePriceList.put("avon",2);
        cassettePriceList.put("local",1);

        chainPriceList.put("avon",2);
        chainPriceList.put("local",1);

        chainPaddlePriceList.put("avon",2);
        chainPaddlePriceList.put("local",1);
    }

}
