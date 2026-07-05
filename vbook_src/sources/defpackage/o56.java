package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o56  reason: default package */
/* loaded from: classes3.dex */
public final class o56 extends a2 {
    public final t36 f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o56(r36 r36Var, t36 t36Var) {
        super(r36Var, null);
        r36Var.getClass();
        this.f = t36Var;
        this.g = t36Var.a.size();
        this.h = -1;
    }

    @Override // defpackage.a2
    public final k46 F(String str) {
        str.getClass();
        return (k46) this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.a2
    public final String R(o9a o9aVar, int i) {
        o9aVar.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.a2
    public final k46 T() {
        return this.f;
    }

    @Override // defpackage.fx1
    public final int f(o9a o9aVar) {
        o9aVar.getClass();
        int i = this.h;
        if (i < this.g - 1) {
            int i2 = i + 1;
            this.h = i2;
            return i2;
        }
        return -1;
    }
}
