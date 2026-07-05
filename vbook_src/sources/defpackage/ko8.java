package defpackage;

import android.graphics.PointF;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ko8  reason: default package */
/* loaded from: classes.dex */
public final class ko8 {
    public final int a;
    public final PointF[] b;
    public final float c;

    public ko8(int i, PointF[] pointFArr, float f) {
        if (i != 0) {
            this.a = i;
            this.b = pointFArr;
            this.c = f;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (ko8.class.equals(cls)) {
                obj.getClass();
                ko8 ko8Var = (ko8) obj;
                if (this.a == ko8Var.a && Arrays.equals(this.b, ko8Var.b) && this.c == ko8Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((a82.C(this.a) * 31) + Arrays.hashCode(this.b)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        switch (this.a) {
            case 1:
                str = "Move";
                break;
            case 2:
                str = "Line";
                break;
            case 3:
                str = "Quadratic";
                break;
            case 4:
                str = "Conic";
                break;
            case 5:
                str = "Cubic";
                break;
            case 6:
                str = "Close";
                break;
            case 7:
                str = "Done";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", points=");
        String arrays = Arrays.toString(this.b);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", weight=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
