package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r42  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class r42 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl9 b;
    public final /* synthetic */ i2a c;

    public /* synthetic */ r42(wl9 wl9Var, i2a i2aVar) {
        this.a = 1;
        this.b = wl9Var;
        this.c = i2aVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        wl9 wl9Var = this.b;
        i2a i2aVar = this.c;
        float floatValue = ((Float) obj).floatValue();
        ((Float) obj2).getClass();
        switch (i) {
            case 0:
                i2aVar.a(Math.abs(floatValue - wl9Var.a));
                wl9Var.a = floatValue;
                return pvcVar;
            case 1:
                float f = wl9Var.a;
                wl9Var.a = i2aVar.a(floatValue - f) + f;
                return pvcVar;
            default:
                i2aVar.a(Math.abs(floatValue - wl9Var.a));
                wl9Var.a = floatValue;
                return pvcVar;
        }
    }

    public /* synthetic */ r42(i2a i2aVar, wl9 wl9Var, int i) {
        this.a = i;
        this.c = i2aVar;
        this.b = wl9Var;
    }
}
