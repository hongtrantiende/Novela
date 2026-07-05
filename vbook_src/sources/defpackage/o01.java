package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o01  reason: default package */
/* loaded from: classes3.dex */
public final class o01 implements bq5 {
    public final byte[] a;
    public final String b;

    public o01(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [my0, java.lang.Object, osa] */
    @Override // defpackage.bq5
    public final osa a() {
        ?? obj = new Object();
        byte[] bArr = this.a;
        obj.write(bArr, 0, bArr.length);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o01.class == obj.getClass()) {
            return Arrays.equals(this.a, ((o01) obj).a);
        }
        return false;
    }

    @Override // defpackage.bq5
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByteArrayImageSource('" + this.a + "')";
    }
}
