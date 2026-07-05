package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k07  reason: default package */
/* loaded from: classes.dex */
public final class k07 implements ja7 {
    public ja7[] a;

    @Override // defpackage.ja7
    public final ch9 a(Class cls) {
        ja7[] ja7VarArr;
        for (ja7 ja7Var : this.a) {
            if (ja7Var.b(cls)) {
                return ja7Var.a(cls);
            }
        }
        xk5.q("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.ja7
    public final boolean b(Class cls) {
        for (ja7 ja7Var : this.a) {
            if (ja7Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
