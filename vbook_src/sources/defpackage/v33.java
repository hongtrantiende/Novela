package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v33  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class v33 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v33(cz7 cz7Var, String str, int i) {
        this.a = i;
        this.b = cz7Var;
        this.c = str;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.c;
        cz7 cz7Var = this.b;
        switch (i) {
            case 0:
                tc4.r(cz7Var, str);
                return pvcVar;
            case 1:
                cz7Var.getClass();
                str.getClass();
                cz7Var.a.c(new fi9(str));
                return pvcVar;
            default:
                cz7Var.getClass();
                str.getClass();
                cz7Var.a.c(new ii9(str));
                return pvcVar;
        }
    }
}
