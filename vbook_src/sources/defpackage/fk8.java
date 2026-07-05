package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fk8  reason: default package */
/* loaded from: classes3.dex */
public final class fk8 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;
    public final /* synthetic */ aw7 c;

    public fk8(int i, aw7 aw7Var, yya yyaVar) {
        this.a = i;
        this.b = yyaVar;
        this.c = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        if (this.a == ((Number) this.b.getValue()).intValue()) {
            this.c.setValue(bool);
        }
        return pvc.a;
    }
}
