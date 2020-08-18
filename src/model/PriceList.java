package src.model;

import java.util.HashMap;
import java.util.Map;

public class PriceList {
    static int a;
    static {
        //wheel price
        Map<String, Integer> spockPriceList = new HashMap<String, Integer>();
        spockPriceList.put("avon",2);
        spockPriceList.put("local",1);
        Map<String, Integer> rimPriceList = new HashMap<String, Integer>();
        rimPriceList.put("avon",2);
        rimPriceList.put("local",1);
        Map<String, Integer> tubePriceList = new HashMap<String, Integer>();
        tubePriceList.put("avon",2);
        tubePriceList.put("local",1);
        Map<String,Integer> tyrePriceList = new HashMap<String, Integer>();
        tyrePriceList.put("avon",2);
        tyrePriceList.put("local",1);

        //Frame Price

        Map<String ,Integer> rearShockPriceList = new HashMap<String, Integer>();
        rearShockPriceList.put("avon",2);
        rearShockPriceList.put("local",1);

        Map<String, Integer> suspensionSockPriceList = new HashMap<String, Integer>();
        suspensionSockPriceList.put("avon",2);
        suspensionSockPriceList.put("local",2);

        Map<String, Integer> framePriceList = new HashMap<String, Integer>();
        framePriceList.put("avon",2);
        framePriceList.put("local",2);

        //Handle
        Map<String, Integer> handleBarPriceList = new HashMap<String, Integer>();
        handleBarPriceList.put("avon",2);
        handleBarPriceList.put("local",1);

        Map<String, Integer> breakLeaverList = new HashMap<String, Integer>();
        breakLeaverList.put("avon",2);
        breakLeaverList.put("local",1);

        Map<String, Integer> handGripList = new HashMap<String, Integer>();
        handGripList.put("avon", 2);
        handGripList.put("local",1);

        Map<String, Integer> shifterPriceList = new HashMap<String, Integer>();
        shifterPriceList.put("avon", 2);
        shifterPriceList.put("local",1);

        //Seat Price list

        Map<String , Integer> seatPostPriceList = new HashMap<String, Integer>();
        seatPostPriceList.put("avon",2);
        seatPostPriceList.put("local",1);

        Map<String, Integer> seatCoverPriceList = new HashMap<String, Integer>();
        seatCoverPriceList.put("avon",2);
        seatCoverPriceList.put("local",1);

        // Chain Price List

        Map<String, Integer> cassettePriceList = new HashMap<String, Integer>();
        cassettePriceList.put("avon",2);
        cassettePriceList.put("local",1);

        Map<String, Integer> chainPriceList = new HashMap<String, Integer>();
        chainPriceList.put("avon",2);
        chainPriceList.put("local",1);

    }

}
