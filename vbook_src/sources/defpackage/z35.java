package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z35  reason: default package */
/* loaded from: classes3.dex */
public final class z35 {
    public final byte[] a;

    public z35(byte[] bArr) {
        this.a = bArr;
    }

    public final String a() {
        byte[] bArr = this.a;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(hu7.j(((b & 255) >>> 4) & 15));
            sb.append(hu7.j(b & 15));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z35) {
            if (Arrays.equals(this.a, ((z35) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return a();
    }
}
