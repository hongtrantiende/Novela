package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jn1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jn1 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn1 b;

    public /* synthetic */ jn1(mn1 mn1Var, int i) {
        this.a = i;
        this.b = mn1Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        rm3 rm3Var = rm3.d;
        rm3 rm3Var2 = rm3.c;
        mn1 mn1Var = this.b;
        sm3 sm3Var = (sm3) obj;
        switch (i) {
            case 0:
                sm3Var.getClass();
                if (sm3Var.j != rm3Var2) {
                    return null;
                }
                if (sm3Var.c) {
                    return mn1Var.w();
                }
                return mn1Var.x();
            case 1:
                sm3Var.getClass();
                if (sm3Var.j != rm3Var) {
                    return null;
                }
                return new nfc(mn1Var.p(), mn1Var.E(), 10.0d, ofc.a, false, mfc.b, 16);
            case 2:
                sm3Var.getClass();
                if (sm3Var.j == rm3Var2) {
                    if (sm3Var.c) {
                        return mn1Var.w();
                    }
                    return mn1Var.x();
                }
                return mn1Var.H();
            case 3:
                sm3Var.getClass();
                if (sm3Var.j != rm3Var2) {
                    return null;
                }
                if (sm3Var.c) {
                    return mn1Var.w();
                }
                return mn1Var.x();
            case 4:
                sm3Var.getClass();
                if (sm3Var.j != rm3Var) {
                    return null;
                }
                return new nfc(mn1Var.t(), mn1Var.F(), 10.0d, ofc.a, false, mfc.b, 16);
            case 5:
                sm3Var.getClass();
                if (sm3Var.j != rm3Var2) {
                    return null;
                }
                if (sm3Var.c) {
                    return mn1Var.w();
                }
                return mn1Var.x();
            case 6:
                sm3Var.getClass();
                if (sm3Var.j != rm3Var) {
                    return null;
                }
                return new nfc(mn1Var.z(), mn1Var.J(), 10.0d, ofc.a, false, mfc.b, 16);
            default:
                sm3Var.getClass();
                if (sm3Var.j != rm3Var2) {
                    return null;
                }
                return new nfc(mn1Var.t(), mn1Var.s(), 5.0d, ofc.d, false, mfc.b, 16);
        }
    }
}
