package org.example;

public class Bruch {
    int nenner;
    int zaehler;

    Bruch (int z, int n) {
        int hz, hn, t;
        if (n==0) {
            System.out.println("Nenner 0");
        } else {
            hz = z;
            hn = n;
            t = hz % hn;
            while (t > 0) {
                hz = hn;
                hn = t;
                t = hz % hn;
            }
            zaehler = z/hn;
            nenner = n/hn;
            ausgeben();
        }
    }

    Bruch() {
        this(4,8);
    }

    Bruch (int n) {
        this(n, 1);
    }

//    Bruch (int n, int z) {
//        this(n, z);
//    }

    void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
    }

    void kuerzen () {
        int n,m,t;
        m = zaehler;
        n = nenner;
        t = m % n;
        while ( t > 0) {
            m = n;
            n = t;
            t = m % n;
        }

        zaehler = zaehler / n;
        nenner = nenner / n;
    }

    void gekuerztausgeben () {
        kuerzen();
        ausgeben();
    }

    void erweitern ( int a) {
        zaehler *= a;
        nenner *= a;
    }

    void multipliziere (Bruch m) {
        zaehler *= m.zaehler;
        nenner *= m.nenner;
    }
}
