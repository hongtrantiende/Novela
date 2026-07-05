package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: od  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r13 b;

    public /* synthetic */ od(r13 r13Var, int i) {
        this.a = i;
        this.b = r13Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        r13 r13Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(r13Var.L0(125.0f));
            default:
                return new y78((Float.floatToRawIntBits((r13Var.X0(l08.a) - r13Var.X0(56.0f)) / 2.0f) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L));
        }
    }
}
