package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v7d  reason: default package */
/* loaded from: classes3.dex */
public final class v7d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gcd c;
    public final /* synthetic */ t7d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7d(gcd gcdVar, t7d t7dVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = gcdVar;
        this.d = t7dVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        t7d t7dVar = this.d;
        gcd gcdVar = this.c;
        switch (i) {
            case 0:
                return new v7d(gcdVar, t7dVar, m42Var, 0);
            case 1:
                return new v7d(gcdVar, t7dVar, m42Var, 1);
            case 2:
                return new v7d(gcdVar, t7dVar, m42Var, 2);
            case 3:
                return new v7d(gcdVar, t7dVar, m42Var, 3);
            case 4:
                return new v7d(gcdVar, t7dVar, m42Var, 4);
            default:
                return new v7d(gcdVar, t7dVar, m42Var, 5);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((v7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 1:
                ((v7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 2:
                ((v7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 3:
                ((v7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 4:
                ((v7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            default:
                ((v7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        t7d t7dVar = this.d;
        gcd gcdVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    jj9 jj9Var = gcdVar.g;
                    u7d u7dVar = new u7d(t7dVar, 0);
                    this.b = 1;
                    if (jj9Var.a.a(u7dVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    jj9 jj9Var2 = gcdVar.h;
                    u7d u7dVar2 = new u7d(t7dVar, 1);
                    this.b = 1;
                    if (jj9Var2.a.a(u7dVar2, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    jj9 jj9Var3 = gcdVar.j;
                    u7d u7dVar3 = new u7d(t7dVar, 2);
                    this.b = 1;
                    if (jj9Var3.a.a(u7dVar3, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    jj9 jj9Var4 = gcdVar.l;
                    u7d u7dVar4 = new u7d(t7dVar, 3);
                    this.b = 1;
                    if (jj9Var4.a.a(u7dVar4, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    jj9 jj9Var5 = gcdVar.k;
                    u7d u7dVar5 = new u7d(t7dVar, 4);
                    this.b = 1;
                    if (jj9Var5.a.a(u7dVar5, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
            default:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    Object obj2 = new Object();
                    jj9 jj9Var6 = gcdVar.m;
                    ia iaVar = new ia(21, obj2, t7dVar);
                    this.b = 1;
                    if (jj9Var6.a.a(iaVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
        }
    }
}
