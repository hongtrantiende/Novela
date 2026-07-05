package defpackage;

import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l4  reason: default package */
/* loaded from: classes.dex */
public abstract class l4 {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public l4(byte[] bArr) {
        this.a = 4;
        if (eub.d(1)) {
            this.b = e(bArr, 1);
            this.c = e(bArr, 0);
            return;
        }
        hfd.j("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }

    public static byte[] i(byte[] bArr, ByteBuffer byteBuffer) {
        int length;
        int i;
        if (bArr.length % 16 == 0) {
            length = bArr.length;
        } else {
            length = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i2 = remaining % 16;
        if (i2 == 0) {
            i = remaining;
        } else {
            i = (remaining + 16) - i2;
        }
        int i3 = i + length;
        ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i3);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int[] iArr = (int[]) this.c;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        return null;
    }

    public String c() {
        String str = (String) this.b;
        if (str != null) {
            return str;
        }
        c16.w("text");
        throw null;
    }

    public abstract int[] d(int i);

    public abstract xb1 e(byte[] bArr, int i);

    public String f(String str, String str2) {
        return rs8.l((String) this.b, str, "?key=", str2);
    }

    public void g(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            xb1 xb1Var = (xb1) this.b;
            xb1Var.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                xb1Var.N(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                ByteBuffer L = ((xb1) this.c).L(bArr, 0);
                byte[] bArr4 = new byte[32];
                L.get(bArr4);
                byte[] Z = jbe.Z(bArr4, i(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(Z);
                return;
            }
            vs.m("Given ByteBuffer output is too small");
            return;
        }
        vs.m("Given ByteBuffer output is too small");
    }

    public byte[] h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                ((xb1) this.c).L(bArr, 0).get(bArr4);
                if (MessageDigest.isEqual(jbe.Z(bArr4, i(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    xb1 xb1Var = (xb1) this.b;
                    xb1Var.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    xb1Var.N(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        hfd.j("ciphertext too short");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return s21.p(new StringBuilder("HasherFactory("), (String) this.b, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l4(Object obj, String str, int i) {
        this.a = i;
        this.b = str;
        this.c = obj;
    }

    public l4(String str, Bundle bundle) {
        this.a = 1;
        bundle.getClass();
        this.b = str;
        this.c = bundle;
    }

    public l4() {
        this.a = 0;
        this.c = new int[2];
    }
}
