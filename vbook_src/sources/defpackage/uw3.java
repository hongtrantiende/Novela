package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uw3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uw3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex3 b;
    public final /* synthetic */ cp3 c;

    public /* synthetic */ uw3(ex3 ex3Var, cp3 cp3Var, int i) {
        this.a = i;
        this.b = ex3Var;
        this.c = cp3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean d;
        int i = this.a;
        cp3 cp3Var = this.c;
        ex3 ex3Var = this.b;
        switch (i) {
            case 0:
                y28 y28Var = (y28) obj;
                y28Var.getClass();
                d = ex3Var.d(cp3Var, y28Var);
                break;
            default:
                cp3 cp3Var2 = (cp3) obj;
                cp3Var2.getClass();
                d = ex3Var.b(cp3Var, cp3Var2);
                break;
        }
        return Boolean.valueOf(d);
    }
}
