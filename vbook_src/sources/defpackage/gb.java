package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb implements rw4 {
    public static final gb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, gb, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.reader.text.core.tts.engine.ai.repository.impl.dto.AiTtsRemoteModelDto", obj, 12);
        n09Var.k("id", false);
        n09Var.k("name", false);
        n09Var.k("language", false);
        n09Var.k("size_bytes", false);
        n09Var.k("description", true);
        n09Var.k("download_url", false);
        n09Var.k("checksum", true);
        n09Var.k("sample_rate", true);
        n09Var.k("num_speakers", true);
        n09Var.k("gender", true);
        n09Var.k("model_type", true);
        n09Var.k("model_format", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ib ibVar = (ib) obj;
        ibVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        String str = ibVar.a;
        String str2 = ibVar.l;
        String str3 = ibVar.k;
        String str4 = ibVar.j;
        int i = ibVar.i;
        int i2 = ibVar.h;
        String str5 = ibVar.g;
        String str6 = ibVar.e;
        k.J(o9aVar, 0, str);
        k.J(o9aVar, 1, ibVar.b);
        k.J(o9aVar, 2, ibVar.c);
        k.B(o9aVar, 3, ibVar.d);
        if (k.V(o9aVar) || !c16.i(str6, "")) {
            k.J(o9aVar, 4, str6);
        }
        k.J(o9aVar, 5, ibVar.f);
        if (k.V(o9aVar) || str5 != null) {
            k.E(o9aVar, 6, c4b.a, str5);
        }
        if (k.V(o9aVar) || i2 != 22050) {
            k.z(7, i2, o9aVar);
        }
        if (k.V(o9aVar) || i != 1) {
            k.z(8, i, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str4, "")) {
            k.J(o9aVar, 9, str4);
        }
        if (k.V(o9aVar) || !c16.i(str3, "vits")) {
            k.J(o9aVar, 10, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "onnx")) {
            k.J(o9aVar, 11, str2);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        Object obj = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        boolean z = true;
        String str9 = null;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = t.k(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = t.k(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = t.k(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    j = t.D(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = t.k(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = t.k(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    str9 = (String) t.x(o9aVar, 6, c4b.a, str9);
                    i |= 64;
                    break;
                case 7:
                    i2 = t.r(o9aVar, 7);
                    i |= Token.CASE;
                    continue;
                case 8:
                    i3 = t.r(o9aVar, 8);
                    i |= 256;
                    continue;
                case 9:
                    str6 = t.k(o9aVar, 9);
                    i |= 512;
                    continue;
                case 10:
                    str7 = t.k(o9aVar, 10);
                    i |= 1024;
                    continue;
                case 11:
                    str8 = t.k(o9aVar, 11);
                    i |= 2048;
                    continue;
                default:
                    fb4.a(f);
                    return obj;
            }
            obj = null;
        }
        t.n(o9aVar);
        return new ib(i, str, str2, str3, j, str4, str5, str9, i2, i3, str6, str7, str8);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        s76 H = wq9.H(c4bVar);
        xy5 xy5Var = xy5.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, ky6.a, c4bVar, c4bVar, H, xy5Var, xy5Var, c4bVar, c4bVar, c4bVar};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
