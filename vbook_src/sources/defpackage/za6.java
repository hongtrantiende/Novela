package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: za6  reason: default package */
/* loaded from: classes.dex */
public final class za6 {
    public final String a;
    public final String b;

    static {
        a2d.K(0);
        a2d.K(1);
    }

    public za6(String str, String str2) {
        this.a = a2d.R(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && za6.class == obj.getClass()) {
            za6 za6Var = (za6) obj;
            if (Objects.equals(this.a, za6Var.a) && Objects.equals(this.b, za6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
