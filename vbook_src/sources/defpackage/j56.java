package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j56  reason: default package */
/* loaded from: classes3.dex */
public final class j56 extends a2 {
    public final k46 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j56(r36 r36Var, k46 k46Var, String str) {
        super(r36Var, str);
        r36Var.getClass();
        k46Var.getClass();
        this.f = k46Var;
        this.a.add("primitive");
    }

    @Override // defpackage.a2
    public final k46 F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        vs.m("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.a2
    public final k46 T() {
        return this.f;
    }

    @Override // defpackage.fx1
    public final int f(o9a o9aVar) {
        o9aVar.getClass();
        return 0;
    }
}
