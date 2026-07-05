package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j45  reason: default package */
/* loaded from: classes3.dex */
public final class j45 {
    public final String a;
    public final List b;
    public final double c;

    public j45(String str, List list) {
        Double d;
        Object obj;
        String str2;
        Double B;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (it.hasNext()) {
                obj = it.next();
                if (c16.i(((k45) obj).a, "q")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        k45 k45Var = (k45) obj;
        double d2 = 1.0d;
        if (k45Var != null && (str2 = k45Var.b) != null && (B = q4b.B(str2)) != null) {
            double doubleValue = B.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d = B;
            }
            if (d != null) {
                d2 = d.doubleValue();
            }
        }
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j45)) {
            return false;
        }
        j45 j45Var = (j45) obj;
        if (c16.i(this.a, j45Var.a) && c16.i(this.b, j45Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.b + ')';
    }
}
