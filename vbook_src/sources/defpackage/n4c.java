package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n4c  reason: default package */
/* loaded from: classes3.dex */
public final class n4c extends aab implements lu4 {
    public final /* synthetic */ int a = 0;
    public String b;
    public int c;
    public final /* synthetic */ y5c d;
    public final /* synthetic */ pwb e;
    public final /* synthetic */ pwb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4c(y5c y5cVar, pwb pwbVar, pwb pwbVar2, String str, m42 m42Var) {
        super(2, m42Var);
        this.d = y5cVar;
        this.e = pwbVar;
        this.f = pwbVar2;
        this.b = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new n4c(this.d, this.e, this.f, this.b, m42Var);
            default:
                return new n4c(this.d, this.e, this.f, m42Var);
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
                return ((n4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((n4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String e0;
        Serializable a;
        Object value;
        int i = this.a;
        pwb pwbVar = this.f;
        pwb pwbVar2 = this.e;
        n82 n82Var = n82.a;
        y5c y5cVar = this.d;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String e02 = y5cVar.e0(pwbVar2, pwbVar);
                    if (e02 != null) {
                        cs0 cs0Var = y5cVar.Y;
                        String str = y5cVar.R;
                        int i3 = pwbVar2.a;
                        String c0 = y5cVar.c0(i3);
                        String str2 = this.b;
                        int i4 = pwbVar2.b;
                        int i5 = pwbVar.b;
                        this.c = 1;
                        ((is0) cs0Var).c(str, i3, c0, e02, "", str2, i4, i5);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    }
                }
                return pvcVar;
            default:
                int i6 = this.c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        String str3 = this.b;
                        hre.r(obj);
                        e0 = str3;
                        a = obj;
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    e0 = y5cVar.e0(pwbVar2, pwbVar);
                    if (e0 != null) {
                        qvb qvbVar = y5cVar.a0;
                        this.b = e0;
                        this.c = 1;
                        a = ((svb) qvbVar).a(this);
                        if (a == n82Var) {
                            return n82Var;
                        }
                    }
                    return pvcVar;
                }
                List list = (List) a;
                if (list.isEmpty()) {
                    y5cVar.h(y5cVar.s0, pqb.a);
                } else {
                    cza czaVar = y5cVar.J0;
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                            ((tvb) value).getClass();
                            e0.getClass();
                        } while (!czaVar.l(value, new tvb(e0, list)));
                        y5cVar.h(y5cVar.s0, new vqb(e0));
                    } else {
                        y5cVar.h(y5cVar.s0, new vqb(e0));
                    }
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4c(y5c y5cVar, pwb pwbVar, pwb pwbVar2, m42 m42Var) {
        super(2, m42Var);
        this.d = y5cVar;
        this.e = pwbVar;
        this.f = pwbVar2;
    }
}
