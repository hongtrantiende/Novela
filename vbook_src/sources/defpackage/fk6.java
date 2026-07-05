package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fk6  reason: default package */
/* loaded from: classes.dex */
public final class fk6 implements uh6 {
    public final /* synthetic */ nk6 a;
    public final /* synthetic */ ff8 b;
    public final /* synthetic */ kk6 c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ rh8 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ m82 g;
    public final /* synthetic */ m15 h;

    public fk6(nk6 nk6Var, ff8 ff8Var, kk6 kk6Var, p76 p76Var, rh8 rh8Var, float f, m82 m82Var, m15 m15Var) {
        this.a = nk6Var;
        this.b = ff8Var;
        this.c = kk6Var;
        this.d = p76Var;
        this.e = rh8Var;
        this.f = f;
        this.g = m82Var;
        this.h = m15Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uh6
    public final c37 a(vh6 vh6Var, long j) {
        boolean z;
        lk6 lk6Var;
        boolean z2;
        float d;
        float a;
        float o;
        int i;
        long j2;
        List list;
        boolean z3;
        Integer num;
        int i2;
        int m;
        float f;
        int i3;
        p6b p6bVar = vh6Var.b;
        nk6 nk6Var = this.a;
        nk6Var.v.getValue();
        if (!nk6Var.a && !p6bVar.I0()) {
            z = false;
        } else {
            z = true;
        }
        ff8 ff8Var = this.b;
        lre.e(j, ff8Var);
        kk6 kk6Var = this.c;
        if (kk6Var.d != null && x02.c(kk6Var.b, j) && kk6Var.c == p6bVar.f()) {
            lk6 lk6Var2 = kk6Var.d;
            lk6Var2.getClass();
            lk6Var = lk6Var2;
        } else {
            kk6Var.b = j;
            kk6Var.c = p6bVar.f();
            lk6 lk6Var3 = (lk6) kk6Var.a.invoke(vh6Var, new x02(j));
            kk6Var.d = lk6Var3;
            lk6Var = lk6Var3;
        }
        if (ff8Var == ff8.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        xj6 xj6Var = (xj6) this.d.invoke();
        tc6 layoutDirection = p6bVar.getLayoutDirection();
        int ordinal = ff8Var.ordinal();
        xt4 xt4Var = null;
        rh8 rh8Var = this.e;
        if (ordinal != 0) {
            if (ordinal == 1) {
                d = zbe.o(rh8Var, layoutDirection);
            } else {
                xk5.o();
                return null;
            }
        } else {
            d = rh8Var.d();
        }
        int X0 = p6bVar.X0(d);
        tc6 layoutDirection2 = p6bVar.getLayoutDirection();
        int ordinal2 = ff8Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                a = zbe.n(rh8Var, layoutDirection2);
            } else {
                xk5.o();
                return null;
            }
        } else {
            a = rh8Var.a();
        }
        int X02 = p6bVar.X0(a);
        tc6 layoutDirection3 = p6bVar.getLayoutDirection();
        int ordinal3 = ff8Var.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 == 1) {
                o = rh8Var.d();
            } else {
                xk5.o();
                return null;
            }
        } else {
            o = zbe.o(rh8Var, layoutDirection3);
        }
        int X03 = p6bVar.X0(o);
        if (z2) {
            i = x02.h(j);
        } else {
            i = x02.i(j);
        }
        int i4 = (i - X0) - X02;
        if (z2) {
            j2 = (X0 & 4294967295L) | (X03 << 32);
        } else {
            j2 = (X0 << 32) | (X03 & 4294967295L);
        }
        long j3 = j2;
        int X04 = p6bVar.X0(zbe.n(rh8Var, p6bVar.getLayoutDirection()) + zbe.o(rh8Var, p6bVar.getLayoutDirection()));
        int X05 = p6bVar.X0(rh8Var.a() + rh8Var.d());
        vu7 n = lpe.n(xj6Var, nk6Var.s, nk6Var.k);
        long b = x02.b(j, y02.g(X04, j), 0, y02.f(X05, j), 0, 10);
        int X06 = p6bVar.X0(this.f);
        boolean I0 = p6bVar.I0();
        gk6 gk6Var = nk6Var.b;
        if (gk6Var != null) {
            list = gk6Var.m;
        } else {
            list = null;
        }
        ck6 ck6Var = new ck6(nk6Var, n, xj6Var, lk6Var, b, z2, vh6Var, i4, j3, X0, X02, X06, this.g, z, list, this.h);
        n53 n53Var = nk6Var.c;
        int[] iArr = (int[]) n53Var.c;
        Object obj = n53Var.g;
        iArr.getClass();
        if (iArr.length > 0) {
            z3 = 0;
            num = Integer.valueOf(iArr[0]);
        } else {
            z3 = 0;
            num = null;
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = z3;
        }
        int k = q1d.k(xj6Var, obj, i2);
        if (!b00.R(k, iArr)) {
            ((xh6) n53Var.h).a(k);
            zqa f2 = pae.f();
            if (f2 != null) {
                xt4Var = f2.e();
            }
            xt4 xt4Var2 = xt4Var;
            zqa h = pae.h(f2);
            try {
                iArr = (int[]) ((xe1) n53Var.b).invoke(Integer.valueOf(k), Integer.valueOf(iArr.length));
                pae.n(f2, h, xt4Var2);
                n53Var.c = iArr;
                ((em8) n53Var.d).i(n53.a(iArr));
            } catch (Throwable th) {
                pae.n(f2, h, xt4Var2);
                throw th;
            }
        }
        int[] iArr2 = (int[]) n53Var.e;
        int length = iArr.length;
        int i5 = ck6Var.s;
        if (length != i5) {
            kj kjVar = ck6Var.r;
            kjVar.x();
            int[] iArr3 = new int[i5];
            for (int i6 = z3; i6 < i5; i6++) {
                if (i6 >= iArr.length || (m = iArr[i6]) == -1) {
                    if (i6 == 0) {
                        m = z3;
                    } else {
                        m = hre.m(iArr3, i6 & 4294967295L) + 1;
                        iArr3[i6] = m;
                        kjVar.z(m, i6);
                    }
                }
                iArr3[i6] = m;
                kjVar.z(m, i6);
            }
            iArr = iArr3;
        }
        if (iArr2.length != i5) {
            int[] iArr4 = new int[i5];
            for (int i7 = z3; i7 < i5; i7++) {
                if (i7 < iArr2.length) {
                    i3 = iArr2[i7];
                } else if (i7 == 0) {
                    i3 = z3;
                } else {
                    i3 = iArr4[i7 - 1];
                }
                iArr4[i7] = i3;
            }
            iArr2 = iArr4;
        }
        if (!I0 && nk6Var.a) {
            f = ((Number) ((es) nk6Var.w.c).b.getValue()).floatValue();
        } else {
            f = nk6Var.o;
        }
        gk6 n2 = hre.n(ck6Var, Math.round(f), iArr, iArr2, true);
        nk6Var.f(n2, p6bVar.I0(), z3);
        return n2;
    }
}
