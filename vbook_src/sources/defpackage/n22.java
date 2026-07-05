package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n22  reason: default package */
/* loaded from: classes3.dex */
public final class n22 extends aab implements ou4 {
    public int a;
    public /* synthetic */ gh5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ hj1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n22(hj1 hj1Var, m42 m42Var, List list, Set set) {
        super(5, m42Var);
        this.d = list;
        this.e = set;
        this.f = hj1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        gh5 gh5Var = this.b;
        Object obj2 = this.c;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return obj;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = null;
        this.c = null;
        this.a = 1;
        Object a = r22.a(this.d, this.e, this.f, gh5Var, obj2, this);
        n82 n82Var = n82.a;
        if (a == n82Var) {
            return n82Var;
        }
        return a;
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fkc fkcVar = (fkc) obj;
        isc iscVar = (isc) obj4;
        Set set = this.e;
        n22 n22Var = new n22(this.f, (m42) obj5, this.d, set);
        n22Var.b = (gh5) obj2;
        n22Var.c = obj3;
        return n22Var.invokeSuspend(pvc.a);
    }
}
