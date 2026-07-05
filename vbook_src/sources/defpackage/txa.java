package defpackage;

import java.util.ArrayList;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: txa  reason: default package */
/* loaded from: classes3.dex */
public final class txa extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ uxa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ txa(uxa uxaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = uxaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        uxa uxaVar = this.c;
        switch (i) {
            case 0:
                return new txa(uxaVar, m42Var, 0);
            default:
                return new txa(uxaVar, m42Var, 1);
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
                return ((txa) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((txa) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        am3 am3Var = am3.MILLISECONDS;
        n82 n82Var = n82.a;
        uxa uxaVar = this.c;
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
                    hq7 hq7Var = wl3.b;
                    long O = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O, this) == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar = uxaVar.d;
                Boolean bool = Boolean.TRUE;
                czaVar.getClass();
                czaVar.n(null, bool);
                return pvcVar;
            default:
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
                    hq7 hq7Var2 = wl3.b;
                    long O2 = jue.O(Context.VERSION_ES6, am3Var);
                    this.b = 1;
                    if (ade.r(O2, this) == n82Var) {
                        return n82Var;
                    }
                }
                ArrayList E0 = sl1.E0(uxaVar.a());
                xl1.S(E0);
                uxaVar.c.setValue(E0);
                cza czaVar2 = uxaVar.d;
                Boolean bool2 = Boolean.TRUE;
                czaVar2.getClass();
                czaVar2.n(null, bool2);
                return pvcVar;
        }
    }
}
