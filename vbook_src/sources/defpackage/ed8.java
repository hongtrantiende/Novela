package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ed8  reason: default package */
/* loaded from: classes3.dex */
public abstract class ed8 extends Exception {
    public final String a;
    public final Throwable b;

    public ed8(String str, Throwable th) {
        super(str, th);
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a;
    }
}
