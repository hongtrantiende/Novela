package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ci2  reason: default package */
/* loaded from: classes3.dex */
public final class ci2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci2(String str, String str2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        switch (i) {
            case 0:
                ci2 ci2Var = new ci2(str2, str, m42Var, 0);
                ci2Var.b = obj;
                return ci2Var;
            default:
                ci2 ci2Var2 = new ci2(str2, str, m42Var, 1);
                ci2Var2.b = obj;
                return ci2Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        pv7 pv7Var = (pv7) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((ci2) create(pv7Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((ci2) create(pv7Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                pv7 pv7Var = (pv7) this.b;
                e49 x = s9e.x(str2);
                pv7Var.getClass();
                pv7Var.f(x, str);
                return pvc.a;
            default:
                hre.r(obj);
                pv7 pv7Var2 = (pv7) this.b;
                pv7 g = pv7Var2.g();
                e49 e49Var = sy4.g;
                Set set = (Set) pv7Var2.c(e49Var);
                if (set == null) {
                    set = rs3.a;
                }
                g.f(e49Var, fca.w(set, str2));
                g.f(ny4.a(sy4.d, str2), str);
                return g.h();
        }
    }
}
