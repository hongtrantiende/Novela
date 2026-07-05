package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fia  reason: default package */
/* loaded from: classes3.dex */
public final class fia extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gia c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fia(gia giaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = giaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        gia giaVar = this.c;
        switch (i) {
            case 0:
                return new fia(giaVar, m42Var, 0);
            default:
                return new fia(giaVar, m42Var, 1);
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
                return ((fia) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((fia) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        n82 n82Var = n82.a;
        gia giaVar = this.c;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                wl6 wl6Var = giaVar.e;
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
                    ja y = z1d.y(z1d.q(((x0d) giaVar.d).h), new mx(((bn6) wl6Var).j(giaVar.c), 4), ((bn6) wl6Var).i(), new e91(4, 4, null));
                    r58 r58Var = new r58(giaVar, 4);
                    this.b = 1;
                    if (y.a(r58Var, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                String str = giaVar.c;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            hre.r(obj);
                            pka pkaVar = pka.a;
                            str.getClass();
                            ((fm) pka.b.getValue()).getClass();
                            Context context = twe.e;
                            context.getClass();
                            qka.c(context, tl1.A(str));
                            return pvcVar;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    wl6 wl6Var2 = giaVar.e;
                    this.b = 1;
                    ((bn6) wl6Var2).e(str);
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                yf3 yf3Var = giaVar.f;
                this.b = 2;
                if (((jg3) yf3Var).c(str, this) == n82Var) {
                    return n82Var;
                }
                pka pkaVar2 = pka.a;
                str.getClass();
                ((fm) pka.b.getValue()).getClass();
                Context context2 = twe.e;
                context2.getClass();
                qka.c(context2, tl1.A(str));
                return pvcVar;
        }
    }
}
