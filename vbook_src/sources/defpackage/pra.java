package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pra  reason: default package */
/* loaded from: classes.dex */
public final class pra extends kza {
    public yt8 c;
    public int d;

    public pra(long j, yt8 yt8Var) {
        super(j);
        this.c = yt8Var;
    }

    @Override // defpackage.kza
    public final void a(kza kzaVar) {
        kzaVar.getClass();
        pra praVar = (pra) kzaVar;
        synchronized (vve.g) {
            this.c = praVar.c;
            this.d = praVar.d;
        }
    }

    @Override // defpackage.kza
    public final kza b() {
        return new pra(dra.j().g(), this.c);
    }

    @Override // defpackage.kza
    public final kza c(long j) {
        return new pra(j, this.c);
    }
}
