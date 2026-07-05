package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wsa  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wsa implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cta b;

    public /* synthetic */ wsa(cta ctaVar, int i) {
        this.a = i;
        this.b = ctaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        cta ctaVar = this.b;
        switch (i) {
            case 0:
                hk1 a = jdd.a(ctaVar);
                sw2 sw2Var = ab3.a;
                ctaVar.f(a, ru2.c, new zsa(ctaVar, null, 1));
                return pvcVar;
            case 1:
                if (!ctaVar.Y && ctaVar.Z) {
                    hk1 a2 = jdd.a(ctaVar);
                    sw2 sw2Var2 = ab3.a;
                    ctaVar.f(a2, ru2.c, new zsa(ctaVar, null, 0));
                }
                return pvcVar;
            default:
                return sl1.i0(sl1.v0(ctaVar.a0, 5), " ", null, null, new eja(24), 30);
        }
    }
}
