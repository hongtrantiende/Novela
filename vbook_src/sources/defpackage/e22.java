package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e22  reason: default package */
/* loaded from: classes3.dex */
public abstract class e22 {
    public static final pw6 a = sw6.b("io.ktor.client.plugins.compression.ContentEncoding");
    public static final ij1 b = new ij1("HttpEncoding", c22.a, new ln1(9));
    public static final h40 c;
    public static final h40 d;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(List.class);
        nsc nscVar2 = null;
        try {
            w76 w76Var = w76.c;
            nscVar = cm9.e(List.class, v9e.y(cm9.d(String.class)));
        } catch (Throwable unused) {
            nscVar = null;
        }
        c = new h40("CompressionListAttribute", new isc(a2, nscVar));
        gi1 a3 = cm9.a(List.class);
        try {
            w76 w76Var2 = w76.c;
            nscVar2 = cm9.e(List.class, v9e.y(cm9.d(String.class)));
        } catch (Throwable unused2) {
        }
        d = new h40("DecompressionListAttribute", new isc(a3, nscVar2));
    }
}
