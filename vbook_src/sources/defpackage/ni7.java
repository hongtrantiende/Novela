package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ni7  reason: default package */
/* loaded from: classes3.dex */
public final class ni7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni7(aw7 aw7Var, List list, aw7 aw7Var2, aw7 aw7Var3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = aw7Var;
        this.d = list;
        this.e = aw7Var2;
        this.f = aw7Var3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new ni7(this.c, this.d, this.e, this.f, m42Var, 0);
            default:
                return new ni7(this.c, this.d, this.e, this.f, m42Var, 1);
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
                return ((ni7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ni7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                aw7 aw7Var = this.c;
                s02 G = yae.G(new nd7(aw7Var, 14));
                mi7 mi7Var = new mi7(this.d, this.e, aw7Var, this.f, 0);
                this.b = 1;
                if (G.a(mi7Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                aw7 aw7Var2 = this.c;
                s02 G2 = yae.G(new ao7(aw7Var2, 1));
                mi7 mi7Var2 = new mi7(this.d, this.e, aw7Var2, this.f, 1);
                this.b = 1;
                if (G2.a(mi7Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
