package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f57  reason: default package */
/* loaded from: classes.dex */
public final class f57 {
    public final String a;
    public final c57 b;
    public final b57 c;
    public final j57 d;
    public final z47 e;
    public final d57 f;

    static {
        fr2 fr2Var = new fr2();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        List list = Collections.EMPTY_LIST;
        mm9 mm9Var2 = mm9.e;
        a57 a57Var = new a57();
        d57 d57Var = d57.a;
        fr2Var.a();
        a57Var.a();
        j57 j57Var = j57.B;
        a82.s(0, 1, 2, 3, 4);
        a2d.K(5);
    }

    public f57(String str, z47 z47Var, c57 c57Var, b57 b57Var, j57 j57Var, d57 d57Var) {
        this.a = str;
        this.b = c57Var;
        this.c = b57Var;
        this.d = j57Var;
        this.e = z47Var;
        this.f = d57Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f57) {
                f57 f57Var = (f57) obj;
                if (Objects.equals(this.a, f57Var.a) && this.e.equals(f57Var.e) && Objects.equals(this.b, f57Var.b) && this.c.equals(f57Var.c) && Objects.equals(this.d, f57Var.d) && Objects.equals(this.f, f57Var.f)) {
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
        int hashCode = this.a.hashCode() * 31;
        c57 c57Var = this.b;
        if (c57Var != null) {
            i = c57Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = (this.d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return hashCode4;
    }
}
