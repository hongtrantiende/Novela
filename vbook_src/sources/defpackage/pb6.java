package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pb6  reason: default package */
/* loaded from: classes.dex */
public final class pb6 {
    public final xze a;
    public final dne b;
    public final wy3 c;

    public pb6(dne dneVar, wy3 wy3Var) {
        String str;
        xze xzeVar;
        this.b = dneVar;
        this.c = wy3Var;
        if (true != dneVar.g) {
            str = "play-services-mlkit-language-id";
        } else {
            str = "language-id";
        }
        synchronized (q0f.class) {
            gze gzeVar = new gze(str);
            synchronized (q0f.class) {
                if (q0f.a == null) {
                    q0f.a = new o0f(0);
                }
                xzeVar = (xze) q0f.a.u(gzeVar);
            }
            this.a = xzeVar;
        }
        this.a = xzeVar;
    }
}
