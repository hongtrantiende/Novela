package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z95  reason: default package */
/* loaded from: classes3.dex */
public final class z95 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z95(Object obj, float f, float f2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new z95((aa5) obj2, this.c, this.d, m42Var, 0);
            case 1:
                return new z95((w2a) obj2, this.c, this.d, m42Var, 1);
            default:
                return new z95((bma) obj2, this.c, this.d, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((z95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((z95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((z95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.d;
        float f2 = this.c;
        n82 n82Var = n82.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                aa5 aa5Var = (aa5) obj2;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    aa5Var.p = f2;
                    aa5Var.q = f;
                    uf ufVar = aa5Var.h;
                    if (ufVar != null) {
                        ufVar.a = null;
                    }
                    uf ufVar2 = aa5Var.i;
                    if (ufVar2 != null) {
                        ufVar2.a = null;
                    }
                    uf ufVar3 = aa5Var.j;
                    if (ufVar3 != null) {
                        ufVar3.a = null;
                    }
                    aa5Var.h = null;
                    aa5Var.i = null;
                    aa5Var.j = null;
                    aa5Var.c = -1.0f;
                    aa5Var.d = -1.0f;
                    aa5Var.n(f2);
                    aa5Var.o(f);
                    this.b = 1;
                    if (aa5Var.a(this) == n82Var) {
                        return n82Var;
                    }
                }
                aa5Var.v = true;
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (r2a.a(((w2a) obj2).j0, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                bma bmaVar = (bma) obj2;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    bmaVar.p = f2;
                    bmaVar.q = f;
                    uf ufVar4 = bmaVar.h;
                    if (ufVar4 != null) {
                        ufVar4.a = null;
                    }
                    uf ufVar5 = bmaVar.i;
                    if (ufVar5 != null) {
                        ufVar5.a = null;
                    }
                    uf ufVar6 = bmaVar.j;
                    if (ufVar6 != null) {
                        ufVar6.a = null;
                    }
                    bmaVar.h = null;
                    bmaVar.i = null;
                    bmaVar.j = null;
                    bmaVar.c = -1.0f;
                    bmaVar.d = -1.0f;
                    this.b = 1;
                    if (bmaVar.a(this) == n82Var) {
                        return n82Var;
                    }
                }
                bmaVar.v = true;
                return pvcVar;
        }
    }
}
