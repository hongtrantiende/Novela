package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co0  reason: default package */
/* loaded from: classes3.dex */
public abstract class co0 {
    public static final h40 a;
    public static final h40 b;
    public static final ij1 c;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(s79.class);
        nsc nscVar2 = null;
        try {
            nscVar = cm9.d(s79.class);
        } catch (Throwable unused) {
            nscVar = null;
        }
        a = new h40("UploadProgressListenerAttributeKey", new isc(a2, nscVar));
        gi1 a3 = cm9.a(s79.class);
        try {
            nscVar2 = cm9.d(s79.class);
        } catch (Throwable unused2) {
        }
        b = new h40("DownloadProgressListenerAttributeKey", new isc(a3, nscVar2));
        c = new ij1("BodyProgress", new cd1(15), new nj0(2));
    }
}
