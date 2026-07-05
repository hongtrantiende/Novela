package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v1d  reason: default package */
/* loaded from: classes.dex */
public abstract class v1d {
    public static final q1d a;

    static {
        q1d q1dVar;
        if (fxc.e && fxc.d && !te.a()) {
            q1dVar = new q1d(1);
        } else {
            q1dVar = new q1d(0);
        }
        a = q1dVar;
    }

    public static int a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return c(b, bArr[i], bArr[i + 1]);
                }
                cp8.i();
                return 0;
            }
            return b(b, bArr[i]);
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    public static int b(int i, int i2) {
        if (i <= -12 && i2 <= -65) {
            return i ^ (i2 << 8);
        }
        return -1;
    }

    public static int c(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65 && i3 <= -65) {
            return (i ^ (i2 << 8)) ^ (i3 << 16);
        }
        return -1;
    }
}
