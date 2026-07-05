package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p57  reason: default package */
/* loaded from: classes.dex */
public final class p57 {
    public final e67 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public p57(e67 e67Var, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8 = true;
        if (z5 && !z3) {
            z6 = false;
        } else {
            z6 = true;
        }
        wq9.s(z6);
        if (z4 && !z3) {
            z7 = false;
        } else {
            z7 = true;
        }
        wq9.s(z7);
        if (z2 && (z3 || z4 || z5)) {
            z8 = false;
        }
        wq9.s(z8);
        this.a = e67Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final p57 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new p57(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final p57 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new p57(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p57.class == obj.getClass()) {
            p57 p57Var = (p57) obj;
            if (this.b == p57Var.b && this.d == p57Var.d && this.e == p57Var.e && this.f == p57Var.f && this.g == p57Var.g && this.h == p57Var.h && this.i == p57Var.i && this.j == p57Var.j && this.k == p57Var.k && Objects.equals(this.a, p57Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
