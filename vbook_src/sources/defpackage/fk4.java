package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fk4  reason: default package */
/* loaded from: classes3.dex */
public final class fk4 extends aab implements mu4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ sj4 D;
    public ta1 a;
    public zl9 b;
    public ta1 c;
    public int d;
    public /* synthetic */ m82 e;
    public /* synthetic */ tj4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk4(long j, sj4 sj4Var, m42 m42Var) {
        super(3, m42Var);
        this.C = j;
        this.D = sj4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        fk4 fk4Var = new fk4(this.C, this.D, (m42) obj3);
        fk4Var.e = (m82) obj;
        fk4Var.f = (tj4) obj2;
        return fk4Var.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        ta1 k;
        ta1 ta1Var;
        zl9 zl9Var;
        Object e;
        m82 m82Var = this.e;
        tj4 tj4Var = this.f;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                k = this.c;
                zl9 zl9Var2 = this.b;
                ta1Var = this.a;
                hre.r(obj);
                zl9Var = zl9Var2;
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            y69 k2 = pae.k(m82Var, -1, new ck4(this.D, null, 1), 1);
            Object obj2 = new Object();
            k = pae.k(m82Var, 0, new ip(this.C, null), 1);
            ta1Var = k2;
            zl9Var = obj2;
        }
        while (zl9Var.a != p68.c) {
            w5a w5aVar = new w5a(getContext());
            w5aVar.g(ta1Var.c(), new ol(zl9Var, k, (m42) null, 11));
            w5aVar.g(k.b(), new d53(zl9Var, tj4Var, (m42) null, 21));
            this.e = null;
            this.f = tj4Var;
            this.a = ta1Var;
            this.b = zl9Var;
            this.c = k;
            this.d = 1;
            if (w5aVar.h()) {
                e = w5aVar.d(this);
            } else {
                e = w5aVar.e(this);
            }
            n82 n82Var = n82.a;
            if (e == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
