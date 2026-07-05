package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz5  reason: default package */
/* loaded from: classes.dex */
public abstract class uz5 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new yk1(bArr, 0, 0, false).j(0);
        } catch (o16 e) {
            xk5.m(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xk5.k(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
