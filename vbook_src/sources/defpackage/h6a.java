package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h6a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h6a {
    public final /* synthetic */ int a;

    public /* synthetic */ h6a(int i) {
        this.a = i;
    }

    public final g6a a(b7a b7aVar) {
        f6a d;
        f6a f6aVar;
        int i = this.a;
        boolean z = true;
        jd2 jd2Var = jd2.a;
        switch (i) {
            case 0:
                f6a a = b7aVar.k().a(b7aVar.k().c);
                f6a a2 = b7aVar.h().a(b7aVar.h().d);
                if (b7aVar.i() != jd2Var) {
                    z = false;
                }
                return new g6a(a, a2, z);
            case 1:
                f6a a3 = b7aVar.k().a(b7aVar.k().c);
                f6a a4 = b7aVar.h().a(b7aVar.h().d);
                if (b7aVar.i() != jd2Var) {
                    z = false;
                }
                return b23.h(new g6a(a3, a4, z), b7aVar);
            case 2:
                return b23.c(b7aVar, r0f.M);
            case 3:
                return b23.c(b7aVar, cne.F);
            default:
                g6a d2 = b7aVar.d();
                if (d2 == null) {
                    return b23.c(b7aVar, r0f.M);
                }
                f6a f6aVar2 = d2.b;
                f6a f6aVar3 = d2.a;
                if (b7aVar.a()) {
                    f6aVar = b23.d(b7aVar, b7aVar.k(), f6aVar3);
                    d = f6aVar2;
                    f6aVar2 = f6aVar3;
                    f6aVar3 = f6aVar;
                } else {
                    d = b23.d(b7aVar, b7aVar.h(), f6aVar2);
                    f6aVar = d;
                }
                if (!c16.i(f6aVar, f6aVar2)) {
                    if (b7aVar.i() != jd2Var && (b7aVar.i() != jd2.c || f6aVar3.b <= d.b)) {
                        z = false;
                    }
                    return b23.h(new g6a(f6aVar3, d, z), b7aVar);
                }
                return d2;
        }
    }
}
