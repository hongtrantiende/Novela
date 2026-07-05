package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d63  reason: default package */
/* loaded from: classes3.dex */
public final class d63 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ q63 c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d63(q63 q63Var, List list, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = q63Var;
        this.d = list;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        List list = this.d;
        q63 q63Var = this.c;
        switch (i) {
            case 0:
                return new d63(q63Var, list, m42Var, 0);
            case 1:
                return new d63(q63Var, list, m42Var, 1);
            case 2:
                return new d63(q63Var, list, m42Var, 2);
            default:
                return new d63(q63Var, list, m42Var, 3);
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
                return ((d63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((d63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((d63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((d63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        q63 q63Var = this.c;
        List list = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                xnc a = q63.a(q63Var, list);
                if (a == n82Var) {
                    return n82Var;
                }
                return a;
            case 1:
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
                this.b = 1;
                xnc a2 = q63.a(q63Var, list);
                if (a2 == n82Var) {
                    return n82Var;
                }
                return a2;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                xnc k = q63.k(list);
                if (k == n82Var) {
                    return n82Var;
                }
                return k;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                xnc k2 = q63.k(list);
                if (k2 == n82Var) {
                    return n82Var;
                }
                return k2;
        }
    }
}
