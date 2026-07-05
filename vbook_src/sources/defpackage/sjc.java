package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sjc  reason: default package */
/* loaded from: classes.dex */
public final class sjc {
    public final int a;
    public final ajc b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        a2d.K(0);
        a2d.K(1);
        a2d.K(3);
        a2d.K(4);
    }

    public sjc(ajc ajcVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i = ajcVar.a;
        this.a = i;
        boolean z3 = false;
        if (i == iArr.length && i == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        wq9.s(z2);
        this.b = ajcVar;
        if (z && i > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sjc.class == obj.getClass()) {
            sjc sjcVar = (sjc) obj;
            if (this.c == sjcVar.c && this.b.equals(sjcVar.b) && Arrays.equals(this.d, sjcVar.d) && Arrays.equals(this.e, sjcVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
