package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: le5  reason: default package */
/* loaded from: classes3.dex */
public final class le5 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public Throwable b;
    public int c;
    public /* synthetic */ fh5 d;
    public /* synthetic */ Throwable e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le5(List list, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        List list = this.f;
        fh5 fh5Var = (fh5) obj;
        Throwable th = (Throwable) obj2;
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                le5 le5Var = new le5(list, m42Var, 0);
                le5Var.d = fh5Var;
                le5Var.e = th;
                return le5Var.invokeSuspend(pvcVar);
            default:
                le5 le5Var2 = new le5(list, m42Var, 1);
                le5Var2.d = fh5Var;
                le5Var2.e = th;
                return le5Var2.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        List list = this.f;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                fh5 fh5Var = this.d;
                Throwable th = this.e;
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        Throwable th2 = this.b;
                        hre.r(obj);
                        return th2;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                Throwable s = lye.s(th);
                this.d = null;
                this.e = null;
                this.b = s;
                this.c = 1;
                pe5.a(list, s, fh5Var, this);
                if (pvcVar != n82Var) {
                    return s;
                }
                return n82Var;
            default:
                fh5 fh5Var2 = this.d;
                Throwable th3 = this.e;
                int i3 = this.c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        Throwable th4 = this.b;
                        hre.r(obj);
                        return th4;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                Throwable s2 = lye.s(th3);
                this.d = null;
                this.e = null;
                this.b = s2;
                this.c = 1;
                pe5.a(list, s2, fh5Var2, this);
                if (pvcVar != n82Var) {
                    return s2;
                }
                return n82Var;
        }
    }
}
