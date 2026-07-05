package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ij8  reason: default package */
/* loaded from: classes.dex */
public final class ij8 implements c37 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final ff8 e;
    public final int f;
    public final int g;
    public final int h;
    public final f37 i;
    public final f37 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final xqa n;
    public final c37 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final m82 s;
    public final r13 t;
    public final long u;

    public ij8(List list, int i, int i2, int i3, ff8 ff8Var, int i4, int i5, int i6, f37 f37Var, f37 f37Var2, float f, int i7, boolean z, xqa xqaVar, c37 c37Var, boolean z2, List list2, List list3, m82 m82Var, r13 r13Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ff8Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = f37Var;
        this.j = f37Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = xqaVar;
        this.o = c37Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = m82Var;
        this.t = r13Var;
        this.u = j;
    }

    @Override // defpackage.c37
    public final void a() {
        this.o.a();
    }

    @Override // defpackage.c37
    public final xt4 b() {
        return this.o.b();
    }

    @Override // defpackage.c37
    public final lu4 c() {
        return this.o.c();
    }

    @Override // defpackage.c37
    public final int d() {
        return this.o.d();
    }

    @Override // defpackage.c37
    public final int e() {
        return this.o.e();
    }

    @Override // defpackage.c37
    public final xt4 f() {
        return this.o.f();
    }

    @Override // defpackage.c37
    public final Map g() {
        return this.o.g();
    }

    public final ij8 h(int i) {
        int i2;
        float f;
        int i3 = this.b + this.c;
        if (!this.p) {
            List list = this.a;
            if (!list.isEmpty() && this.i != null && (i2 = this.l - i) >= 0 && i2 < i3) {
                if (i3 != 0) {
                    f = i / i3;
                } else {
                    f = nae.e;
                }
                float f2 = this.k - f;
                if (this.j != null && f2 < 0.5f && f2 > -0.5f) {
                    f37 f37Var = (f37) sl1.c0(list);
                    f37 f37Var2 = (f37) sl1.j0(list);
                    int i4 = this.g;
                    int i5 = this.f;
                    if (i < 0) {
                        if (Math.min((f37Var.k + i3) - i5, (f37Var2.k + i3) - i4) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(i5 - f37Var.k, i4 - f37Var2.k) <= i) {
                        return null;
                    }
                    int size = list.size();
                    boolean z = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        ((f37) list.get(i6)).a(i);
                    }
                    List list2 = this.q;
                    int size2 = list2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((f37) list2.get(i7)).a(i);
                    }
                    List list3 = this.r;
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        ((f37) list3.get(i8)).a(i);
                    }
                    return new ij8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f2, i2, (this.m || i > 0) ? true : true, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long i() {
        c37 c37Var = this.o;
        return (c37Var.e() << 32) | (c37Var.d() & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ij8(int r24, int r25, int r26, defpackage.ff8 r27, int r28, int r29, int r30, defpackage.xqa r31, defpackage.c37 r32, defpackage.m82 r33, defpackage.r13 r34, long r35) {
        /*
            r23 = this;
            r13 = 0
            r16 = 0
            ks3 r1 = defpackage.ks3.a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r14 = r31
            r15 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij8.<init>(int, int, int, ff8, int, int, int, xqa, c37, m82, r13, long):void");
    }
}
