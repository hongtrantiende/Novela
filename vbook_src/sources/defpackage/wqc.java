package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wqc  reason: default package */
/* loaded from: classes3.dex */
public final class wqc {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public wqc(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public static wqc a(wqc wqcVar, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        boolean z6;
        if ((i3 & 1) != 0) {
            i = wqcVar.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = wqcVar.b;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            z = wqcVar.c;
        }
        boolean z7 = z;
        if ((i3 & 8) != 0) {
            z2 = wqcVar.d;
        }
        boolean z8 = z2;
        if ((i3 & 16) != 0) {
            z3 = wqcVar.e;
        }
        boolean z9 = z3;
        if ((i3 & 32) != 0) {
            z4 = wqcVar.f;
        }
        boolean z10 = z4;
        if ((i3 & 64) != 0) {
            z6 = wqcVar.g;
        } else {
            z6 = z5;
        }
        boolean z11 = wqcVar.h;
        wqcVar.getClass();
        return new wqc(i4, i5, z7, z8, z9, z10, z6, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqc)) {
            return false;
        }
        wqc wqcVar = (wqc) obj;
        if (this.a == wqcVar.a && this.b == wqcVar.b && this.c == wqcVar.c && this.d == wqcVar.d && this.e == wqcVar.e && this.f == wqcVar.f && this.g == wqcVar.g && this.h == wqcVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + eub.k(eub.k(eub.k(eub.k(eub.k(hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "TurnPageState(turnPageByTouchOrientation=", ", turnPageTouchMode=", ", isTurnPageByVolume=");
        rs8.z(r, this.c, ", isRevertTurnPageByVolume=", this.d, ", isTurnPageByKeyboard=");
        rs8.z(r, this.e, ", isAnimationTurnPage=", this.f, ", isTurnPageSound=");
        r.append(this.g);
        r.append(", isSimulationScroll=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }
}
