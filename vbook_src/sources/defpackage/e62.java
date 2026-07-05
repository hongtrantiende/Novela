package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e62  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e62 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc2 b;

    public /* synthetic */ e62(zc2 zc2Var, int i) {
        this.a = i;
        this.b = zc2Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        zc2 zc2Var = this.b;
        switch (i) {
            case 0:
                zc2Var.getClass();
                cs5 a = zc2Var.a();
                int i2 = (((zc2Var.a().a - 90) % 360) + 360) % 360;
                if (i2 > 180) {
                    i2 -= 360;
                }
                zc2Var.d(cs5.a(a, i2, 0L, 6));
                return pvcVar;
            case 1:
                zc2Var.getClass();
                cs5 a2 = zc2Var.a();
                int i3 = (((zc2Var.a().a + 90) % 360) + 360) % 360;
                if (i3 > 180) {
                    i3 -= 360;
                }
                zc2Var.d(cs5.a(a2, i3, 0L, 6));
                return pvcVar;
            case 2:
                zc2Var.getClass();
                if ((zc2Var.a().a / 90) % 2 == 0) {
                    jsc.E(zc2Var);
                } else {
                    jsc.F(zc2Var);
                }
                return pvcVar;
            case 3:
                zc2Var.getClass();
                if ((zc2Var.a().a / 90) % 2 == 0) {
                    jsc.F(zc2Var);
                } else {
                    jsc.E(zc2Var);
                }
                return pvcVar;
            case 4:
                zc2Var.m.setValue(Boolean.FALSE);
                zc2Var.o.invoke();
                return pvcVar;
            case 5:
                zc2Var.d(zc2Var.a);
                wc2 wc2Var = zc2Var.b;
                wc2Var.getClass();
                zc2Var.j.setValue(wc2Var);
                zc2Var.k.setValue(Boolean.valueOf(zc2Var.d));
                zc2Var.h.setValue(zc2Var.g);
                zc2Var.l.setValue(Boolean.valueOf(zc2Var.c));
                return pvcVar;
            case 6:
                zc2Var.m.setValue(Boolean.TRUE);
                zc2Var.o.invoke();
                return pvcVar;
            default:
                zc2Var.m.setValue(Boolean.FALSE);
                zc2Var.o.invoke();
                return pvcVar;
        }
    }
}
