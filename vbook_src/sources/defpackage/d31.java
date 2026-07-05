package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d31  reason: default package */
/* loaded from: classes3.dex */
public final class d31 implements Comparable {
    public static final d31 c = new d31(new byte[0]);
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] a;
    public int b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d31(byte[] bArr, int i, int i2) {
        this(b00.d0(bArr, i, i2));
        bArr.getClass();
    }

    public final byte a(int i) {
        byte[] bArr = this.a;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        cy7.k(hl5.p(hl5.s("index (", ") is out of byte string bounds: [0..", i), bArr.length, ')'));
        return (byte) 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d31 d31Var = (d31) obj;
        d31Var.getClass();
        byte[] bArr = d31Var.a;
        if (d31Var == this) {
            return 0;
        }
        byte[] bArr2 = this.a;
        int min = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < min; i++) {
            int l = c16.l(bArr2[i] & 255, bArr[i] & 255);
            if (l != 0) {
                return l;
            }
        }
        return c16.l(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || d31.class != obj.getClass()) {
            return false;
        }
        d31 d31Var = (d31) obj;
        byte[] bArr = d31Var.a;
        int length = bArr.length;
        byte[] bArr2 = this.a;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = d31Var.b;
        if (i2 != 0 && (i = this.b) != 0 && i2 != i) {
            return false;
        }
        return Arrays.equals(bArr2, bArr);
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.a);
            this.b = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + valueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = d;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    public d31(byte[] bArr) {
        this.a = bArr;
    }
}
