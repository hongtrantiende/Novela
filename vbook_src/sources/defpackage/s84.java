package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s84  reason: default package */
/* loaded from: classes3.dex */
public final class s84 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ v84 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s84(v84 v84Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = v84Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        v84 v84Var = this.c;
        switch (i) {
            case 0:
                return new s84(v84Var, str, m42Var, 0);
            case 1:
                return new s84(v84Var, str, m42Var, 1);
            default:
                return new s84(v84Var, str, m42Var, 2);
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
                return ((s84) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((s84) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((s84) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = ks3.a;
        String str = this.d;
        v84 v84Var = this.c;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                b54 b54Var = v84Var.e;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            hre.r(obj);
                            return pvcVar;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    mx mxVar = new mx(((c54) b54Var).c, 4);
                    this.b = 1;
                    obj = z1d.C(mxVar, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                List list = (List) obj;
                if (str.length() != 0) {
                    if (list.contains(str)) {
                        obj2 = sl1.l0(list, str);
                    } else {
                        obj2 = sl1.o0(list, str);
                    }
                }
                this.b = 2;
                c54 c54Var = (c54) b54Var;
                dx dxVar = c54Var.a;
                q36 q36Var = r36.d;
                q36Var.getClass();
                dxVar.T.e(dx.W[46], q36Var.b(new sz(c4b.a, 0), obj2));
                cza czaVar = c54Var.c;
                czaVar.getClass();
                czaVar.n(null, obj2);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                b54 b54Var2 = v84Var.e;
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
                    mx mxVar2 = new mx(((c54) b54Var2).b, 4);
                    this.b = 1;
                    obj = z1d.C(mxVar2, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                List list2 = (List) obj;
                if (str.length() != 0) {
                    if (list2.contains(str)) {
                        obj2 = sl1.l0(list2, str);
                    } else {
                        obj2 = sl1.o0(list2, str);
                    }
                }
                this.b = 2;
                c54 c54Var2 = (c54) b54Var2;
                dx dxVar2 = c54Var2.a;
                q36 q36Var2 = r36.d;
                q36Var2.getClass();
                dxVar2.S.e(dx.W[45], q36Var2.b(new sz(c4b.a, 0), obj2));
                cza czaVar2 = c54Var2.b;
                czaVar2.getClass();
                czaVar2.n(null, obj2);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                    n64 n64Var = v84Var.c;
                    this.b = 1;
                    ((c74) n64Var).a(str);
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
