package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw2  reason: default package */
/* loaded from: classes3.dex */
public abstract class pw2 {
    public static final h40 a;
    public static final pw6 b;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(pvc.class);
        try {
            nscVar = cm9.d(pvc.class);
        } catch (Throwable unused) {
            nscVar = null;
        }
        a = new h40("ValidateMark", new isc(a2, nscVar));
        b = sw6.b("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
