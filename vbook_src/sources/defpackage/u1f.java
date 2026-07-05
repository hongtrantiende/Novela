package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u1f  reason: default package */
/* loaded from: classes.dex */
public final class u1f extends hae {
    public final /* synthetic */ int e;
    public final /* synthetic */ w2f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1f(w2f w2fVar, lte lteVar, int i) {
        super(lteVar);
        this.e = i;
        this.f = w2fVar;
    }

    @Override // defpackage.hae
    public final void a() {
        int i = this.e;
        w2f w2fVar = this.f;
        switch (i) {
            case 0:
                w2fVar.W();
                if (w2fVar.o0()) {
                    ppe ppeVar = ((lte) w2fVar.a).f;
                    lte.m(ppeVar);
                    ppeVar.J.e("Inactivity, disconnecting from the service");
                    w2fVar.f0();
                    return;
                }
                return;
            default:
                ppe ppeVar2 = ((lte) w2fVar.a).f;
                lte.m(ppeVar2);
                ppeVar2.E.e("Tasks have been queued for a long time");
                return;
        }
    }
}
