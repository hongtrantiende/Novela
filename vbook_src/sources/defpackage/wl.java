package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl implements lu4 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wl(yu7 yu7Var, nq7 nq7Var, gpa gpaVar, boolean z, long j, int i) {
        this.e = yu7Var;
        this.d = nq7Var;
        this.f = gpaVar;
        this.b = z;
        this.c = j;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ucd ucdVar = (ucd) obj4;
                l88 l88Var = (l88) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    pye.a(dy1.t.a(ucdVar), jce.E(1260045569, new yl(this.c, this.b, this.d, l88Var), rv4Var), rv4Var, 56);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                z1d.j(this.b, this.c, this.d, (vt4) obj4, (vt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                dae.e((yu7) obj4, this.d, (gpa) obj3, this.b, this.c, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                rgc.a((bzc) obj4, this.c, this.b, this.d, (String) obj3, (rv4) obj, xoe.p(393));
                return pvcVar;
        }
    }

    public /* synthetic */ wl(bzc bzcVar, long j, boolean z, nq7 nq7Var, String str, int i) {
        this.e = bzcVar;
        this.c = j;
        this.b = z;
        this.d = nq7Var;
        this.f = str;
    }

    public /* synthetic */ wl(ucd ucdVar, long j, boolean z, nq7 nq7Var, l88 l88Var) {
        this.e = ucdVar;
        this.c = j;
        this.b = z;
        this.d = nq7Var;
        this.f = l88Var;
    }

    public /* synthetic */ wl(boolean z, long j, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, int i) {
        this.b = z;
        this.c = j;
        this.d = nq7Var;
        this.e = vt4Var;
        this.f = vt4Var2;
    }
}
