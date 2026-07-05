package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fv9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fv9 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fv9(qnd qndVar, int i, mw8 mw8Var, int i2, e37 e37Var) {
        this.d = qndVar;
        this.b = i;
        this.e = mw8Var;
        this.c = i2;
        this.f = e37Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        cv9 cv9Var;
        int a;
        mw8 mw8Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                mw8[] mw8VarArr = (mw8[]) obj4;
                gv9 gv9Var = (gv9) obj3;
                int[] iArr = (int[]) obj2;
                lw8 lw8Var = (lw8) obj;
                int length = mw8VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    mw8 mw8Var2 = mw8VarArr[i2];
                    int i4 = i3 + 1;
                    mw8Var2.getClass();
                    Object S = mw8Var2.S();
                    nmd nmdVar = null;
                    if (S instanceof cv9) {
                        cv9Var = (cv9) S;
                    } else {
                        cv9Var = null;
                    }
                    if (cv9Var != null) {
                        nmdVar = cv9Var.c;
                    }
                    nmd nmdVar2 = nmdVar;
                    int i5 = this.b;
                    if (nmdVar2 != null) {
                        a = nmdVar2.t(i5, mw8Var2.b, tc6.a, mw8Var2, this.c);
                    } else {
                        a = gv9Var.b.a(mw8Var2.b, i5);
                    }
                    lw8Var.o(mw8Var2, iArr[i3], a, nae.e);
                    i2++;
                    i3 = i4;
                }
                return pvcVar;
            default:
                lw8.t((lw8) obj, (mw8) obj3, ((py5) ((qnd) obj4).M.invoke(new zy5(((this.b - mw8Var.a) << 32) | ((this.c - mw8Var.b) & 4294967295L)), ((e37) obj2).getLayoutDirection())).a);
                return pvcVar;
        }
    }

    public /* synthetic */ fv9(mw8[] mw8VarArr, gv9 gv9Var, int i, int i2, int[] iArr) {
        this.d = mw8VarArr;
        this.e = gv9Var;
        this.b = i;
        this.c = i2;
        this.f = iArr;
    }
}
