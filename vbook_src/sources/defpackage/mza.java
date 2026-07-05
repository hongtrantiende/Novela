package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mza  reason: default package */
/* loaded from: classes.dex */
public final class mza extends kza {
    public gu8 c;
    public int d;

    public mza(long j, gu8 gu8Var) {
        super(j);
        this.c = gu8Var;
    }

    @Override // defpackage.kza
    public final void a(kza kzaVar) {
        synchronized (xve.i) {
            kzaVar.getClass();
            this.c = ((mza) kzaVar).c;
            this.d = ((mza) kzaVar).d;
        }
    }

    @Override // defpackage.kza
    public final kza b() {
        return new mza(dra.j().g(), this.c);
    }

    @Override // defpackage.kza
    public final kza c(long j) {
        return new mza(j, this.c);
    }
}
