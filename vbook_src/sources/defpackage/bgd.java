package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bgd  reason: default package */
/* loaded from: classes3.dex */
public final class bgd extends of8 {
    public final r45 a;

    /* JADX WARN: Type inference failed for: r1v3, types: [ly0, java.lang.Object, psa] */
    /* JADX WARN: Type inference failed for: r1v6, types: [o45, c3e] */
    public bgd() {
        String str;
        new mfb(new cd1(5));
        StringBuilder sb = new StringBuilder();
        int i = od2.a;
        ?? obj = new Object();
        while (((int) obj.c) < 16) {
            String str2 = (String) jb1.a(b48.g.d());
            if (str2 != null && str2.length() >= 32) {
                str = str2.substring(0, 32);
            } else {
                b48.h.start();
                str = (String) z87.C(gs3.a, new mv0(1, null, str2));
            }
            fre.x(obj, str);
        }
        sb.append(ah0.b(ah0.f, pbe.m(obj, 16)));
        String sb2 = sb.toString();
        ?? c3eVar = new c3e(8);
        c3eVar.h("Upgrade", "websocket");
        c3eVar.h("Connection", "Upgrade");
        c3eVar.h("Sec-WebSocket-Key", sb2);
        c3eVar.h("Sec-WebSocket-Version", "13");
        this.a = c3eVar.Y();
    }

    @Override // defpackage.rf8
    public final n45 c() {
        return this.a;
    }

    public final String toString() {
        return "WebSocketContent";
    }
}
