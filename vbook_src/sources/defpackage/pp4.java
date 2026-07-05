package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pp4  reason: default package */
/* loaded from: classes.dex */
public final class pp4 implements np4 {
    public final float[] a;
    public final float[] b;

    public pp4(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.a = fArr;
            this.b = fArr2;
            return;
        }
        vs.m("Array lengths must match and be nonzero");
        throw null;
    }

    @Override // defpackage.np4
    public final float a(float f) {
        return ox9.j(f, this.b, this.a);
    }

    @Override // defpackage.np4
    public final float b(float f) {
        return ox9.j(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof pp4)) {
                pp4 pp4Var = (pp4) obj;
                if (Arrays.equals(this.a, pp4Var.a) && Arrays.equals(this.b, pp4Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        return "FontScaleConverter{fromSpValues=" + arrays + ", toDpValues=" + arrays2 + "}";
    }
}
