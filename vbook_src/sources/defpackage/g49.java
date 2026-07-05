package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g49  reason: default package */
/* loaded from: classes3.dex */
public final class g49 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ h49 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g49(h49 h49Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = h49Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        h49 h49Var = this.c;
        switch (i) {
            case 0:
                return new g49(h49Var, m42Var, 0);
            default:
                return new g49(h49Var, m42Var, 1);
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
                return ((g49) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((g49) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        h49 h49Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                    sj4 data = h49Var.a.getData();
                    this.b = 1;
                    obj = z1d.C(data, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                Map a = ((pv7) obj).a();
                LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(a.size()));
                for (Map.Entry entry : a.entrySet()) {
                    linkedHashMap.put(((e49) entry.getKey()).a, entry.getValue());
                }
                return linkedHashMap;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                ng2 ng2Var = h49Var.a;
                bo0 bo0Var = new bo0(2, 8, null);
                this.b = 1;
                Object o = y9e.o(ng2Var, bo0Var, this);
                if (o == n82Var) {
                    return n82Var;
                }
                return o;
        }
    }
}
