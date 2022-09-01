package com.pault.advjava.networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class NetworkingDemo {

    public static void main(String[] args) throws  java.net.UnknownHostException {

        String url = "www.simplilearn.com";
        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address: "+ Arrays.toString(inetAddress.getAddress()));
        System.out.println("Host Address: "+ inetAddress.getHostAddress());
        System.out.println("IsAnyLocalAddress: "+ inetAddress.isAnyLocalAddress());
        System.out.println("IsLinkLocalAddress: "+ inetAddress.isLinkLocalAddress());
        System.out.println("IsLoopBackAddress: "+ inetAddress.isLoopbackAddress());
        System.out.println("IsSiteLocalAddress: "+ inetAddress.isSiteLocalAddress());
        System.out.println("hashcode: "+ inetAddress.hashCode());


    }
}
