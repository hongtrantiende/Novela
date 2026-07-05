package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q8c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8c implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8c b;

    public /* synthetic */ q8c(s8c s8cVar, int i) {
        this.a = i;
        this.b = s8cVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        s8c s8cVar = this.b;
        switch (i) {
            case 0:
                return sl1.u0(s8cVar.f.d, new roa(14));
            default:
                return new yk8(new zy5(((zy5) s8cVar.d.getValue()).a), (rk9) s8cVar.e.getValue());
        }
    }
}
