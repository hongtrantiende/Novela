package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v2a  reason: default package */
/* loaded from: classes.dex */
public final class v2a extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ w2a c;
    public /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2a(w2a w2aVar, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = w2aVar;
        this.d = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new v2a(this.c, this.d, m42Var, 0);
            case 1:
                return new v2a(this.c, this.d, m42Var, 1);
            case 2:
                return new v2a(this.c, this.d, m42Var, 2);
            default:
                v2a v2aVar = new v2a(this.c, m42Var);
                v2aVar.d = ((y78) obj).a;
                return v2aVar;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((v2a) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((v2a) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((v2a) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                long j = ((y78) obj).a;
                v2a v2aVar = new v2a(this.c, (m42) obj2);
                v2aVar.d = j;
                return v2aVar.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        w2a w2aVar = this.c;
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
                t3a t3aVar = w2aVar.j0;
                eg1 eg1Var = new eg1(this.d, null);
                this.b = 1;
                if (t3aVar.g(jw7.b, eg1Var, this) == n82Var) {
                    return n82Var;
                }
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
                t3a t3aVar2 = w2aVar.j0;
                long j = this.d;
                this.b = 1;
                if (t3aVar2.c(j, false, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                t3a t3aVar3 = w2aVar.j0;
                long j2 = this.d;
                this.b = 1;
                if (t3aVar3.c(j2, true, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
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
                long j3 = this.d;
                t3a t3aVar4 = w2aVar.j0;
                this.b = 1;
                Object a = r2a.a(t3aVar4, j3, this);
                if (a == n82Var) {
                    return n82Var;
                }
                return a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2a(w2a w2aVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.c = w2aVar;
    }
}
