package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yk6  reason: default package */
/* loaded from: classes3.dex */
public final class yk6 extends aab implements mu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ xt4 D;
    public /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ h3a c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ xt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk6(float f, h3a h3aVar, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, m42 m42Var) {
        super(3, m42Var);
        this.b = f;
        this.c = h3aVar;
        this.d = vt4Var;
        this.e = vt4Var2;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.D = xt4Var3;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        m82 m82Var = (m82) obj;
        long j = ((y78) obj2).a;
        xt4 xt4Var = this.C;
        xt4 xt4Var2 = this.D;
        yk6 yk6Var = new yk6(this.b, this.c, this.d, this.e, this.f, xt4Var, xt4Var2, (m42) obj3);
        yk6Var.a = j;
        return yk6Var.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        hre.r(obj);
        float f = this.b;
        int i = (f > nae.e ? 1 : (f == nae.e ? 0 : -1));
        pvc pvcVar = pvc.a;
        if (i <= 0) {
            return pvcVar;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        int ordinal = this.c.ordinal();
        xt4 xt4Var = this.D;
        xt4 xt4Var2 = this.f;
        vt4 vt4Var = this.e;
        vt4 vt4Var2 = this.d;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    xk5.o();
                    return null;
                }
            } else {
                float floatValue = ((Number) vt4Var2.invoke()).floatValue();
                float floatValue2 = ((Number) vt4Var.invoke()).floatValue();
                if (floatValue <= intBitsToFloat && intBitsToFloat <= floatValue2 + floatValue) {
                    xt4Var2.invoke(new Float(floatValue));
                    xt4Var.invoke(Boolean.TRUE);
                }
            }
        } else {
            float floatValue3 = ((Number) vt4Var2.invoke()).floatValue();
            float floatValue4 = ((Number) vt4Var.invoke()).floatValue();
            if (floatValue3 <= intBitsToFloat && intBitsToFloat <= floatValue4 + floatValue3) {
                xt4Var2.invoke(new Float(floatValue3));
            } else {
                this.C.invoke(new Float(intBitsToFloat));
            }
            xt4Var.invoke(Boolean.TRUE);
        }
        return pvcVar;
    }
}
