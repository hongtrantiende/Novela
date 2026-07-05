package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q6a  reason: default package */
/* loaded from: classes.dex */
public final class q6a implements bn9 {
    public final nq7 C;
    public final long a;
    public final n7a b;
    public final long c;
    public ij1 d;
    public cu7 e;
    public final zu0 f;

    public q6a(long j, n7a n7aVar, long j2) {
        ij1 ij1Var = ij1.I;
        this.a = j;
        this.b = n7aVar;
        this.c = j2;
        this.d = ij1Var;
        zu0 zu0Var = new zu0();
        this.f = zu0Var;
        nq7 k = w9e.k(new i7a(n7aVar, j, new p6a(this, 3)), zu0Var);
        w09.a.getClass();
        this.C = yf2.v(k, xpe.d);
    }

    @Override // defpackage.bn9
    public final void a() {
        cu7 cu7Var = this.e;
        if (cu7Var != null) {
            this.b.f(cu7Var);
            this.e = null;
        }
    }

    @Override // defpackage.bn9
    public final void b() {
        cu7 cu7Var = this.e;
        if (cu7Var != null) {
            this.b.f(cu7Var);
            this.e = null;
        }
    }

    @Override // defpackage.bn9
    public final void c() {
        p6a p6aVar = new p6a(this, 0);
        p6a p6aVar2 = new p6a(this, 1);
        p6a p6aVar3 = new p6a(this, 2);
        zu0 zu0Var = this.f;
        long j = this.a;
        cu7 cu7Var = new cu7(j, p6aVar, p6aVar2, p6aVar3, zu0Var);
        n7a n7aVar = this.b;
        cv7 cv7Var = n7aVar.c;
        if (j == 0) {
            ov5.a("The selectable contains an invalid id: " + j);
        }
        if (cv7Var.b(j)) {
            ov5.a("Another selectable with the id: " + j + " has already subscribed.");
        }
        cv7Var.i(cu7Var, j);
        n7aVar.b.add(cu7Var);
        n7aVar.a = false;
        this.e = cu7Var;
    }

    public final void d(fvb fvbVar) {
        m6a m6aVar;
        fvb fvbVar2 = (fvb) this.d.c;
        if (fvbVar2 != null && !c16.i(fvbVar2.a.a, fvbVar.a.a) && (m6aVar = this.b.i) != null) {
            m6aVar.invoke(Long.valueOf(this.a));
        }
        this.d = ij1.r(this.d, null, fvbVar, null, 5);
    }
}
