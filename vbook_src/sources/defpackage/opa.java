package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: opa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class opa implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpa b;

    public /* synthetic */ opa(r13 r13Var, wpa wpaVar, aw7 aw7Var) {
        this.a = 1;
        this.b = wpaVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        wpa wpaVar = this.b;
        switch (i2) {
            case 0:
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                xt4 xt4Var = wpaVar.e;
                if (xt4Var != null) {
                    xt4Var.invoke(f);
                } else {
                    wpaVar.d(floatValue);
                }
                return pvcVar;
            case 1:
                zy5 zy5Var = (zy5) obj;
                wpaVar.l.i((int) (zy5Var.a >> 32));
                wpaVar.m.i((int) (zy5Var.a & 4294967295L));
                return pvcVar;
            case 2:
                float floatValue2 = ((Float) obj).floatValue();
                jk1 jk1Var = wpaVar.c;
                dm8 dm8Var = wpaVar.d;
                float f2 = jk1Var.a;
                float f3 = jk1Var.b;
                float m = dce.m(floatValue2, f2, f3);
                int i3 = wpaVar.a;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float f4 = m;
                    float f5 = f4;
                    int i4 = 0;
                    while (true) {
                        float o = b23.o(jk1Var.a, f3, i4 / i);
                        float f6 = o - m;
                        if (Math.abs(f6) <= f4) {
                            f4 = Math.abs(f6);
                            f5 = o;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            m = f5;
                        }
                    }
                }
                if (m != dm8Var.h()) {
                    if (m != dm8Var.h()) {
                        xt4 xt4Var2 = wpaVar.e;
                        if (xt4Var2 != null) {
                            xt4Var2.invoke(Float.valueOf(m));
                        } else {
                            wpaVar.d(m);
                        }
                    }
                    vt4 vt4Var = wpaVar.b;
                    if (vt4Var != null) {
                        vt4Var.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                y78 y78Var = (y78) obj;
                wpaVar.b(nae.e);
                wpaVar.p.invoke();
                return pvcVar;
        }
    }

    public /* synthetic */ opa(wpa wpaVar, int i) {
        this.a = i;
        this.b = wpaVar;
    }
}
