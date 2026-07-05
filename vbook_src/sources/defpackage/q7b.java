package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q7b  reason: default package */
/* loaded from: classes.dex */
public final class q7b extends aab implements lu4 {
    public final /* synthetic */ im9 C;
    public final /* synthetic */ wn5 D;
    public final /* synthetic */ long E;
    public im9 a;
    public wn5 b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ g7b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7b(g7b g7bVar, im9 im9Var, wn5 wn5Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.f = g7bVar;
        this.C = im9Var;
        this.D = wn5Var;
        this.E = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        q7b q7bVar = new q7b(this.f, this.C, this.D, this.E, m42Var);
        q7bVar.e = obj;
        return q7bVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((q7b) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        jm9 gs9Var;
        im9 im9Var;
        wn5 wn5Var;
        g7b g7bVar;
        long j;
        jm9 a;
        wn5 x0;
        int i = this.d;
        try {
            if (i != 0) {
                if (i == 1) {
                    j = this.c;
                    wn5Var = this.b;
                    im9Var = this.a;
                    g7bVar = (g7b) this.e;
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
                m82 m82Var = (m82) this.e;
                g7b g7bVar2 = this.f;
                im9Var = this.C;
                wn5Var = this.D;
                long j2 = this.E;
                zp5 zp5Var = g7bVar2.a;
                this.e = g7bVar2;
                this.a = im9Var;
                this.b = wn5Var;
                this.c = j2;
                this.d = 1;
                Object a2 = zp5Var.a(this);
                n82 n82Var = n82.a;
                if (a2 == n82Var) {
                    return n82Var;
                }
                obj = a2;
                g7bVar = g7bVar2;
                j = j2;
            }
            a = im9Var.a(g7bVar, (bq5) obj);
            try {
                x0 = a.x0();
            } catch (Exception e) {
                try {
                    eub.u(a);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                throw e;
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (wn5Var != null) {
            if (!wn5Var.equals(x0)) {
            }
            a.j();
            gs9Var = a;
            return new hs9(gs9Var);
        }
        ase.s(x0, im9Var, j);
        a.j();
        gs9Var = a;
        return new hs9(gs9Var);
    }
}
