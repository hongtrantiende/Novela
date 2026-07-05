package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z93  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class z93 implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ int a;
    public final /* synthetic */ ar5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ z93(ar5 ar5Var, boolean z, boolean z2, vt4 vt4Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = ar5Var;
        this.c = z;
        this.d = z2;
        this.e = vt4Var;
        this.f = i;
        this.C = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                fa3.h(this.b, this.c, this.d, this.e, (rv4) obj, p, this.C);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                rgc.n(this.b, this.c, this.d, this.e, (rv4) obj, p2, this.C);
                return pvcVar;
        }
    }
}
