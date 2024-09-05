package networking;

import java.net.Socket;

public abstract class InternetProtocallv4 {
    final byte octet1;
    final byte octet2;
    final byte octet3;
    final byte octet4;

    protected InternetProtocallv4(byte octet1, byte octet2, byte octet3, byte octet4) {
        this.octet1 = octet1;
        this.octet2 = octet2;
        this.octet3 = octet3;
        this.octet4 = octet4;
    }

    //getters
    public byte getOctet1() {
        return octet1;
    }
    public byte getOctet2() {
        return octet2;
    }
    public byte getOctet3() {
        return octet3;
    }
    public byte getOctet4() {
        return octet4;
    }

    public static int testPing(){


        return 0;
    }

}
