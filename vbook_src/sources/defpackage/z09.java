package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z09  reason: default package */
/* loaded from: classes.dex */
public final class z09 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public z09 q;

    public z09(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        z09 z09Var = this.q;
        if (z09Var == null) {
            this.o = true;
            this.p = true;
        } else if (z09Var != null) {
            z09Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return ks3.a;
        }
        return arrayList;
    }

    public final boolean c() {
        z09 z09Var = this.q;
        if (z09Var != null) {
            return z09Var.c();
        }
        if (!this.o && !this.p) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String b = y09.b(this.a);
        String l = y78.l(this.c);
        String l2 = y78.l(this.g);
        boolean c = c();
        String a = i19.a(this.i);
        List b2 = b();
        String l3 = y78.l(this.j);
        String l4 = y78.l(this.l);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(b);
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(l);
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append(l2);
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(c);
        sb.append(", type=");
        sb.append(a);
        sb.append(", historical=");
        sb.append(b2);
        sb.append(", scrollDelta=");
        sb.append(l3);
        sb.append(", scaleFactor=");
        sb.append(this.k);
        return nk2.v(sb, ", panOffset=", l4, ")");
    }

    public z09(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
