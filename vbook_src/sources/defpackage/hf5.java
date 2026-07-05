package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hf5  reason: default package */
/* loaded from: classes3.dex */
public abstract class hf5 {
    public static final i82 a = new i82("call-context");
    public static final h40 b;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(ye5.class);
        try {
            nscVar = cm9.e(ye5.class, w76.c);
        } catch (Throwable unused) {
            nscVar = null;
        }
        b = new h40("client-config", new isc(a2, nscVar));
    }
}
