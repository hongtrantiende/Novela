package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ncc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ncc implements rw4 {
    public static final ncc a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rw4, ncc] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.gdrive.TokenResponse", obj, 3);
        n09Var.k("access_token", true);
        n09Var.k("refresh_token", true);
        n09Var.k("expires_in", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        pcc pccVar = (pcc) obj;
        pccVar.getClass();
        Long l = pccVar.c;
        String str = pccVar.b;
        String str2 = pccVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 0, c4b.a, str2);
        }
        if (k.V(o9aVar) || str != null) {
            k.E(o9aVar, 1, c4b.a, str);
        }
        if (k.V(o9aVar) || l != null) {
            k.E(o9aVar, 2, ky6.a, l);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Long l = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f == 2) {
                            l = (Long) t.x(o9aVar, 2, ky6.a, l);
                            i |= 4;
                        } else {
                            fb4.a(f);
                            return null;
                        }
                    } else {
                        str2 = (String) t.x(o9aVar, 1, c4b.a, str2);
                        i |= 2;
                    }
                } else {
                    str = (String) t.x(o9aVar, 0, c4b.a, str);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new pcc(i, str, str2, l);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(ky6.a)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
