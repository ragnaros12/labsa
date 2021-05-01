package com.company;

import com.sun.jdi.IntegerType;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static DatagramSocket socket;
    public static Scanner scanner = new Scanner(System.in);
    public static DatagramPacket send;
    public static DatagramPacket recieve;

    public static void main(String[] args) throws IOException {
        System.out.println("введите ip");
        String ip = scanner.nextLine();

        System.out.println("введите порт");
        int port = Integer.parseInt(scanner.nextLine());

        socket = new DatagramSocket(port + 1, InetAddress.getByName(ip));

        send = new DatagramPacket(new byte[1], 1, InetAddress.getByName(ip), port);
        recieve = new DatagramPacket(new byte[2048], 2048, InetAddress.getByName(ip), port + 1);

        while (true) {
            System.out.println("введите сообщение");
            byte[] buff = scanner.nextLine().getBytes(StandardCharsets.UTF_8);
            send.setData(buff, 0, buff.length);
            socket.send(send);

            socket.receive(recieve);
            System.out.println(new String(recieve.getData(), StandardCharsets.UTF_8));
        }
    }
}
