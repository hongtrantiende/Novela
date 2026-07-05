package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wbd  reason: default package */
/* loaded from: classes3.dex */
public final class wbd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ j9d c;
    public final /* synthetic */ gcd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbd(gcd gcdVar, j9d j9dVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 5;
        this.d = gcdVar;
        this.c = j9dVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        j9d j9dVar = this.c;
        gcd gcdVar = this.d;
        switch (i) {
            case 0:
                return new wbd(j9dVar, gcdVar, m42Var, 0);
            case 1:
                return new wbd(j9dVar, gcdVar, m42Var, 1);
            case 2:
                return new wbd(j9dVar, gcdVar, m42Var, 2);
            case 3:
                return new wbd(j9dVar, gcdVar, m42Var, 3);
            case 4:
                return new wbd(j9dVar, gcdVar, m42Var, 4);
            default:
                return new wbd(gcdVar, j9dVar, m42Var);
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
                return ((wbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                ((wbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 2:
                return ((wbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                ((wbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 4:
                return ((wbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((wbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        j9d j9dVar = this.c;
        gcd gcdVar = this.d;
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
                sj4 p = j9dVar.p();
                vbd vbdVar = new vbd(gcdVar, 0);
                this.b = 1;
                if (p.a(vbdVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cza r = j9dVar.r();
                vbd vbdVar2 = new vbd(gcdVar, 1);
                this.b = 1;
                r.a(vbdVar2, this);
                return n82Var;
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
                sj4 g = j9dVar.g();
                vbd vbdVar3 = new vbd(gcdVar, 2);
                this.b = 1;
                if (g.a(vbdVar3, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
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
                    aza h = j9dVar.h();
                    vbd vbdVar4 = new vbd(gcdVar, 3);
                    this.b = 1;
                    if (h.a(vbdVar4, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                sj4 o = j9dVar.o();
                vbd vbdVar5 = new vbd(gcdVar, 4);
                this.b = 1;
                if (o.a(vbdVar5, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                pga pgaVar = gcdVar.s;
                r58 r58Var = new r58(j9dVar, 19);
                this.b = 1;
                pgaVar.a(r58Var, this);
                return n82Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wbd(j9d j9dVar, gcd gcdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = j9dVar;
        this.d = gcdVar;
    }
}
