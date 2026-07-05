package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mk  reason: default package */
/* loaded from: classes.dex */
public final class mk extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ hu4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk(Object obj, hu4 hu4Var, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = hu4Var;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        hu4 hu4Var = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ib3 ib3Var = (ib3) obj;
                i29 i29Var = (i29) obj5;
                i29Var.L.addView(i29Var, i29Var.M);
                i29Var.p((vt4) hu4Var, (m29) obj4, (String) obj3, (tc6) obj2);
                return new r6(i29Var, 2);
            default:
                long j = ((y78) obj).a;
                z87.v((m82) obj5, null, null, new jk8((do9) obj4, (aw7) obj3, (aw7) obj2, (m42) null), 3);
                ((xt4) hu4Var).invoke(new y78(j));
                return pvc.a;
        }
    }
}
