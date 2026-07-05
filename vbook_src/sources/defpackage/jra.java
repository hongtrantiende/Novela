package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jra  reason: default package */
/* loaded from: classes.dex */
public final class jra extends kza {
    public Object c;

    public jra(Object obj, long j) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.kza
    public final void a(kza kzaVar) {
        kzaVar.getClass();
        this.c = ((jra) kzaVar).c;
    }

    @Override // defpackage.kza
    public final kza b() {
        return new jra(this.c, dra.j().g());
    }

    @Override // defpackage.kza
    public final kza c(long j) {
        return new jra(this.c, dra.j().g());
    }
}
