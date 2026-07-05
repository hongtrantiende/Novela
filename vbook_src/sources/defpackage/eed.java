package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eed  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eed implements rw4 {
    public static final eed a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eed, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.document.viewer.layout.core.saver.ViewerPositionSaver.RestoreData", obj, 2);
        n09Var.k("anchor", false);
        n09Var.k("orientation", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ged gedVar = (ged) obj;
        gedVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = ged.c;
        k.E(o9aVar, 0, ed.a, gedVar.a);
        k.F(o9aVar, 1, (s76) ye6VarArr[1].getValue(), gedVar.b);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = ged.c;
        boolean z = true;
        int i = 0;
        gd gdVar = null;
        ff8 ff8Var = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f == 1) {
                        ff8Var = (ff8) t.q(o9aVar, 1, (s76) ye6VarArr[1].getValue(), ff8Var);
                        i |= 2;
                    } else {
                        fb4.a(f);
                        return null;
                    }
                } else {
                    gdVar = (gd) t.x(o9aVar, 0, ed.a, gdVar);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new ged(i, gdVar, ff8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{wq9.H(ed.a), ged.c[1].getValue()};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
