package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cx implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ yya c;

    public /* synthetic */ cx(cz7 cz7Var, yya yyaVar, int i) {
        this.a = i;
        this.b = cz7Var;
        this.c = yyaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        yya yyaVar = this.c;
        cz7 cz7Var = this.b;
        switch (i) {
            case 0:
                if (((kn6) yyaVar.getValue()).compareTo(kn6.e) >= 0 && !(cz7Var.a() instanceof li9)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                tc4.r(cz7Var, ((xq6) yyaVar.getValue()).d);
                return pvcVar;
            default:
                tc4.r(cz7Var, ((xq6) yyaVar.getValue()).d);
                return pvcVar;
        }
    }
}
