package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nk8  reason: default package */
/* loaded from: classes.dex */
public final class nk8 extends aab implements lu4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ si8 E;
    public final /* synthetic */ sk8 F;
    public final /* synthetic */ float G;
    public final /* synthetic */ long H;
    public final /* synthetic */ float I;
    public final /* synthetic */ float J;
    public final /* synthetic */ float K;
    public final /* synthetic */ float L;
    public final /* synthetic */ qi8 M;
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ri8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk8(float f, float f2, float f3, float f4, ri8 ri8Var, float f5, float f6, si8 si8Var, sk8 sk8Var, float f7, long j, float f8, float f9, float f10, float f11, qi8 qi8Var, m42 m42Var) {
        super(2, m42Var);
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ri8Var;
        this.C = f5;
        this.D = f6;
        this.E = si8Var;
        this.F = sk8Var;
        this.G = f7;
        this.H = j;
        this.I = f8;
        this.J = f9;
        this.K = f10;
        this.L = f11;
        this.M = qi8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new nk8(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((nk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1 && i != 2) {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hre.r(obj);
        } else {
            hre.r(obj);
            float f = this.c;
            float f2 = this.b;
            int i2 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
            final qi8 qi8Var = this.M;
            sk8 sk8Var = this.F;
            si8 si8Var = this.E;
            float f3 = this.D;
            float f4 = this.C;
            ri8 ri8Var = this.f;
            float f5 = this.e;
            float f6 = this.d;
            n82 n82Var = n82.a;
            if (i2 <= 0) {
                final float a = aye.a(f6, f5, ri8Var);
                final float b = aye.b(f4, f3, si8Var);
                final float f7 = this.G;
                final float f8 = this.c;
                final float f9 = this.J;
                final float f10 = this.L;
                lu4 lu4Var = new lu4() { // from class: mk8
                    @Override // defpackage.lu4
                    public final Object invoke(Object obj2, Object obj3) {
                        int i3 = r8;
                        pvc pvcVar = pvc.a;
                        float f11 = b;
                        float f12 = f10;
                        float f13 = a;
                        float f14 = f9;
                        float f15 = f8;
                        float f16 = f7;
                        qi8 qi8Var2 = qi8Var;
                        float floatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        switch (i3) {
                            case 0:
                                qi8Var2.e(((f15 - f16) * floatValue) + f16);
                                qi8Var2.c(((f13 - f14) * floatValue) + f14);
                                qi8Var2.d(((f11 - f12) * floatValue) + f12);
                                return pvcVar;
                            default:
                                qi8Var2.e(((f15 - f16) * floatValue) + f16);
                                qi8Var2.c(((f13 - f14) * floatValue) + f14);
                                qi8Var2.d(((f11 - f12) * floatValue) + f12);
                                return pvcVar;
                        }
                    }
                };
                this.a = 1;
                if (ote.l(nae.e, 1.0f, (gxa) sk8Var.f, lu4Var, this, 4) == n82Var) {
                    return n82Var;
                }
            } else {
                float f11 = f2 / this.G;
                float f12 = 1.0f - f11;
                long j = this.H;
                float intBitsToFloat = (this.J * f11) + ((Float.intBitsToFloat((int) (j >> 32)) - this.I) * f12);
                float intBitsToFloat2 = (this.L * f11) + ((Float.intBitsToFloat((int) (j & 4294967295L)) - this.K) * f12);
                yk8 m = aye.m(f6, f2, f5, ri8Var);
                float floatValue = ((Number) m.a).floatValue();
                float floatValue2 = ((Number) m.b).floatValue();
                yk8 t = aye.t(f4, f2, f3, si8Var);
                float floatValue3 = ((Number) t.a).floatValue();
                float floatValue4 = ((Number) t.b).floatValue();
                Float valueOf = Float.valueOf(dce.m(intBitsToFloat, floatValue, floatValue2));
                Float valueOf2 = Float.valueOf(dce.m(intBitsToFloat2, floatValue3, floatValue4));
                final float floatValue5 = valueOf.floatValue();
                final float floatValue6 = valueOf2.floatValue();
                final float f13 = this.G;
                final float f14 = this.b;
                final float f15 = this.J;
                final float f16 = this.L;
                lu4 lu4Var2 = new lu4() { // from class: mk8
                    @Override // defpackage.lu4
                    public final Object invoke(Object obj2, Object obj3) {
                        int i3 = r8;
                        pvc pvcVar = pvc.a;
                        float f112 = floatValue6;
                        float f122 = f16;
                        float f132 = floatValue5;
                        float f142 = f15;
                        float f152 = f14;
                        float f162 = f13;
                        qi8 qi8Var2 = qi8Var;
                        float floatValue7 = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        switch (i3) {
                            case 0:
                                qi8Var2.e(((f152 - f162) * floatValue7) + f162);
                                qi8Var2.c(((f132 - f142) * floatValue7) + f142);
                                qi8Var2.d(((f112 - f122) * floatValue7) + f122);
                                return pvcVar;
                            default:
                                qi8Var2.e(((f152 - f162) * floatValue7) + f162);
                                qi8Var2.c(((f132 - f142) * floatValue7) + f142);
                                qi8Var2.d(((f112 - f122) * floatValue7) + f122);
                                return pvcVar;
                        }
                    }
                };
                this.a = 2;
                if (ote.l(nae.e, 1.0f, (gxa) sk8Var.f, lu4Var2, this, 4) == n82Var) {
                    return n82Var;
                }
            }
        }
        return pvc.a;
    }
}
