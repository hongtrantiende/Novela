package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zr5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zr5 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yr5 d;

    public /* synthetic */ zr5(yr5 yr5Var, int i, int i2) {
        this.a = 0;
        this.d = yr5Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        yr5 yr5Var = this.d;
        int i2 = this.c;
        int i3 = this.b;
        frb frbVar = (frb) obj;
        switch (i) {
            case 0:
                long d = yr5Var.d(sze.a(0, frbVar.c.length()));
                int g = fxb.g(d);
                int f = fxb.f(d);
                if (i3 < g) {
                    i3 = g;
                }
                if (i3 <= f) {
                    f = i3;
                }
                int g2 = fxb.g(d);
                int f2 = fxb.f(d);
                if (i2 < g2) {
                    i2 = g2;
                }
                if (i2 <= f2) {
                    f2 = i2;
                }
                frbVar.g(yr5Var.b(sze.a(f, f2)));
                return pvcVar;
            case 1:
                if (i3 < 0 || i2 < 0) {
                    ov5.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long d2 = yr5Var.d(frbVar.f);
                int f3 = fxb.f(d2);
                int i4 = f3 + i2;
                if (((f3 ^ i4) & (i2 ^ i4)) < 0) {
                    i4 = yr5Var.a();
                }
                long b = yr5Var.b(sze.a(fxb.f(d2), Math.min(i4, yr5Var.a())));
                b23.l(frbVar, fxb.g(b), fxb.f(b));
                int g3 = fxb.g(d2);
                int i5 = g3 - i3;
                if (((i3 ^ g3) & (g3 ^ i5)) < 0) {
                    i5 = 0;
                }
                long b2 = yr5Var.b(sze.a(Math.max(0, i5), fxb.g(d2)));
                b23.l(frbVar, fxb.g(b2), fxb.f(b2));
                return pvcVar;
            default:
                fxb fxbVar = frbVar.C;
                tb1 tb1Var = frbVar.c;
                if (fxbVar != null) {
                    frbVar.f(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long b3 = yr5Var.b(sze.a(i3, i2));
                int n = dce.n(fxb.g(b3), 0, tb1Var.length());
                int n2 = dce.n(fxb.f(b3), 0, tb1Var.length());
                if (n != n2) {
                    if (n < n2) {
                        frbVar.e(n, null, n2);
                    } else {
                        frbVar.e(n2, null, n);
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ zr5(int i, int i2, yr5 yr5Var, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = yr5Var;
    }
}
