package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pq3  reason: default package */
/* loaded from: classes3.dex */
public final class pq3 extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public aw7 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq3(aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, m42 m42Var) {
        super(2, m42Var);
        this.c = aw7Var;
        this.d = aw7Var2;
        this.e = aw7Var3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.e;
        aw7 aw7Var2 = this.d;
        switch (i) {
            case 0:
                return new pq3(aw7Var2, aw7Var, m42Var);
            default:
                return new pq3(this.c, aw7Var2, aw7Var, m42Var);
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
                return ((pq3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pq3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        n82 n82Var = n82.a;
        aw7 aw7Var = this.d;
        pvc pvcVar = pvc.a;
        aw7 aw7Var2 = this.e;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        aw7Var2 = this.c;
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    sw2 sw2Var = ab3.a;
                    ru2 ru2Var = ru2.c;
                    cd2 cd2Var = new cd2(aw7Var, null, 1);
                    this.c = aw7Var2;
                    this.b = 1;
                    obj = z87.E(ru2Var, cd2Var, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                aw7Var2.setValue((List) obj);
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            hre.r(obj);
                            return pvcVar;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    sw2 sw2Var2 = ab3.a;
                    ru2 ru2Var2 = ru2.c;
                    cd2 cd2Var2 = new cd2(this.c, null, 4);
                    this.b = 1;
                    obj = z87.E(ru2Var2, cd2Var2, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    aw7Var.setValue("");
                } else {
                    sj4 A = z1d.A(yae.G(new iia(aw7Var2, 21)));
                    nr nrVar = new nr(list, aw7Var2, aw7Var);
                    this.b = 2;
                    if (A.a(nrVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq3(aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.d = aw7Var;
        this.e = aw7Var2;
    }
}
