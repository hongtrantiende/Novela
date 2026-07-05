package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lhd b;

    public /* synthetic */ yw0(lhd lhdVar, int i) {
        this.a = i;
        this.b = lhdVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        boolean j;
        int i = this.a;
        lhd lhdVar = this.b;
        switch (i) {
            case 0:
                j = lhdVar.j();
                break;
            case 1:
                return new yk8(lhdVar.f(), Boolean.valueOf(lhdVar.j()));
            default:
                j = lhdVar.j();
                break;
        }
        return Boolean.valueOf(j);
    }
}
