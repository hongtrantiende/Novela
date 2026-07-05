package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b50  reason: default package */
/* loaded from: classes.dex */
public final class b50 {
    public boolean a;
    public int b;
    public Object c;

    public b50(byte[] bArr, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        bArr.getClass();
        this.c = bArr;
        this.a = true;
        this.b = i2;
    }

    public void a(byte[] bArr, int i) {
        bArr.getClass();
        c(this.b + i);
        b00.U(this.b, 0, i, bArr, (byte[]) this.c);
        this.b += i;
    }

    public void b(byte b) {
        c(this.b + 1);
        int i = this.b;
        this.b = i + 1;
        ((byte[]) this.c)[i] = b;
    }

    public void c(int i) {
        int i2;
        byte[] bArr = (byte[]) this.c;
        if (bArr.length < i) {
            if (this.a) {
                int length = (bArr.length + 7) * 5;
                if (length < 0) {
                    i2 = 1073741823;
                } else {
                    i2 = length;
                }
                if (length < 0 && i > i2) {
                    vs.k("ByteArrayBuffer can't grow that much");
                    return;
                } else {
                    this.c = Arrays.copyOf(bArr, Math.max(i, i2));
                    return;
                }
            }
            cy7.e("ByteArrayBuffer configured to not grow!");
        }
    }

    public byte[] d() {
        return Arrays.copyOf((byte[]) this.c, this.b);
    }

    public b50(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i;
    }

    public /* synthetic */ b50() {
        this(4096);
    }

    public b50(int i) {
        this(new byte[i], 4);
    }

    public b50(int i, Integer num, boolean z) {
        this.b = i;
        this.c = num;
        this.a = z;
    }
}
