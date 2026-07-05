package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fza  reason: default package */
/* loaded from: classes.dex */
public final class fza extends kza {
    public d3 c;
    public int d;
    public int e;

    public fza(long j, d3 d3Var) {
        super(j);
        this.c = d3Var;
    }

    @Override // defpackage.kza
    public final void a(kza kzaVar) {
        synchronized (sve.n) {
            kzaVar.getClass();
            this.c = ((fza) kzaVar).c;
            this.d = ((fza) kzaVar).d;
            this.e = ((fza) kzaVar).e;
        }
    }

    @Override // defpackage.kza
    public final kza b() {
        return c(dra.j().g());
    }

    @Override // defpackage.kza
    public final kza c(long j) {
        return new fza(j, this.c);
    }
}
