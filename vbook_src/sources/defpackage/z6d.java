package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z6d  reason: default package */
/* loaded from: classes3.dex */
public final class z6d implements tj4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ aw7 E;
    public final /* synthetic */ aw7 F;
    public final /* synthetic */ aw7 G;
    public final /* synthetic */ gcd a;
    public final /* synthetic */ long b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ aw7 f;

    public z6d(gcd gcdVar, long j, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, aw7 aw7Var, xt4 xt4Var4, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5) {
        this.a = gcdVar;
        this.b = j;
        this.c = xt4Var;
        this.d = xt4Var2;
        this.e = xt4Var3;
        this.f = aw7Var;
        this.C = xt4Var4;
        this.D = aw7Var2;
        this.E = aw7Var3;
        this.F = aw7Var4;
        this.G = aw7Var5;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Float f;
        oy8 oy8Var = (oy8) obj;
        oy8 oy8Var2 = oy8.b;
        pvc pvcVar = pvc.a;
        if (oy8Var == oy8Var2) {
            aw7 aw7Var = this.f;
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Long l = null;
            gcd gcdVar = this.a;
            if (!booleanValue) {
                aw7Var.setValue(Boolean.TRUE);
                j9d j9dVar = gcdVar.n;
                if (j9dVar != null) {
                    f = j9dVar.n();
                } else {
                    f = null;
                }
                if (f != null) {
                    this.C.invoke(new Float(f.floatValue()));
                }
            }
            aw7 aw7Var2 = this.D;
            boolean z = ((s6d) aw7Var2.getValue()).n;
            gcdVar.q = Boolean.valueOf(z);
            j9d j9dVar2 = gcdVar.n;
            if (j9dVar2 != null) {
                j9dVar2.c(z);
            }
            float f2 = ((s6d) aw7Var2.getValue()).p;
            gcdVar.r = Float.valueOf(f2);
            j9d j9dVar3 = gcdVar.n;
            if (j9dVar3 != null) {
                j9dVar3.b(f2);
            }
            if (!((Boolean) this.E.getValue()).booleanValue()) {
                aw7 aw7Var3 = this.F;
                if (((Number) aw7Var3.getValue()).doubleValue() > 0.0d && this.b <= 0) {
                    if (((s6d) aw7Var2.getValue()).d) {
                        gcdVar.a();
                        return pvcVar;
                    }
                } else {
                    double doubleValue = ((Number) aw7Var3.getValue()).doubleValue();
                    if (doubleValue <= 0.0d) {
                        l = 0L;
                    } else {
                        long j = this.b;
                        if (j > 0) {
                            l = Long.valueOf(dce.o((long) (j * doubleValue), 0L, j));
                        }
                    }
                    if (l != null) {
                        long longValue = l.longValue();
                        Boolean bool = Boolean.TRUE;
                        this.c.invoke(bool);
                        if (longValue > 0) {
                            if (!((s6d) aw7Var2.getValue()).f && !((Boolean) this.G.getValue()).booleanValue()) {
                                this.d.invoke(new Long(longValue));
                                this.e.invoke(bool);
                                return pvcVar;
                            }
                            hq7 hq7Var = wl3.b;
                            long P = jue.P(longValue, am3.MILLISECONDS);
                            j9d j9dVar4 = gcdVar.n;
                            if (j9dVar4 != null) {
                                j9dVar4.l(P);
                            }
                            if (((s6d) aw7Var2.getValue()).d) {
                                gcdVar.a();
                                return pvcVar;
                            }
                        } else if (((s6d) aw7Var2.getValue()).d) {
                            gcdVar.a();
                        }
                    }
                }
            }
        }
        return pvcVar;
    }
}
