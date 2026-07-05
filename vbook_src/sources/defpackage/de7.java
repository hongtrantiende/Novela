package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: de7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class de7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8 b;

    public /* synthetic */ de7(d8 d8Var, int i) {
        this.a = i;
        this.b = d8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        d8 d8Var = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                d8Var.b();
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                d8Var.getClass();
                d8Var.g.setValue(str);
                return pvcVar;
            default:
                pmb pmbVar = (pmb) obj;
                pmbVar.getClass();
                this.b.c(pmbVar.a, pmbVar.c, pmbVar.i, pmbVar.j, pmbVar.f, pmbVar.h, pmbVar.g);
                return pvcVar;
        }
    }
}
