package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bx6  reason: default package */
/* loaded from: classes3.dex */
public final class bx6 extends aab implements mu4 {
    public final /* synthetic */ ew6 C;
    public final /* synthetic */ nw6 D;
    public Throwable a;
    public xe5 b;
    public int c;
    public /* synthetic */ dk9 d;
    public /* synthetic */ te5 e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx6(boolean z, ew6 ew6Var, nw6 nw6Var, m42 m42Var) {
        super(3, m42Var);
        this.f = z;
        this.C = ew6Var;
        this.D = nw6Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ew6 ew6Var = this.C;
        nw6 nw6Var = this.D;
        bx6 bx6Var = new bx6(this.f, ew6Var, nw6Var, (m42) obj3);
        bx6Var.d = (dk9) obj;
        bx6Var.e = (te5) obj2;
        return bx6Var.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        xe5 xe5Var;
        dk9 dk9Var = this.d;
        te5 te5Var = this.e;
        int i = this.c;
        ew6 ew6Var = this.C;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        try {
        } catch (Throwable th) {
            th = th;
            StringBuilder sb = new StringBuilder();
            xe5 xe5Var2 = (xe5) te5Var.getAttributes().e(hx6.a);
            if (xe5Var2 == null) {
                xe5Var2 = new xe5(this.D);
                xe5Var2.a();
            }
            hx6.h(ew6Var, sb, te5Var.c(), th);
            String sb2 = sb.toString();
            this.d = null;
            this.e = null;
            this.a = th;
            this.b = xe5Var2;
            this.c = 2;
            if (xe5Var2.e(sb2, this) != n82Var) {
                xe5Var = xe5Var2;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = this.a;
                    hre.r(obj);
                    throw th2;
                }
                xe5Var = this.b;
                Throwable th3 = this.a;
                hre.r(obj);
                th = th3;
                this.d = null;
                this.e = null;
                this.a = th;
                this.b = null;
                this.c = 3;
                if (xe5Var.b(this) != n82Var) {
                    throw th;
                }
                return n82Var;
            }
            hre.r(obj);
        } else {
            hre.r(obj);
            if (!this.f && ew6Var != ew6.NONE && !te5Var.getAttributes().b(hx6.b)) {
                this.d = null;
                this.e = te5Var;
                this.c = 1;
                obj = dk9Var.a.c(this);
                if (obj == n82Var) {
                    return n82Var;
                }
            } else {
                return pvcVar;
            }
        }
        qh5 qh5Var = (qh5) obj;
        return pvcVar;
    }
}
