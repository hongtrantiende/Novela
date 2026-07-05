package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sy1  reason: default package */
/* loaded from: classes3.dex */
public abstract class sy1 {
    public static final lie a = new lie(5, "CLOSED", false);

    public static final Object a(f5a f5aVar, long j, lu4 lu4Var) {
        while (true) {
            if (f5aVar.e >= j && !f5aVar.g()) {
                return f5aVar;
            }
            Object e = f5aVar.e();
            lie lieVar = a;
            if (e == lieVar) {
                return lieVar;
            }
            f5a f5aVar2 = (f5a) ((ty1) e);
            if (f5aVar2 == null) {
                f5aVar2 = (f5a) lu4Var.invoke(Long.valueOf(f5aVar.e + 1), f5aVar);
                if (f5aVar.j(f5aVar2)) {
                    if (f5aVar.g()) {
                        f5aVar.i();
                    }
                }
            }
            f5aVar = f5aVar2;
        }
    }
}
