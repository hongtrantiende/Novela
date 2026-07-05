package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l07  reason: default package */
/* loaded from: classes.dex */
public final class l07 implements ka7 {
    public ka7[] a;

    @Override // defpackage.ka7
    public final dh9 a(Class cls) {
        ka7[] ka7VarArr;
        for (ka7 ka7Var : this.a) {
            if (ka7Var.b(cls)) {
                return ka7Var.a(cls);
            }
        }
        xk5.q("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.ka7
    public final boolean b(Class cls) {
        for (ka7 ka7Var : this.a) {
            if (ka7Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
