package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nnc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nnc implements rw4 {
    public static final nnc a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [nnc, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.word.model.TrashWordDto", obj, 2);
        n09Var.k("word", false);
        n09Var.k("regex", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        pnc pncVar = (pnc) obj;
        pncVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.J(o9aVar, 0, pncVar.a);
        k.o(o9aVar, 1, pncVar.b);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f == 1) {
                        z2 = t.z(o9aVar, 1);
                        i |= 2;
                    } else {
                        fb4.a(f);
                        return null;
                    }
                } else {
                    str = t.k(o9aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new pnc(i, str, z2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{c4b.a, ms0.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
