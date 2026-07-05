package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jgd  reason: default package */
/* loaded from: classes3.dex */
public abstract class jgd {
    public static final h40 a;
    public static final h40 b;
    public static final pw6 c;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(List.class);
        nsc nscVar2 = null;
        try {
            nscVar = cm9.e(List.class, v9e.y(cm9.e(cgd.class, w76.c)));
        } catch (Throwable unused) {
            nscVar = null;
        }
        a = new h40("Websocket extensions", new isc(a2, nscVar));
        gi1 a3 = cm9.a(igd.class);
        try {
            nscVar2 = cm9.d(igd.class);
        } catch (Throwable unused2) {
        }
        b = new h40("Websocket plugin config", new isc(a3, nscVar2));
        c = sw6.b("io.ktor.client.plugins.websocket.WebSockets");
    }
}
