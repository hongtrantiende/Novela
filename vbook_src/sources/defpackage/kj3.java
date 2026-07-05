package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kj3  reason: default package */
/* loaded from: classes.dex */
public final class kj3 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj3(xt4 xt4Var, aw7 aw7Var, m82 m82Var, aw7 aw7Var2) {
        super(1);
        this.a = 1;
        this.e = xt4Var;
        this.b = aw7Var;
        this.c = m82Var;
        this.d = aw7Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [yi3, java.lang.Object] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        float f3;
        long j;
        long j2;
        long j3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        ckc ckcVar = null;
        boolean z = true;
        Object obj2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((ib3) obj).getClass();
                return new ir2((vt4) obj3, (aw7) obj2, (aw7) obj5, (m82) obj4);
            case 1:
                long j4 = ((y78) obj).a;
                ((aw7) obj2).setValue(Boolean.TRUE);
                ?? obj6 = new Object();
                z87.v((m82) obj4, null, null, new jj3(obj6, null, 1), 3);
                ((aw7) obj5).setValue(obj6);
                ((xt4) obj3).invoke(new y78(j4));
                return pvcVar;
            case 2:
                t15 t15Var = (t15) obj;
                sga sgaVar = (sga) obj3;
                yya yyaVar = (yya) obj2;
                float f4 = 1.0f;
                if (yyaVar != null) {
                    f = ((Number) yyaVar.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                sk8 sk8Var = sgaVar.c;
                if (sgaVar.b() && ((Boolean) ((hm8) sk8Var.a).getValue()).booleanValue()) {
                    f2 = ((dm8) sk8Var.b).h();
                } else {
                    f2 = 1.0f;
                }
                float f5 = f * f2;
                if (sgaVar.b()) {
                    sgaVar.f = f5;
                }
                t15Var.q(f5);
                yya yyaVar2 = (yya) obj5;
                if (yyaVar2 != null) {
                    f3 = ((Number) yyaVar2.getValue()).floatValue();
                } else {
                    f3 = 1.0f;
                }
                if (!sgaVar.b() || !((Boolean) ((hm8) sk8Var.c).getValue()).booleanValue()) {
                    z = false;
                }
                if (z) {
                    f4 = ((dm8) sk8Var.d).h();
                }
                float f6 = f3 * f4;
                if (sgaVar.b()) {
                    sgaVar.g = f6;
                    if (z) {
                        if (sgaVar.j == null) {
                            sgaVar.j = new b5d(false);
                        }
                        b5d b5dVar = sgaVar.j;
                        if (b5dVar != null) {
                            b5dVar.a(f6, wl3.e(u9c.a(sgaVar.d)));
                        }
                    }
                }
                t15Var.v(f6);
                t15Var.l(f6);
                yya yyaVar3 = (yya) obj4;
                if (yyaVar3 != null) {
                    j = ((ckc) yyaVar3.getValue()).a;
                } else {
                    j = ckc.b;
                }
                if (sgaVar.b() && ((Boolean) ((hm8) sk8Var.e).getValue()).booleanValue()) {
                    j = ((ckc) ((hm8) sk8Var.f).getValue()).a;
                }
                if (sgaVar.b()) {
                    sgaVar.h = j;
                }
                t15Var.Z0(j);
                return pvcVar;
            default:
                lz3 lz3Var = (lz3) obj5;
                int ordinal = ((st3) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            iz9 iz9Var = lz3Var.a.d;
                            if (iz9Var != null) {
                                j3 = iz9Var.b;
                            } else {
                                j3 = ((sga) obj4).h;
                            }
                            ckcVar = new ckc(j3);
                        } else {
                            xk5.o();
                            return null;
                        }
                    } else {
                        ckcVar = (ckc) obj3;
                    }
                } else {
                    iz9 iz9Var2 = ((eu3) obj2).a.d;
                    if (iz9Var2 != null) {
                        ckcVar = new ckc(iz9Var2.b);
                    } else {
                        iz9 iz9Var3 = lz3Var.a.d;
                        if (iz9Var3 != null) {
                            ckcVar = new ckc(iz9Var3.b);
                        }
                    }
                }
                if (ckcVar != null) {
                    j2 = ckcVar.a;
                } else {
                    j2 = ckc.b;
                }
                return new ckc(j2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }
}
