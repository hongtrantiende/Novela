package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tua  reason: default package */
/* loaded from: classes3.dex */
public final class tua implements xt4 {
    public final /* synthetic */ yl9 a;
    public final /* synthetic */ wl9 b;
    public final /* synthetic */ dm8 c;
    public final /* synthetic */ ora d;
    public final /* synthetic */ dm8 e;

    public tua(yl9 yl9Var, wl9 wl9Var, dm8 dm8Var, ora oraVar, dm8 dm8Var2) {
        this.a = yl9Var;
        this.b = wl9Var;
        this.c = dm8Var;
        this.d = oraVar;
        this.e = dm8Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float sqrt;
        float cos;
        float sin;
        long longValue = ((Number) obj).longValue() / 1000000;
        yl9 yl9Var = this.a;
        float o = (float) dce.o(longValue - yl9Var.a, 0L, 64L);
        yl9Var.a = longValue;
        wl9 wl9Var = this.b;
        wl9Var.a = ((o / 1000.0f) * ((((this.c.h() - 1.0f) * 3.0f) + 1.0f) - wl9Var.a) * 5.0f) + wl9Var.a;
        dm8 dm8Var = this.e;
        dm8Var.i(((o / 16.67f) * wl9Var.a * 0.0025f) + dm8Var.h());
        ora oraVar = this.d;
        Iterator it = oraVar.iterator();
        int i = 0;
        while (true) {
            y65 y65Var = (y65) it;
            if (y65Var.hasNext()) {
                Object next = y65Var.next();
                int i2 = i + 1;
                if (i >= 0) {
                    kya kyaVar = (kya) next;
                    float h = ((dm8Var.h() * kyaVar.f) + kyaVar.g) % 1.0f;
                    if ((h > 0.98f || h < 0.01f) && kyaVar.h != ((int) dm8Var.h())) {
                        do {
                            sg9 sg9Var = tg9.a;
                            sqrt = ((float) Math.sqrt(sg9Var.j())) * 1.5f;
                            double j = sg9Var.j() * 360.0f * 0.017453292f;
                            cos = ((float) Math.cos(j)) * sqrt;
                            sin = ((float) Math.sin(j)) * sqrt;
                        } while (sqrt < 0.15f);
                        oraVar.set(i, new kya(cos, sin, kyaVar.c, kyaVar.d, kyaVar.e, kyaVar.f, kyaVar.g, (int) dm8Var.h()));
                    }
                    i = i2;
                } else {
                    tl1.M();
                    throw null;
                }
            } else {
                return pvc.a;
            }
        }
    }
}
