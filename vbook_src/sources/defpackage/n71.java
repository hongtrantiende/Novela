package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n71  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n71 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl9 b;
    public final /* synthetic */ ig6 c;

    public /* synthetic */ n71(wl9 wl9Var, ig6 ig6Var, int i) {
        this.a = i;
        this.b = wl9Var;
        this.c = ig6Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ig6 ig6Var = this.c;
        wl9 wl9Var = this.b;
        float floatValue = ((Float) obj).floatValue();
        ((Float) obj2).getClass();
        switch (i) {
            case 0:
                wl9Var.a += ig6Var.b.a(floatValue - wl9Var.a);
                return pvcVar;
            default:
                wl9Var.a += ig6Var.b.a(floatValue - wl9Var.a);
                return pvcVar;
        }
    }
}
