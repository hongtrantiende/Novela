package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements lu4 {
    public final /* synthetic */ nq7 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ rh8 c;
    public final /* synthetic */ bkd d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ br0(cz7 cz7Var, rh8 rh8Var, bkd bkdVar, String str, boolean z, nq7 nq7Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = cz7Var;
        this.c = rh8Var;
        this.d = bkdVar;
        this.e = str;
        this.f = z;
        this.C = nq7Var;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.D;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                v9e.b(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p, this.E);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                fre.a(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p2, this.E);
                return pvcVar;
        }
    }
}
