package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ba5  reason: default package */
/* loaded from: classes.dex */
public final class ba5 implements wea {
    public static final ba5 b = new ba5(0);
    public static final ba5 c = new ba5(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ba5(int i) {
        this.a = i;
    }

    @Override // defpackage.wea
    public final kwe a(long j, tc6 tc6Var, r13 r13Var) {
        switch (this.a) {
            case 0:
                float X0 = r13Var.X0(30.0f);
                return new tf8(new rk9(nae.e, -X0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + X0));
            case 1:
                float X02 = r13Var.X0(30.0f);
                return new tf8(new rk9(-X02, nae.e, Float.intBitsToFloat((int) (j >> 32)) + X02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new tf8(npe.n(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
