package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jw1  reason: default package */
/* loaded from: classes.dex */
public final class jw1 extends aab implements lu4 {
    public boolean a;
    public int b;
    public /* synthetic */ float c;
    public final /* synthetic */ kw1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw1(kw1 kw1Var, m42 m42Var) {
        super(2, m42Var);
        this.d = kw1Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        jw1 jw1Var = new jw1(this.d, m42Var);
        jw1Var.c = ((Number) obj).floatValue();
        return jw1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((jw1) create(Float.valueOf(((Number) obj).floatValue()), (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        float intBitsToFloat;
        int i = this.b;
        lu4 lu4Var = null;
        if (i != 0) {
            if (i == 1) {
                z = this.a;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            float f = this.c;
            kw1 kw1Var = this.d;
            u7a u7aVar = kw1Var.a.d;
            Object g = u7aVar.a.g(s7a.e);
            if (g != null) {
                lu4Var = g;
            }
            lu4 lu4Var2 = lu4Var;
            if (lu4Var2 != null) {
                boolean z2 = ((s1a) kw1Var.a.d.b(h8a.w)).c;
                if (z2) {
                    f = -f;
                }
                y78 y78Var = new y78((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                this.a = z2;
                this.b = 1;
                obj = lu4Var2.invoke(y78Var, this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
                z = z2;
            } else {
                throw a82.f("Required value was null.");
            }
        }
        long j = ((y78) obj).a;
        if (z) {
            intBitsToFloat = -Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return new Float(intBitsToFloat);
    }
}
