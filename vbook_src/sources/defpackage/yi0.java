package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yi0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytb b;

    public /* synthetic */ yi0(ytb ytbVar, int i) {
        this.a = i;
        this.b = ytbVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        sc6 q;
        rk9 rk9Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        ytb ytbVar = this.b;
        switch (i) {
            case 0:
                return ytbVar.p(true, false);
            case 1:
                return ytbVar.p(false, false);
            case 2:
                return Boolean.valueOf(ytbVar.j(false).a);
            case 3:
                hm8 hm8Var = ytbVar.t;
                mkc mkcVar = ytbVar.a;
                boolean d = fxb.d(mkcVar.f().e);
                if (((d && ((x2c) hm8Var.getValue()) == x2c.b) || (!d && ((x2c) hm8Var.getValue()) == x2c.c)) && ytbVar.l() == null && ((Boolean) ytbVar.l.getValue()).booleanValue() && (q = ytbVar.q()) != null) {
                    rk9 w = yte.w(q);
                    rk9 n = npe.n(q.h0(w.j()), w.h());
                    sc6 q2 = ytbVar.q();
                    if (q2 != null) {
                        long j = mkcVar.f().e;
                        if (fxb.d(j)) {
                            rk9 k = ytbVar.k();
                            rk9Var = npe.n(q2.h0(k.j()), k.h());
                        } else {
                            long h0 = q2.h0(ytbVar.o(true));
                            long h02 = q2.h0(ytbVar.o(false));
                            fvb c = ytbVar.b.c();
                            if (c == null) {
                                rk9Var = rk9.e;
                            } else {
                                float intBitsToFloat = Float.intBitsToFloat((int) (q2.h0((Float.floatToRawIntBits(c.c((int) (j >> 32)).b) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32)) & 4294967295L));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (q2.h0((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(c.c((int) (j & 4294967295L)).b) & 4294967295L)) & 4294967295L));
                                int i2 = (int) (h0 >> 32);
                                int i3 = (int) (h02 >> 32);
                                float min = Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                                float max = Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                                if (min == max) {
                                    max += 1.0f;
                                }
                                rk9Var = new rk9(min, Math.min(intBitsToFloat, intBitsToFloat2), max, Math.max(Float.intBitsToFloat((int) (h0 & 4294967295L)), Float.intBitsToFloat((int) (h02 & 4294967295L))));
                            }
                        }
                        if (rk9Var.m(n)) {
                            return rk9Var.k(n);
                        }
                    } else {
                        ov5.d("textLayoutCoordinates should not be null.");
                        ls2.c();
                    }
                }
                return null;
            case 4:
                return (rk9) ytbVar.y.getValue();
            case 5:
                return ytbVar.a.f();
            case 6:
                ytbVar.d();
                return pvcVar;
            case 7:
                return Boolean.valueOf(!((Boolean) ytbVar.u.getValue()).booleanValue());
            case 8:
                mkc mkcVar2 = ytbVar.a;
                dub dubVar = mkcVar2.a;
                og0 og0Var = mkcVar2.b;
                dubVar.b.a().k();
                frb frbVar = dubVar.b;
                uwe.p(frbVar, 0, frbVar.c.length());
                dub.a(dubVar, og0Var, true, wrb.a);
                dubVar.f(true);
                return pvcVar;
            default:
                vt4 vt4Var = ytbVar.m;
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                return pvcVar;
        }
    }
}
