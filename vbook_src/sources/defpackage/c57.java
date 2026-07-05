package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c57  reason: default package */
/* loaded from: classes.dex */
public final class c57 {
    public final Uri a;
    public final String b;
    public final List c;
    public final qs5 d;
    public final long e;

    static {
        a82.s(0, 1, 2, 3, 4);
        a2d.K(5);
        a2d.K(6);
        a2d.K(7);
    }

    public c57(Uri uri, String str, aze azeVar, List list, qs5 qs5Var, long j) {
        this.a = uri;
        this.b = lc7.p(str);
        this.c = list;
        this.d = qs5Var;
        ls5 i = qs5.i();
        for (int i2 = 0; i2 < qs5Var.size(); i2++) {
            e57 e57Var = (e57) qs5Var.get(i2);
            fje fjeVar = new fje();
            e57Var.getClass();
            fjeVar.b = e57Var.a;
            i.b(new e57(fjeVar));
        }
        i.g();
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c57) {
                c57 c57Var = (c57) obj;
                if (this.a.equals(c57Var.a) && Objects.equals(this.b, c57Var.b) && Objects.equals(null, null) && this.c.equals(c57Var.c) && this.d.equals(c57Var.d) && this.e == c57Var.e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.c.hashCode();
        return (int) (((this.d.hashCode() + ((hashCode3 + ((hashCode2 + hashCode) * 29791)) * 961)) * 31 * 31) + this.e);
    }
}
