package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: usa  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class usa implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cta b;

    public /* synthetic */ usa(cta ctaVar, int i) {
        this.a = i;
        this.b = ctaVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        cta ctaVar = this.b;
        do6 do6Var = (do6) obj;
        switch (i) {
            case 0:
                do6Var.getClass();
                ctaVar.k();
                return new vsa(do6Var, ctaVar, 0);
            default:
                do6Var.getClass();
                ctaVar.k();
                return new vsa(do6Var, ctaVar, 1);
        }
    }
}
