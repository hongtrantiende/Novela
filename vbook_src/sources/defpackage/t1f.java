package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t1f  reason: default package */
/* loaded from: classes.dex */
public abstract class t1f {
    public static final byte[] a = b(1, 0);
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;

    static {
        b(1, 2);
        b = b(2, 32);
        c = b(2, 16);
        d = b(2, 17);
        e = b(2, 18);
        f = b(2, 1);
        g = b(2, 2);
        h = b(2, 3);
        i = b(2, 1);
        j = b(2, 2);
        k = b(2, 3);
        l = new byte[0];
        Charset charset = k7f.a;
        m = "KEM".getBytes(charset);
        n = "HPKE".getBytes(charset);
        o = "HPKE-v1".getBytes(charset);
    }

    public static int a(hye hyeVar) {
        if (hyeVar == hye.C || hyeVar == hye.d) {
            return 32;
        }
        if (hyeVar == hye.e) {
            return 48;
        }
        if (hyeVar == hye.f) {
            return 66;
        }
        hfd.j("Unrecognized HPKE KEM identifier");
        return 0;
    }

    public static byte[] b(int i2, int i3) {
        if (i2 <= 4 && i2 >= 0) {
            if (i3 >= 0 && (i2 >= 4 || i3 < (1 << (i2 << 3)))) {
                byte[] bArr = new byte[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr[i4] = (byte) (i3 >> (((i2 - i4) - 1) * 8));
                }
                return bArr;
            }
            vs.m("value too large");
            return null;
        }
        vs.m("capacity must be between 0 and 4");
        return null;
    }
}
