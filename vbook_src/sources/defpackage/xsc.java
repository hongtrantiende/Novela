package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xsc  reason: default package */
/* loaded from: classes.dex */
public final class xsc {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final oaa b;
    public volatile int c = 0;

    public xsc(oaa oaaVar, int i) {
        this.b = oaaVar;
        this.a = i;
    }

    public final int a(int i) {
        wb7 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b.d;
            int i2 = a + b.a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [q07, java.lang.Object] */
    public final wb7 b() {
        ThreadLocal threadLocal = d;
        wb7 wb7Var = (wb7) threadLocal.get();
        wb7 wb7Var2 = wb7Var;
        if (wb7Var == null) {
            ?? q07Var = new q07();
            threadLocal.set(q07Var);
            wb7Var2 = q07Var;
        }
        xb7 xb7Var = (xb7) this.b.b;
        int a = xb7Var.a(6);
        if (a != 0) {
            int i = a + xb7Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) xb7Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) xb7Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) xb7Var.d;
            wb7Var2.d = byteBuffer;
            if (byteBuffer != null) {
                wb7Var2.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                wb7Var2.b = i4;
                wb7Var2.c = ((ByteBuffer) wb7Var2.d).getShort(i4);
                return wb7Var2;
            }
            wb7Var2.a = 0;
            wb7Var2.b = 0;
            wb7Var2.c = 0;
        }
        return wb7Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        wb7 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b.d).getInt(a + b.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        wb7 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i3 = a2 + b2.a;
            i2 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
