package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jua  reason: default package */
/* loaded from: classes3.dex */
public final class jua implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu4 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jua(hu4 hu4Var, Object obj, int i) {
        this.a = i;
        this.b = hu4Var;
        this.c = obj;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.c;
        hu4 hu4Var = this.b;
        switch (i) {
            case 0:
                x8b x8bVar = (x8b) obj;
                ((lu4) hu4Var).invoke(x8bVar.b, x8bVar.c);
                return pvcVar;
            case 1:
                ((xt4) hu4Var).invoke(Integer.valueOf(((t23) obj).a));
                return pvcVar;
            case 2:
                orc orcVar = (orc) obj;
                ((nu4) hu4Var).h(orcVar.a, orcVar.c, orcVar.d, orcVar.e);
                return pvcVar;
            case 3:
                ((xt4) hu4Var).invoke((wzc) obj);
                return pvcVar;
            default:
                ((xt4) hu4Var).invoke((lbd) obj);
                return pvcVar;
        }
    }
}
