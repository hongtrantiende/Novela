package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ipa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ipa implements lu4 {
    public final /* synthetic */ lu4 C;
    public final /* synthetic */ mu4 D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int a;
    public final /* synthetic */ kpa b;
    public final /* synthetic */ wpa c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gpa f;

    public /* synthetic */ ipa(kpa kpaVar, wpa wpaVar, nq7 nq7Var, boolean z, gpa gpaVar, lu4 lu4Var, mu4 mu4Var, float f, float f2, int i, int i2, int i3) {
        this.a = i3;
        this.b = kpaVar;
        this.c = wpaVar;
        this.d = nq7Var;
        this.e = z;
        this.f = gpaVar;
        this.C = lu4Var;
        this.D = mu4Var;
        this.E = f;
        this.F = f2;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                this.b.a(this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, p, this.H);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                int p3 = xoe.p(this.H);
                this.b.b(this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, p2, p3);
                return pvcVar;
        }
    }
}
