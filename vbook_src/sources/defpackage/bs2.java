package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bs2  reason: default package */
/* loaded from: classes3.dex */
public final class bs2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ es2 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs2(es2 es2Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = es2Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        es2 es2Var = this.c;
        switch (i) {
            case 0:
                return new bs2(es2Var, str, m42Var, 0);
            case 1:
                return new bs2(es2Var, str, m42Var, 1);
            default:
                return new bs2(es2Var, str, m42Var, 2);
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
                return ((bs2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((bs2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((bs2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        es2 es2Var = this.c;
        String str = this.d;
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
                    hg3 j = ((bn6) es2Var.c).j(str);
                    this.b = 1;
                    obj = z1d.E(j, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                vl6 vl6Var = (vl6) obj;
                if (vl6Var != null) {
                    es2Var.h(es2Var.f, new or2(vl6Var.a));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    n64 n64Var = es2Var.d;
                    this.b = 1;
                    obj = ((c74) n64Var).c(str, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                if (((f34) obj) != null) {
                    es2Var.h(es2Var.f, new nr2(str));
                    return pvcVar;
                }
                es2Var.h(es2Var.f, new ur2(str));
                return pvcVar;
            default:
                s02 s02Var = es2Var.f;
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
                    hg3 k = ((bn6) es2Var.c).k(str);
                    this.b = 1;
                    obj = z1d.E(k, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                vl6 vl6Var2 = (vl6) obj;
                if (vl6Var2 != null) {
                    es2Var.h(s02Var, new or2(vl6Var2.a));
                    return pvcVar;
                }
                str.getClass();
                Context context = twe.e;
                context.getClass();
                es2Var.h(s02Var, new pr2(new wo(context, str)));
                return pvcVar;
        }
    }
}
