package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xd6  reason: default package */
/* loaded from: classes.dex */
public final class xd6 implements c37 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c37 b;
    public final /* synthetic */ be6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ c37 e;

    public /* synthetic */ xd6(c37 c37Var, be6 be6Var, int i, c37 c37Var2, int i2) {
        this.a = i2;
        this.c = be6Var;
        this.d = i;
        this.e = c37Var2;
        this.b = c37Var;
    }

    @Override // defpackage.c37
    public final void a() {
        int i = this.a;
        c37 c37Var = this.e;
        int i2 = this.d;
        be6 be6Var = this.c;
        switch (i) {
            case 0:
                be6Var.e = i2;
                c37Var.a();
                gw7 gw7Var = be6Var.I;
                tv7 tv7Var = be6Var.H;
                long[] jArr = tv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = tv7Var.b[i6];
                                    m6b m6bVar = (m6b) tv7Var.c[i6];
                                    int i7 = gw7Var.i(obj);
                                    if (i7 < 0 || i7 >= be6Var.e) {
                                        if (i7 >= 0) {
                                            Object[] objArr = gw7Var.a;
                                            Object obj2 = objArr[i7];
                                            objArr[i7] = k6b.b;
                                        }
                                        if (be6Var.F.b(obj)) {
                                            m6bVar.a();
                                        }
                                        tv7Var.m(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                be6Var.g(be6Var.d);
                return;
            default:
                be6Var.d = i2;
                c37Var.a();
                if (be6Var.a.E == null) {
                    be6Var.g(be6Var.d);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.c37
    public final xt4 b() {
        switch (this.a) {
            case 0:
                return this.b.b();
            default:
                return this.b.b();
        }
    }

    @Override // defpackage.c37
    public final lu4 c() {
        switch (this.a) {
            case 0:
                return this.b.c();
            default:
                return this.b.c();
        }
    }

    @Override // defpackage.c37
    public final int d() {
        switch (this.a) {
            case 0:
                return this.b.d();
            default:
                return this.b.d();
        }
    }

    @Override // defpackage.c37
    public final int e() {
        switch (this.a) {
            case 0:
                return this.b.e();
            default:
                return this.b.e();
        }
    }

    @Override // defpackage.c37
    public final xt4 f() {
        switch (this.a) {
            case 0:
                return this.b.f();
            default:
                return this.b.f();
        }
    }

    @Override // defpackage.c37
    public final Map g() {
        switch (this.a) {
            case 0:
                return this.b.g();
            default:
                return this.b.g();
        }
    }
}
