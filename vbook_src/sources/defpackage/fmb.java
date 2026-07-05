package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fmb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fmb implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ppb b;

    public /* synthetic */ fmb(ppb ppbVar, int i) {
        this.a = i;
        this.b = ppbVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ppb ppbVar = this.b;
        switch (i) {
            case 0:
                ppbVar.a();
                return pvcVar;
            default:
                opb opbVar = ppbVar.a;
                opbVar.e = true;
                opbVar.d = true;
                opbVar.b = null;
                return pvcVar;
        }
    }
}
