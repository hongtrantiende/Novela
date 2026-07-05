package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i75  reason: default package */
/* loaded from: classes.dex */
public final class i75 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public i75(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        wq9.D(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i75) {
                i75 i75Var = (i75) obj;
                if (this.b == i75Var.b && Double.compare(this.c, i75Var.c) == 0 && Objects.equals(this.a, i75Var.a) && Objects.equals(this.d, i75Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public i75(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}
