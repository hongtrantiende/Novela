package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q35  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q35 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xl9 b;
    public final /* synthetic */ xl9 c;

    public /* synthetic */ q35(xl9 xl9Var, xl9 xl9Var2, int i) {
        this.a = i;
        this.b = xl9Var;
        this.c = xl9Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        xl9 xl9Var = this.c;
        xl9 xl9Var2 = this.b;
        b27 b27Var = (b27) obj;
        switch (i) {
            case 0:
                if (xl9Var2.a == -1) {
                    xl9Var2.a = b27Var.b().a;
                }
                xl9Var.a = b27Var.b().b + 1;
                return "";
            default:
                if (xl9Var2.a == -1) {
                    xl9Var2.a = b27Var.b().a;
                }
                xl9Var.a = b27Var.b().b + 1;
                return "";
        }
    }
}
