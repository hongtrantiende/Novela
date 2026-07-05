package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m07  reason: default package */
/* loaded from: classes.dex */
public final class m07 implements la7 {
    public la7[] a;

    @Override // defpackage.la7
    public final eh9 a(Class cls) {
        la7[] la7VarArr;
        for (la7 la7Var : this.a) {
            if (la7Var.b(cls)) {
                return la7Var.a(cls);
            }
        }
        xk5.q("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.la7
    public final boolean b(Class cls) {
        for (la7 la7Var : this.a) {
            if (la7Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
