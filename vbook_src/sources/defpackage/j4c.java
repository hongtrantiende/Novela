package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j4c  reason: default package */
/* loaded from: classes3.dex */
public final class j4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5c b;
    public final /* synthetic */ pwb c;
    public final /* synthetic */ pwb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4c(y5c y5cVar, pwb pwbVar, pwb pwbVar2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = y5cVar;
        this.c = pwbVar;
        this.d = pwbVar2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new j4c(this.b, this.c, this.d, m42Var, 0);
            case 1:
                return new j4c(this.b, this.c, this.d, m42Var, 1);
            case 2:
                return new j4c(this.b, this.c, this.d, m42Var, 2);
            case 3:
                return new j4c(this.b, this.c, this.d, m42Var, 3);
            default:
                return new j4c(this.b, this.c, this.d, m42Var, 4);
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
                ((j4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((j4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((j4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((j4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((j4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        String str2;
        String str3;
        String str4;
        int i = this.a;
        String str5 = "";
        String str6 = null;
        pwb pwbVar = this.d;
        pwb pwbVar2 = this.c;
        y5c y5cVar = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hre.r(obj);
                String e0 = y5cVar.e0(pwbVar2, pwbVar);
                if (e0 != null) {
                    Iterator it = ((ymb) y5cVar.D0.getValue()).a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            pmb pmbVar = (pmb) obj2;
                            if (pmbVar.e != 1 || pmbVar.c != pwbVar2.a || !cwe.o(pmbVar, pwbVar2.b, pwbVar.b)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    pmb pmbVar2 = (pmb) obj2;
                    s02 s02Var = y5cVar.s0;
                    if (pmbVar2 != null) {
                        str = pmbVar2.a;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    int i2 = pwbVar2.a;
                    int i3 = pwbVar2.b;
                    int i4 = pwbVar.b;
                    if (pmbVar2 != null) {
                        str6 = pmbVar2.h;
                    }
                    if (str6 == null) {
                        str2 = "";
                    } else {
                        str2 = str6;
                    }
                    if (pmbVar2 == null || (str4 = pmbVar2.g) == null) {
                        str3 = "";
                    } else {
                        str3 = str4;
                    }
                    y5cVar.h(s02Var, new xqb(str, i2, i3, i4, e0, str2, str3));
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                String e02 = y5cVar.e0(pwbVar2, pwbVar);
                if (e02 != null) {
                    y5cVar.h(y5cVar.s0, new rqb(e02));
                }
                return pvcVar;
            case 2:
                hre.r(obj);
                boolean v = y5cVar.v();
                s02 s02Var2 = y5cVar.s0;
                if (v && y5cVar.u()) {
                    tmc tmcVar = ((amc) y5cVar.d.getValue()).f;
                    if (tmcVar != null) {
                        str6 = tmcVar.b;
                    }
                    if (str6 != null) {
                        str5 = str6;
                    }
                    y5cVar.h(s02Var2, new nqb(str5));
                } else {
                    String e03 = y5cVar.e0(pwbVar2, pwbVar);
                    if (e03 != null) {
                        y5cVar.h(s02Var2, new uqb(e03));
                    }
                }
                return pvcVar;
            case 3:
                hre.r(obj);
                String e04 = y5cVar.e0(pwbVar2, pwbVar);
                if (e04 != null) {
                    hk1 a = jdd.a(y5cVar);
                    sw2 sw2Var = ab3.a;
                    y5cVar.f(a, ru2.c, new c5c(null, y5cVar, e04));
                }
                return pvcVar;
            default:
                hre.r(obj);
                String e05 = y5cVar.e0(pwbVar2, pwbVar);
                if (e05 != null) {
                    y5cVar.h(y5cVar.s0, new brb(e05));
                }
                return pvcVar;
        }
    }
}
