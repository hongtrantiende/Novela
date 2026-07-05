package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bq9  reason: default package */
/* loaded from: classes.dex */
public final class bq9 {
    public final String a;
    public final gi1 b;
    public final Object c;
    public final String d;
    public final String e;
    public final Map f;

    public bq9(String str, gi1 gi1Var, Object obj, String str2, String str3, Map map) {
        str.getClass();
        this.a = str;
        this.b = gi1Var;
        this.c = obj;
        this.d = str2;
        this.e = str3;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bq9) {
                bq9 bq9Var = (bq9) obj;
                if (!c16.i(this.a, bq9Var.a) || !c16.i(this.b, bq9Var.b) || !c16.i(this.c, bq9Var.c) || !c16.i(this.d, bq9Var.d) || !c16.i(this.e, bq9Var.e) || !c16.i(this.f, bq9Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        Object obj = this.c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        return "RequestParameters(url=" + this.a + ", responseType=" + this.b + ", body=" + this.c + ", contentType=" + this.d + ", accept=" + this.e + ", headers=" + this.f + ")";
    }

    public /* synthetic */ bq9(gi1 gi1Var, String str) {
        this(str, gi1Var, null, null, null, ls3.a);
    }
}
