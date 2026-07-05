package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wjb  reason: default package */
/* loaded from: classes.dex */
public final class wjb {
    public String a;
    public final String b;
    public final String c;
    public int d;

    public wjb(String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* renamed from: a */
    public final wjb clone() {
        String str = this.a;
        str.getClass();
        String str2 = this.b;
        str2.getClass();
        String str3 = this.c;
        str3.getClass();
        wjb wjbVar = new wjb(str, str2, str3);
        wjbVar.d = this.d;
        return wjbVar;
    }

    public final boolean b(int i) {
        if ((this.d & i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if ((this.d & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        int i = this.d;
        if ((i & 16) == 0 && (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public final void e(int i) {
        this.d = i | this.d | 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wjb.class != obj.getClass()) {
            return false;
        }
        wjb wjbVar = (wjb) obj;
        if (this.d == wjbVar.d && c16.i(this.a, wjbVar.a) && c16.i(this.b, wjbVar.b) && c16.i(this.c, wjbVar.c)) {
            return true;
        }
        return false;
    }

    public final ifc f() {
        if (b(Token.CASE)) {
            return ifc.f;
        }
        if (b(256)) {
            return ifc.D;
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new String[]{this.a, this.c});
    }

    public final String toString() {
        return this.a;
    }
}
