package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tqa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tqa implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ wl9 c;
    public final /* synthetic */ i2a d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ tqa(float f, wl9 wl9Var, i2a i2aVar, xt4 xt4Var, int i) {
        this.a = i;
        this.b = f;
        this.c = wl9Var;
        this.d = i2aVar;
        this.e = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.e;
        i2a i2aVar = this.d;
        wl9 wl9Var = this.c;
        float f2 = this.b;
        wr wrVar = (wr) obj;
        switch (i) {
            case 0:
                int i2 = (Math.abs(((Number) wrVar.e.getValue()).floatValue()) > Math.abs(f2) ? 1 : (Math.abs(((Number) wrVar.e.getValue()).floatValue()) == Math.abs(f2) ? 0 : -1));
                hm8 hm8Var = wrVar.e;
                if (i2 >= 0) {
                    float l = nae.l(((Number) hm8Var.getValue()).floatValue(), f2);
                    nae.k(wrVar, i2aVar, xt4Var, l - wl9Var.a);
                    wrVar.a();
                    wl9Var.a = l;
                } else {
                    nae.k(wrVar, i2aVar, xt4Var, ((Number) hm8Var.getValue()).floatValue() - wl9Var.a);
                    wl9Var.a = ((Number) hm8Var.getValue()).floatValue();
                }
                return pvcVar;
            default:
                float l2 = nae.l(((Number) wrVar.e.getValue()).floatValue(), f2);
                float f3 = l2 - wl9Var.a;
                try {
                    f = i2aVar.a(f3);
                } catch (CancellationException unused) {
                    wrVar.a();
                    f = nae.e;
                }
                xt4Var.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || l2 != ((Number) wrVar.e.getValue()).floatValue()) {
                    wrVar.a();
                }
                wl9Var.a += f;
                return pvcVar;
        }
    }
}
