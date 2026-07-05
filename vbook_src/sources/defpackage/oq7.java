package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oq7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bsa b;

    public /* synthetic */ oq7(bsa bsaVar, int i) {
        this.a = i;
        this.b = bsaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        bsa bsaVar = this.b;
        switch (i) {
            case 0:
                if (bsaVar != null) {
                    ((w03) bsaVar).a();
                }
                return pvcVar;
            default:
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                }
                return pvcVar;
        }
    }
}
