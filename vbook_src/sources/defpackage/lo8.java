package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lo8  reason: default package */
/* loaded from: classes.dex */
public final class lo8 {
    public final jo8 a;
    public final float[] b;
    public final float c;

    public lo8(jo8 jo8Var, float[] fArr, float f) {
        this.a = jo8Var;
        this.b = fArr;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lo8.class == obj.getClass()) {
                lo8 lo8Var = (lo8) obj;
                if (this.a == lo8Var.a && Arrays.equals(this.b, lo8Var.b) && this.c == lo8Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Float.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        arrays.getClass();
        return "PathSegment(type=" + this.a + ", points=" + arrays + ", weight=" + this.c + ")";
    }
}
