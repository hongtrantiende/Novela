package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt4  reason: default package */
/* loaded from: classes3.dex */
public final class dt4 extends Exception implements c72 {
    public final long a;

    public dt4(long j, dt4 dt4Var) {
        super(dt4Var);
        this.a = j;
    }

    @Override // defpackage.c72
    public final Throwable a() {
        return new dt4(this.a, this);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        long j = this.a;
        if (j >= 0) {
            str = ": " + j;
        } else {
            str = "";
        }
        return "Frame is too big".concat(str);
    }
}
