package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f63  reason: default package */
/* loaded from: classes3.dex */
public final class f63 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ q63 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f63(q63 q63Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = q63Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        q63 q63Var = this.c;
        switch (i) {
            case 0:
                return new f63(q63Var, m42Var, 0);
            case 1:
                return new f63(q63Var, m42Var, 1);
            case 2:
                return new f63(q63Var, m42Var, 2);
            case 3:
                return new f63(q63Var, m42Var, 3);
            default:
                return new f63(q63Var, m42Var, 4);
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
                return ((f63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((f63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((f63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((f63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((f63) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        q63 q63Var = this.c;
        n82 n82Var = n82.a;
        String str = null;
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
                eb9 g = q63Var.a.g();
                if (g != null) {
                    str = g.a;
                }
                hn8 b = q63.b(str);
                this.b = 1;
                Serializable g2 = q63Var.g(b, this);
                if (g2 == n82Var) {
                    return n82Var;
                }
                return g2;
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
                eb9 a = q63Var.a.a();
                if (a != null) {
                    str = a.a;
                }
                hn8 b2 = q63.b(str);
                this.b = 1;
                Object h = q63Var.h(b2, this);
                if (h == n82Var) {
                    return n82Var;
                }
                return h;
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
                eb9 d = q63Var.a.d();
                if (d != null) {
                    str = d.a;
                }
                hn8 b3 = q63.b(str);
                this.b = 1;
                qe3 l = q63.l(b3);
                if (l == n82Var) {
                    return n82Var;
                }
                return l;
            case 3:
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
                eb9 h2 = q63Var.a.h();
                if (h2 != null) {
                    str = h2.a;
                }
                hn8 b4 = q63.b(str);
                this.b = 1;
                qe3 l2 = q63.l(b4);
                if (l2 == n82Var) {
                    return n82Var;
                }
                return l2;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                eb9 j = q63Var.a.j();
                if (j != null) {
                    str = j.a;
                }
                hn8 b5 = q63.b(str);
                this.b = 1;
                qe3 l3 = q63.l(b5);
                if (l3 == n82Var) {
                    return n82Var;
                }
                return l3;
        }
    }
}
