package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i7a  reason: default package */
/* loaded from: classes.dex */
public final class i7a extends uq7 {
    public final n7a b;
    public final long c;
    public final p6a d;

    public i7a(n7a n7aVar, long j, p6a p6aVar) {
        this.b = n7aVar;
        this.c = j;
        this.d = p6aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m03, mq7, k7a, java.lang.Object] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? m03Var = new m03();
        m03Var.M = this.b;
        m03Var.N = this.c;
        m03Var.O = this.d;
        hab a = dab.a(new vi(m03Var, 9));
        m03Var.H1(a);
        m03Var.P = a;
        n7a n7aVar = m03Var.M;
        m03Var.Q = new l7a(new j7a(m03Var, 2), new j7a(m03Var, 3), n7aVar);
        m03Var.R = new ep3(new j7a(m03Var, 0), new j7a(m03Var, 1), n7aVar);
        return m03Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(Long.valueOf(this.c), "selectableId");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        k7a k7aVar = (k7a) mq7Var;
        n7a n7aVar = k7aVar.M;
        n7a n7aVar2 = this.b;
        if (n7aVar2 != n7aVar) {
            z = false;
        } else {
            z = true;
        }
        k7aVar.M = n7aVar2;
        k7aVar.N = this.c;
        k7aVar.O = this.d;
        if (!z) {
            k7aVar.Q = new l7a(new j7a(k7aVar, 2), new j7a(k7aVar, 3), n7aVar2);
            k7aVar.R = new ep3(new j7a(k7aVar, 0), new j7a(k7aVar, 1), n7aVar2);
        }
        k7aVar.P.J1();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i7a) {
                i7a i7aVar = (i7a) obj;
                if (this.b == i7aVar.b && this.c == i7aVar.c && this.d == i7aVar.d) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.d.hashCode() + ((hashCode + (Long.hashCode(this.c) * 31)) * 31);
    }
}
