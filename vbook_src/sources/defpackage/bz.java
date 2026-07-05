package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bz  reason: default package */
/* loaded from: classes.dex */
public final class bz extends sue {
    public static volatile bz e;
    public static final az f = new az(0);
    public final ux2 d = new ux2();

    public static bz R() {
        if (e != null) {
            return e;
        }
        synchronized (bz.class) {
            try {
                if (e == null) {
                    e = new bz();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }
}
