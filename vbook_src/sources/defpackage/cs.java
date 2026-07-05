package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cs  reason: default package */
/* loaded from: classes3.dex */
public final class cs implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl9 b;
    public final /* synthetic */ wl9 c;
    public final /* synthetic */ dm8 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cs(yl9 yl9Var, wl9 wl9Var, dm8 dm8Var, Object obj, int i) {
        this.a = i;
        this.b = yl9Var;
        this.c = wl9Var;
        this.d = dm8Var;
        this.e = obj;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.e;
        dm8 dm8Var = this.d;
        wl9 wl9Var = this.c;
        yl9 yl9Var = this.b;
        switch (i) {
            case 0:
                long longValue = ((Number) obj).longValue() / 1000000;
                float o = (float) dce.o(longValue - yl9Var.a, 0L, 64L);
                yl9Var.a = longValue;
                wl9Var.a = ((o / 1000.0f) * (dm8Var.h() - wl9Var.a) * 2.5f) + wl9Var.a;
                dm8 dm8Var2 = (dm8) obj2;
                dm8Var2.i((o * wl9Var.a) + dm8Var2.h());
                return pvcVar;
            default:
                long longValue2 = ((Number) obj).longValue() / 1000000;
                float o2 = (float) dce.o(longValue2 - yl9Var.a, 0L, 64L);
                yl9Var.a = longValue2;
                float h = ((o2 / 1000.0f) * (dm8Var.h() - wl9Var.a) * 2.5f) + wl9Var.a;
                wl9Var.a = h;
                float f3 = (o2 / 16.67f) * h;
                ora oraVar = (ora) obj2;
                Iterator it = oraVar.iterator();
                int i2 = 0;
                while (true) {
                    y65 y65Var = (y65) it;
                    if (y65Var.hasNext()) {
                        Object next = y65Var.next();
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            cn8 cn8Var = (cn8) next;
                            float f4 = cn8Var.a;
                            float f5 = cn8Var.c;
                            float f6 = (f5 * f3) + f4;
                            float f7 = cn8Var.b;
                            float f8 = cn8Var.d;
                            float f9 = (f8 * f3) + f7;
                            if (f6 < 0.02f) {
                                f5 = Math.abs(f5);
                                f6 = 0.02f;
                            }
                            if (f6 > 0.98f) {
                                f5 = -Math.abs(f5);
                                f = 0.98f;
                            } else {
                                f = f6;
                            }
                            if (f9 < 0.02f) {
                                f8 = Math.abs(f8);
                                f9 = 0.02f;
                            }
                            if (f9 > 0.98f) {
                                f8 = -Math.abs(f8);
                                f2 = 0.98f;
                            } else {
                                f2 = f9;
                            }
                            sg9 sg9Var = tg9.a;
                            float j = ((sg9Var.j() - 0.5f) * 4.0E-6f) + f5;
                            float j2 = ((sg9Var.j() - 0.5f) * 4.0E-6f) + f8;
                            float sqrt = (float) Math.sqrt((j2 * j2) + (j * j));
                            if (sqrt > 2.5E-4f) {
                                j = (j / sqrt) * 2.5E-4f;
                                j2 = (j2 / sqrt) * 2.5E-4f;
                            }
                            oraVar.set(i2, new cn8(f, f2, j, j2, cn8Var.e, cn8Var.f));
                            i2 = i3;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    } else {
                        return pvcVar;
                    }
                }
        }
    }
}
