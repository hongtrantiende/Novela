package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u95  reason: default package */
/* loaded from: classes.dex */
public final class u95 {
    public final lu4 a;
    public final /* synthetic */ int b;

    public u95(int i, lu4 lu4Var) {
        this.b = i;
        this.a = lu4Var;
    }

    public final float a(float f, sc6 sc6Var, sc6 sc6Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (sc6Var2.e0(sc6Var, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (sc6Var.a() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (sc6Var2.e0(sc6Var, (Float.floatToRawIntBits(((int) (sc6Var.a() & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
