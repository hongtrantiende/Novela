package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: stb  reason: default package */
/* loaded from: classes.dex */
public final class stb implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytb b;

    public /* synthetic */ stb(ytb ytbVar, int i) {
        this.a = i;
        this.b = ytbVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        iya iyaVar;
        int i = this.a;
        ytb ytbVar = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                grb grbVar = (grb) obj;
                ytbVar.v(false);
                ytbVar.w(x2c.a);
                return pvcVar;
            default:
                if (((rk9) obj) != null) {
                    ytbVar.d.a();
                } else {
                    epb epbVar = ytbVar.d.a;
                    if (epbVar != null && (iyaVar = epbVar.Q) != null) {
                        iyaVar.cancel(null);
                        epbVar.Q = null;
                    }
                }
                return pvcVar;
        }
    }
}
