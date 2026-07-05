package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i1  reason: default package */
/* loaded from: classes.dex */
public final class i1 {
    public static final i1 c;
    public static final i1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (x1.d) {
            d = null;
            c = null;
            return;
        }
        d = new i1(null, false);
        c = new i1(null, true);
    }

    public i1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
