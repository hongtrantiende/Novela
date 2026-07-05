package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: de  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe b;

    public /* synthetic */ de(pe peVar, int i) {
        this.a = i;
        this.b = peVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        float f = nae.e;
        pe peVar = this.b;
        switch (i) {
            case 0:
                Object value = peVar.l.getValue();
                if (value == null) {
                    float h = peVar.j.h();
                    boolean isNaN = Float.isNaN(h);
                    hm8 hm8Var = peVar.g;
                    if (!isNaN) {
                        return peVar.c(h, nae.e, hm8Var.getValue());
                    }
                    return hm8Var.getValue();
                }
                return value;
            case 1:
                Object value2 = peVar.l.getValue();
                if (value2 == null) {
                    float h2 = peVar.j.h();
                    boolean isNaN2 = Float.isNaN(h2);
                    hm8 hm8Var2 = peVar.g;
                    if (!isNaN2) {
                        Object value3 = hm8Var2.getValue();
                        t07 d = peVar.d();
                        float d2 = d.d(value3);
                        int i2 = (d2 > h2 ? 1 : (d2 == h2 ? 0 : -1));
                        if (i2 != 0 && !Float.isNaN(d2)) {
                            if (i2 < 0) {
                                Object b = d.b(h2, true);
                                if (b != null) {
                                    return b;
                                }
                            } else {
                                Object b2 = d.b(h2, false);
                                if (b2 != null) {
                                    return b2;
                                }
                            }
                        }
                        return value3;
                    }
                    return hm8Var2.getValue();
                }
                return value2;
            case 2:
                float d3 = peVar.d().d(peVar.g.getValue());
                float d4 = peVar.d().d(peVar.i.getValue()) - d3;
                float abs = Math.abs(d4);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float f2 = (peVar.f() - d3) / d4;
                    if (f2 >= 1.0E-6f) {
                        if (f2 <= 0.999999f) {
                            f = f2;
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return peVar.d();
            default:
                return new yk8(peVar.d(), peVar.h.getValue());
        }
    }
}
