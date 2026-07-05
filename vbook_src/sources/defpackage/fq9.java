package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fq9  reason: default package */
/* loaded from: classes3.dex */
public final class fq9 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final mfb r;

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public fq9(int i) {
        ?? r0;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i2;
        boolean z12;
        boolean z13;
        boolean z14;
        this.a = i;
        boolean z15 = false;
        if ((i & 1) != 0) {
            r0 = 1;
        } else {
            r0 = 0;
        }
        this.b = r0;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.e = z3;
        if ((i & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f = z4;
        if ((i & 32) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.g = z5;
        if ((i & 2048) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.h = z6;
        if ((i & 64) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.i = z7;
        if ((i & Token.CASE) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.j = z8;
        if ((i & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.k = z9;
        if ((i & 512) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.l = z10;
        if ((i & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.m = z11;
        if (z) {
            i2 = r0 + 1;
        } else {
            i2 = r0;
        }
        i2 = z2 ? i2 + 1 : i2;
        i2 = z3 ? i2 + 1 : i2;
        i2 = z4 ? i2 + 1 : i2;
        i2 = z5 ? i2 + 1 : i2;
        i2 = z6 ? i2 + 1 : i2;
        i2 = z7 ? i2 + 1 : i2;
        i2 = z8 ? i2 + 1 : i2;
        i2 = z9 ? i2 + 1 : i2;
        i2 = z10 ? i2 + 1 : i2;
        i2 = z11 ? i2 + 1 : i2;
        if (i2 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.n = z12;
        if (i2 == 1 && r0 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.o = z13;
        if (i2 == 1 && z) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.p = z14;
        if (i2 == 1 && z2) {
            z15 = true;
        }
        this.q = z15;
        if (z14 || !z15) {
        }
        this.r = new mfb(new ak9(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fq9.class == obj.getClass() && this.a == ((fq9) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return s21.p(new StringBuilder("ResetParamsDiffResult("), (String) this.r.getValue(), ')');
    }
}
