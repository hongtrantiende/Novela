package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: juc  reason: default package */
/* loaded from: classes.dex */
public final class juc extends ih0 {
    public final DatagramPacket C;
    public Uri D;
    public DatagramSocket E;
    public MulticastSocket F;
    public InetAddress G;
    public boolean H;
    public int I;
    public final int e;
    public final byte[] f;

    public juc() {
        super(true);
        this.e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.C = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.jg2
    public final void close() {
        this.D = null;
        MulticastSocket multicastSocket = this.F;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.G;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.F = null;
        }
        DatagramSocket datagramSocket = this.E;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.E = null;
        }
        this.G = null;
        this.I = 0;
        if (this.H) {
            this.H = false;
            c();
        }
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        Uri uri = mg2Var.a;
        this.D = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.D.getPort();
        g();
        try {
            this.G = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.G, port);
            if (this.G.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.F = multicastSocket;
                multicastSocket.joinGroup(this.G);
                this.E = this.F;
            } else {
                this.E = new DatagramSocket(inetSocketAddress);
            }
            this.E.setSoTimeout(this.e);
            this.H = true;
            k(mg2Var);
            return -1L;
        } catch (IOException e) {
            throw new kg2(e, 2001);
        } catch (SecurityException e2) {
            throw new kg2(e2, 2006);
        }
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.I;
        DatagramPacket datagramPacket = this.C;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.E;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.I = length;
                b(length);
            } catch (SocketTimeoutException e) {
                throw new kg2(e, 2002);
            } catch (IOException e2) {
                throw new kg2(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.I;
        int min = Math.min(i4, i2);
        System.arraycopy(this.f, length2 - i4, bArr, i, min);
        this.I -= min;
        return min;
    }

    @Override // defpackage.jg2
    public final Uri t() {
        return this.D;
    }
}
