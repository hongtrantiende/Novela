package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ud7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud7 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ hu4 D;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ ud7(String str, boolean z, int i, boolean z2, xt4 xt4Var, lu4 lu4Var, int i2, int i3) {
        this.C = str;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = xt4Var;
        this.D = lu4Var;
        this.f = i3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.D;
        Object obj3 = this.C;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                yz1.d((String) obj3, this.b, this.c, this.d, this.e, (lu4) hu4Var, (rv4) obj, p, this.f);
                return pvcVar;
            default:
                ((Integer) obj2).intValue();
                int p2 = xoe.p(this.f | 1);
                c16.f(this.b, this.c, this.d, this.e, (vt4) obj3, (vt4) hu4Var, (rv4) obj, p2);
                return pvcVar;
        }
    }

    public /* synthetic */ ud7(boolean z, int i, boolean z2, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, int i2) {
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = xt4Var;
        this.C = vt4Var;
        this.D = vt4Var2;
        this.f = i2;
    }
}
