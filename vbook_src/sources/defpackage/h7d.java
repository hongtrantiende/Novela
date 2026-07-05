package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h7d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7d implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gcd b;
    public final /* synthetic */ t7d c;

    public /* synthetic */ h7d(gcd gcdVar, t7d t7dVar, int i) {
        this.a = i;
        this.b = gcdVar;
        this.c = t7dVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        am3 am3Var = am3.MILLISECONDS;
        t7d t7dVar = this.c;
        gcd gcdVar = this.b;
        long longValue = ((Long) obj).longValue();
        switch (i) {
            case 0:
                hq7 hq7Var = wl3.b;
                long P = jue.P(longValue, am3Var);
                j9d j9dVar = gcdVar.n;
                if (j9dVar != null) {
                    j9dVar.l(P);
                }
                t7d.e(t7dVar);
                return pvcVar;
            default:
                hq7 hq7Var2 = wl3.b;
                long P2 = jue.P(longValue, am3Var);
                j9d j9dVar2 = gcdVar.n;
                if (j9dVar2 != null) {
                    j9dVar2.l(P2);
                }
                t7d.e(t7dVar);
                return pvcVar;
        }
    }
}
