package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fra  reason: default package */
/* loaded from: classes.dex */
public final class fra extends kza {
    public float c;

    public fra(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.kza
    public final void a(kza kzaVar) {
        kzaVar.getClass();
        this.c = ((fra) kzaVar).c;
    }

    @Override // defpackage.kza
    public final kza b() {
        return c(dra.j().g());
    }

    @Override // defpackage.kza
    public final kza c(long j) {
        return new fra(this.c, j);
    }
}
