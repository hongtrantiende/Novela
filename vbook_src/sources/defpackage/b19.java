package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b19  reason: default package */
/* loaded from: classes.dex */
public final class b19 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public b19(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b19) {
                b19 b19Var = (b19) obj;
                if (y09.a(this.a, b19Var.a) && this.b == b19Var.b && y78.d(this.c, b19Var.c) && y78.d(this.d, b19Var.d) && this.e == b19Var.e && Float.compare(this.f, b19Var.f) == 0 && this.g == b19Var.g && this.h == b19Var.h && this.i.equals(b19Var.i) && y78.d(this.j, b19Var.j) && Float.compare(this.k, b19Var.k) == 0 && y78.d(this.l, b19Var.l) && y78.d(this.m, b19Var.m)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + hl5.c(nk2.d(this.k, hl5.c((this.i.hashCode() + eub.k(hl5.a(this.g, nk2.d(this.f, eub.k(hl5.c(hl5.c(hl5.c(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31), 31), 31, this.h)) * 31, this.j, 31), 31), this.l, 31);
    }

    public final String toString() {
        String b = y09.b(this.a);
        String l = y78.l(this.c);
        String l2 = y78.l(this.d);
        String a = i19.a(this.g);
        String l3 = y78.l(this.j);
        String l4 = y78.l(this.l);
        String l5 = y78.l(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(b);
        sb.append(", uptime=");
        sb.append(this.b);
        nk2.C(sb, ", positionOnScreen=", l, ", position=", l2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(a);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(l3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(l4);
        return nk2.v(sb, ", originalEventPosition=", l5, ")");
    }
}
