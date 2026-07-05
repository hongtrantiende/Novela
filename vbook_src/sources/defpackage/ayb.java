package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ayb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ayb implements vt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ayb(Long l, xt4 xt4Var, gcd gcdVar, boolean z, xt4 xt4Var2) {
        this.e = l;
        this.b = xt4Var;
        this.f = gcdVar;
        this.c = z;
        this.d = xt4Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        long j;
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = null;
        xt4 xt4Var = this.d;
        boolean z = this.c;
        Object obj = this.f;
        xt4 xt4Var2 = this.b;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                String str2 = (String) obj2;
                aw7 aw7Var = (aw7) obj;
                if (z) {
                    pmb pmbVar = (pmb) aw7Var.getValue();
                    if (pmbVar != null) {
                        str = pmbVar.a;
                    }
                    if (str == null) {
                        str = "";
                    }
                    xt4Var2.invoke(str);
                } else {
                    xt4Var.invoke(str2);
                }
                return pvcVar;
            default:
                Long l = (Long) obj2;
                gcd gcdVar = (gcd) obj;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (j <= 0) {
                    xt4Var2.invoke(null);
                    gcdVar.a();
                } else {
                    if (z) {
                        xt4Var.invoke(Boolean.TRUE);
                    }
                    xt4Var2.invoke(null);
                    hq7 hq7Var = wl3.b;
                    long P = jue.P(j, am3.MILLISECONDS);
                    j9d j9dVar = gcdVar.n;
                    if (j9dVar != null) {
                        j9dVar.l(P);
                    }
                    gcdVar.a();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ayb(boolean z, xt4 xt4Var, xt4 xt4Var2, String str, aw7 aw7Var) {
        this.c = z;
        this.b = xt4Var;
        this.d = xt4Var2;
        this.e = str;
        this.f = aw7Var;
    }
}
