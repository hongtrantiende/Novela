package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cn7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cn7 implements vt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cn7(xt4 xt4Var, xt4 xt4Var2, int i, int i2, aw7 aw7Var) {
        this.d = xt4Var;
        this.e = xt4Var2;
        this.b = i;
        this.c = i2;
        this.f = aw7Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean z;
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                xt4 xt4Var = (xt4) obj2;
                ((xt4) obj3).invoke(Boolean.FALSE);
                Integer S = r4b.S(((jub) ((aw7) obj).getValue()).a.b);
                if (S != null) {
                    i2 = dce.n(S.intValue(), 1, i3);
                }
                xt4Var.invoke(Integer.valueOf(i2));
                return pvc.a;
            default:
                z5a z5aVar = (z5a) obj3;
                b7a b7aVar = (b7a) obj2;
                int intValue = ((Number) ((ye6) obj).getValue()).intValue();
                boolean a = b7aVar.a();
                if (b7aVar.i() == jd2.a) {
                    z = true;
                } else {
                    z = false;
                }
                long k = z5aVar.f.k(i3);
                fvb fvbVar = z5aVar.f;
                it7 it7Var = fvbVar.b;
                int i4 = fxb.c;
                int i5 = (int) (k >> 32);
                int d = it7Var.d(i5);
                int i6 = it7Var.f;
                if (d != intValue) {
                    if (intValue >= i6) {
                        i5 = fvbVar.i(i6 - 1);
                    } else {
                        i5 = fvbVar.i(intValue);
                    }
                }
                int i7 = (int) (k & 4294967295L);
                if (it7Var.d(i7) != intValue) {
                    if (intValue >= i6) {
                        i7 = it7Var.c(i6 - 1, false);
                    } else {
                        i7 = it7Var.c(intValue, false);
                    }
                }
                if (i5 == i2) {
                    return z5aVar.a(i7);
                }
                if (i7 == i2) {
                    return z5aVar.a(i5);
                }
                if (!(a ^ z) ? i3 >= i5 : i3 > i7) {
                    i5 = i7;
                }
                return z5aVar.a(i5);
        }
    }

    public /* synthetic */ cn7(z5a z5aVar, int i, int i2, b7a b7aVar, ye6 ye6Var) {
        this.d = z5aVar;
        this.b = i;
        this.c = i2;
        this.e = b7aVar;
        this.f = ye6Var;
    }
}
