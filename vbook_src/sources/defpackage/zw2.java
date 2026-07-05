package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zw2  reason: default package */
/* loaded from: classes.dex */
public final class zw2 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw2(Object obj, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.d = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.d;
        m82 m82Var = (m82) obj;
        float floatValue = ((Number) obj2).floatValue();
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                zw2 zw2Var = new zw2((qma) obj4, m42Var, 0);
                zw2Var.c = floatValue;
                return zw2Var.invokeSuspend(pvcVar);
            default:
                zw2 zw2Var2 = new zw2((crc) obj4, m42Var, 1);
                zw2Var2.c = floatValue;
                return zw2Var2.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                bgc bgcVar = ((qma) obj2).k;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                float f = this.c;
                cgc e = bgcVar.e();
                pq2 b = bgcVar.b();
                xr c = bgcVar.c();
                this.b = 1;
                if (vv.g(e, f, b, c, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                bgc bgcVar2 = ((crc) obj2).o;
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
                float f2 = this.c;
                cgc e2 = bgcVar2.e();
                pq2 b2 = bgcVar2.b();
                xr c2 = bgcVar2.c();
                this.b = 1;
                if (vv.g(e2, f2, b2, c2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
