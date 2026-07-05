package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ue3  reason: default package */
/* loaded from: classes.dex */
public final class ue3 {
    public final tu7 a;
    public final tu7 b;

    static {
        Float valueOf = Float.valueOf((float) nae.e);
        yk8 yk8Var = new yk8(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        new ue3(yk8Var, new yk8(valueOf2, valueOf2));
    }

    public ue3(yk8... yk8VarArr) {
        this.a = new tu7(yk8VarArr.length);
        this.b = new tu7(yk8VarArr.length);
        int length = yk8VarArr.length;
        int i = 0;
        while (true) {
            tu7 tu7Var = this.a;
            if (i < length) {
                tu7Var.a(((Number) yk8VarArr[i].a).floatValue());
                this.b.a(((Number) yk8VarArr[i].b).floatValue());
                i++;
            } else {
                am8.F(tu7Var);
                am8.F(this.b);
                return;
            }
        }
    }
}
