package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        Coche jaguar = new Coche("Jaguar","XF","3453WRD",4000,42943.0);
        Coche mercedes = new Coche("Mercedes","Coupe","3234RRD",8000,44500.0);
        Coche bmw = new Coche("BMW","X1","7645DRE",5000,30950.0);

        List<Coche> cocheList = new ArrayList<>();

        cocheList.add(jaguar);
        cocheList.add(mercedes);
        cocheList.add(bmw);

        System.out.println("Muestro el Jaguar: "+cocheList.get(0));

        System.out.println("Muestro el Mercedes: "+cocheList.get(1));

        HashMap<String,Coche> bmwMap = new HashMap<String,Coche>();

        bmwMap.put(bmw.getMatricula(),bmw);

        System.out.println("Muestro el BMW: "+bmwMap.get(bmw.getMatricula()));

        Map<String, Coche> cocheMap = new HashMap<>();

        cocheMap.put("3453WRD",jaguar);

        cocheMap.put("7645DRE",bmw);

        cocheMap.put("3234RRD",mercedes);

        System.out.println("Muestro las keys del HashMap: "+cocheMap.keySet());

        System.out.println("Muestro los values del HashMap: "+cocheMap.values());








    }
}
