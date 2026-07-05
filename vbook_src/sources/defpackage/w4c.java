package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w4c  reason: default package */
/* loaded from: classes3.dex */
public final class w4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ y5c c;
    public final /* synthetic */ pnb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4c(y5c y5cVar, pnb pnbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = y5cVar;
        this.d = pnbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        pnb pnbVar = this.d;
        y5c y5cVar = this.c;
        switch (i) {
            case 0:
                return new w4c(y5cVar, pnbVar, m42Var, 0);
            default:
                return new w4c(y5cVar, pnbVar, m42Var, 1);
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
                return ((w4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((w4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pnb pnbVar = this.d;
        y5c y5cVar = this.c;
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
                ps psVar = pnbVar.d;
                List list = pnbVar.e;
                this.b = 1;
                Serializable K = y5c.K(y5cVar, psVar, list, this);
                if (K == n82Var) {
                    return n82Var;
                }
                return K;
            default:
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
                ps psVar2 = pnbVar.d;
                List list2 = pnbVar.e;
                this.b = 1;
                Serializable K2 = y5c.K(y5cVar, psVar2, list2, this);
                if (K2 == n82Var) {
                    return n82Var;
                }
                return K2;
        }
    }
}
