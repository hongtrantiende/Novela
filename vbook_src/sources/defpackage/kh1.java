package defpackage;

import java.math.RoundingMode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kh1  reason: default package */
/* loaded from: classes.dex */
public final class kh1 {
    public final je0 a;
    public final fjc b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public kh1(int i, je0 je0Var, fjc fjcVar) {
        int i2;
        int i3;
        int i4 = je0Var.d;
        this.a = je0Var;
        int a = je0Var.a();
        boolean z = true;
        if (a != 1 && a != 2) {
            z = false;
        }
        wq9.s(z);
        if (a == 2) {
            i2 = 1667497984;
        } else {
            i2 = 1651965952;
        }
        int i5 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = i2 | i5;
        long j = je0Var.c;
        String str = a2d.a;
        this.e = a2d.Y(i4, je0Var.b * 1000000, j, RoundingMode.DOWN);
        this.b = fjcVar;
        if (a == 2) {
            i3 = i5 | 1650720768;
        } else {
            i3 = -1;
        }
        this.d = i3;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i4;
    }

    public final p4a a(int i) {
        return new p4a((this.e / this.f) * this.n[i], this.m[i]);
    }

    public final l4a b(long j) {
        if (this.k == 0) {
            p4a p4aVar = new p4a(0L, this.l);
            return new l4a(p4aVar, p4aVar);
        }
        int i = (int) (j / (this.e / this.f));
        int e = a2d.e(this.n, i, true, true);
        if (this.n[e] == i) {
            p4a a = a(e);
            return new l4a(a, a);
        }
        p4a a2 = a(e);
        int i2 = e + 1;
        if (i2 < this.m.length) {
            return new l4a(a2, a(i2));
        }
        return new l4a(a2, a2);
    }
}
