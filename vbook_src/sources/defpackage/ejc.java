package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ejc  reason: default package */
/* loaded from: classes.dex */
public final class ejc {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ejc(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ejc.class == obj.getClass()) {
                ejc ejcVar = (ejc) obj;
                if (this.a == ejcVar.a && this.c == ejcVar.c && this.d == ejcVar.d && Arrays.equals(this.b, ejcVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
