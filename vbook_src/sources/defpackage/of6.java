package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: of6  reason: default package */
/* loaded from: classes3.dex */
public final class of6 extends aab implements mu4 {
    public final /* synthetic */ h3a C;
    public final /* synthetic */ xt4 D;
    public final /* synthetic */ xt4 E;
    public final /* synthetic */ xt4 F;
    public final /* synthetic */ int a;
    public /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ vt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of6(float f, boolean z, vt4 vt4Var, vt4 vt4Var2, h3a h3aVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.c = f;
        this.d = z;
        this.e = vt4Var;
        this.f = vt4Var2;
        this.C = h3aVar;
        this.D = xt4Var;
        this.E = xt4Var2;
        this.F = xt4Var3;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                m82 m82Var = (m82) obj;
                long j = ((y78) obj2).a;
                xt4 xt4Var = this.F;
                of6 of6Var = new of6(this.c, this.d, this.e, this.f, this.C, this.D, this.E, xt4Var, (m42) obj3, 0);
                of6Var.b = j;
                return of6Var.invokeSuspend(pvcVar);
            default:
                m82 m82Var2 = (m82) obj;
                long j2 = ((y78) obj2).a;
                xt4 xt4Var2 = this.F;
                of6 of6Var2 = new of6(this.c, this.d, this.e, this.f, this.C, this.D, this.E, xt4Var2, (m42) obj3, 1);
                of6Var2.b = j2;
                return of6Var2.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        float intBitsToFloat;
        float floatValue;
        float intBitsToFloat2;
        float floatValue2;
        int i = this.a;
        xt4 xt4Var = this.E;
        h3a h3aVar = this.C;
        vt4 vt4Var = this.e;
        float f = this.c;
        pvc pvcVar = pvc.a;
        boolean z = this.d;
        vt4 vt4Var2 = this.f;
        xt4 xt4Var2 = this.D;
        xt4 xt4Var3 = this.F;
        switch (i) {
            case 0:
                long j = this.b;
                hre.r(obj);
                if (f > nae.e) {
                    if (z) {
                        intBitsToFloat = f - Float.intBitsToFloat((int) (j & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                    }
                    float f2 = intBitsToFloat / f;
                    if (z) {
                        floatValue = (1.0f - ((Number) vt4Var.invoke()).floatValue()) - ((Number) vt4Var2.invoke()).floatValue();
                    } else {
                        floatValue = ((Number) vt4Var.invoke()).floatValue();
                    }
                    float floatValue3 = ((Number) vt4Var2.invoke()).floatValue();
                    int ordinal = h3aVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                xk5.o();
                                return null;
                            }
                        } else if (floatValue <= f2 && f2 <= floatValue3 + floatValue) {
                            xt4Var2.invoke(new Float(floatValue));
                            xt4Var3.invoke(Boolean.TRUE);
                        }
                    } else {
                        if (floatValue <= f2 && f2 <= floatValue3 + floatValue) {
                            xt4Var2.invoke(new Float(floatValue));
                        } else {
                            xt4Var.invoke(new Float(f2));
                        }
                        xt4Var3.invoke(Boolean.TRUE);
                    }
                }
                return pvcVar;
            default:
                long j2 = this.b;
                hre.r(obj);
                if (f > nae.e) {
                    if (z) {
                        intBitsToFloat2 = f - Float.intBitsToFloat((int) (j2 & 4294967295L));
                    } else {
                        intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    }
                    float f3 = intBitsToFloat2 / f;
                    if (z) {
                        floatValue2 = (1.0f - ((Number) vt4Var.invoke()).floatValue()) - ((Number) vt4Var2.invoke()).floatValue();
                    } else {
                        floatValue2 = ((Number) vt4Var.invoke()).floatValue();
                    }
                    float floatValue4 = ((Number) vt4Var2.invoke()).floatValue();
                    int ordinal2 = h3aVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                xk5.o();
                                return null;
                            }
                        } else if (floatValue2 <= f3 && f3 <= floatValue4 + floatValue2) {
                            xt4Var2.invoke(new Float(floatValue2));
                            xt4Var3.invoke(Boolean.TRUE);
                        }
                    } else {
                        if (floatValue2 <= f3 && f3 <= floatValue4 + floatValue2) {
                            xt4Var2.invoke(new Float(floatValue2));
                        } else {
                            xt4Var.invoke(new Float(f3));
                        }
                        xt4Var3.invoke(Boolean.TRUE);
                    }
                }
                return pvcVar;
        }
    }
}
