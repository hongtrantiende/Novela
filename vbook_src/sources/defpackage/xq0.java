package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xq0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wk3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ xq0(String str, wk3 wk3Var, boolean z, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = wk3Var;
        this.d = z;
        this.e = vt4Var;
        this.f = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int p = xoe.p(i2 | 1);
                v9e.h(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).intValue();
                int p2 = xoe.p(i2 | 1);
                fre.i(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
