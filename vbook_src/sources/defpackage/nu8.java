package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nu8  reason: default package */
/* loaded from: classes.dex */
public final class nu8 {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof nu8)) {
            nu8 nu8Var = (nu8) obj;
            String str = this.c;
            String str2 = nu8Var.c;
            if (str == null && str2 == null) {
                if (Objects.equals(Objects.toString(this.a), Objects.toString(nu8Var.a)) && Objects.equals(this.b, nu8Var.b) && Boolean.valueOf(this.d).equals(Boolean.valueOf(nu8Var.d)) && Boolean.valueOf(this.e).equals(Boolean.valueOf(nu8Var.e))) {
                    return true;
                }
                return false;
            }
            return Objects.equals(str, str2);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }
}
