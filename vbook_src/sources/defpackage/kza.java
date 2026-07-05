package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kza  reason: default package */
/* loaded from: classes.dex */
public abstract class kza {
    public long a;
    public kza b;

    public kza(long j) {
        this.a = j;
    }

    public abstract void a(kza kzaVar);

    public abstract kza b();

    public kza c(long j) {
        kza b = b();
        b.a = j;
        return b;
    }
}
