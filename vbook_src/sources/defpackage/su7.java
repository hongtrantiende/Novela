package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: su7  reason: default package */
/* loaded from: classes.dex */
public final class su7 extends qd2 {
    public final void g(q09 q09Var, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long a = q09Var.a(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (a >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & a));
    }
}
