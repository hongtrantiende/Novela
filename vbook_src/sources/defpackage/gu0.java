package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gu0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gu0 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gu0(mw8 mw8Var, int i, int i2, mw8 mw8Var2, xl9 xl9Var, xl9 xl9Var2) {
        this.e = mw8Var;
        this.b = i;
        this.c = i2;
        this.f = mw8Var2;
        this.d = xl9Var;
        this.C = xl9Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        cv9 cv9Var;
        int a;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.C;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                fu0.b((lw8) obj, (mw8) obj5, (w27) obj4, ((e37) obj3).getLayoutDirection(), this.b, this.c, ((hu0) obj2).a);
                return pvcVar;
            case 1:
                mw8[] mw8VarArr = (mw8[]) obj5;
                xn1 xn1Var = (xn1) obj4;
                e37 e37Var = (e37) obj3;
                int[] iArr = (int[]) obj2;
                lw8 lw8Var = (lw8) obj;
                int length = mw8VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    mw8 mw8Var = mw8VarArr[i2];
                    int i4 = i3 + 1;
                    mw8Var.getClass();
                    Object S = mw8Var.S();
                    nmd nmdVar = null;
                    if (S instanceof cv9) {
                        cv9Var = (cv9) S;
                    } else {
                        cv9Var = null;
                    }
                    tc6 layoutDirection = e37Var.getLayoutDirection();
                    if (cv9Var != null) {
                        nmdVar = cv9Var.c;
                    }
                    nmd nmdVar2 = nmdVar;
                    int i5 = this.b;
                    if (nmdVar2 != null) {
                        a = nmdVar2.t(i5, mw8Var.a, layoutDirection, mw8Var, this.c);
                    } else {
                        a = xn1Var.b.a(mw8Var.a, i5, layoutDirection);
                    }
                    lw8Var.o(mw8Var, a, iArr[i3], nae.e);
                    i2++;
                    i3 = i4;
                }
                return pvcVar;
            default:
                lw8 lw8Var2 = (lw8) obj;
                lw8.z(lw8Var2, (mw8) obj5, this.b, this.c);
                lw8.z(lw8Var2, (mw8) obj4, ((xl9) obj3).a, ((xl9) obj2).a);
                return pvcVar;
        }
    }

    public /* synthetic */ gu0(mw8 mw8Var, w27 w27Var, e37 e37Var, int i, int i2, hu0 hu0Var) {
        this.e = mw8Var;
        this.f = w27Var;
        this.d = e37Var;
        this.b = i;
        this.c = i2;
        this.C = hu0Var;
    }

    public /* synthetic */ gu0(mw8[] mw8VarArr, xn1 xn1Var, int i, int i2, e37 e37Var, int[] iArr) {
        this.e = mw8VarArr;
        this.f = xn1Var;
        this.b = i;
        this.c = i2;
        this.d = e37Var;
        this.C = iArr;
    }
}
