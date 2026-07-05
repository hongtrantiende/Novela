package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gq1  reason: default package */
/* loaded from: classes.dex */
public final class gq1 extends wk5 {
    public final String b;
    public final String c;
    public final String d;

    public gq1(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gq1.class == obj.getClass()) {
                gq1 gq1Var = (gq1) obj;
                if (this.c.equals(gq1Var.c) && this.b.equals(gq1Var.b) && Objects.equals(this.d, gq1Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = eub.j(eub.j(527, 31, this.b), 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return j + i;
    }

    @Override // defpackage.wk5
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
