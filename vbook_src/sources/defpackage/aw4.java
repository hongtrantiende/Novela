package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aw4  reason: default package */
/* loaded from: classes3.dex */
public final class aw4 {
    public a63 a;
    public a63 b;
    public a63 c;
    public Map d;
    public final a63 e;
    public final a63 f;
    public final a63 g;
    public final a63 h;
    public nz6 i;
    public final Map j;
    public final Map k;

    public aw4(a63 a63Var, a63 a63Var2, a63 a63Var3, Map map, a63 a63Var4, a63 a63Var5, a63 a63Var6, a63 a63Var7, nz6 nz6Var, Map map2, Map map3) {
        this.a = a63Var;
        this.b = a63Var2;
        this.c = a63Var3;
        this.d = map;
        this.e = a63Var4;
        this.f = a63Var5;
        this.g = a63Var6;
        this.h = a63Var7;
        this.i = nz6Var;
        this.j = map2;
        this.k = map3;
    }

    public final String a(int i, int i2, String str) {
        String str2;
        String str3;
        a63 a63Var;
        str.getClass();
        a63 a63Var2 = this.e;
        if (a63Var2 != null) {
            str2 = (String) a63Var2.b(i, i2, str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        a63 a63Var3 = this.h;
        if (a63Var3 != null) {
            str3 = (String) a63Var3.b(i, i2, str);
        } else {
            str3 = null;
        }
        if (str3 != null || (a63Var = this.b) == null) {
            return null;
        }
        return (String) a63Var.b(i, i2, str);
    }

    public final String b(int i, int i2, String str) {
        String str2;
        String str3;
        a63 a63Var;
        str.getClass();
        a63 a63Var2 = this.f;
        if (a63Var2 != null) {
            str2 = (String) a63Var2.b(i, i2, str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        a63 a63Var3 = this.g;
        if (a63Var3 != null) {
            str3 = (String) a63Var3.b(i, i2, str);
        } else {
            str3 = null;
        }
        if (str3 != null || (a63Var = this.a) == null) {
            return null;
        }
        return (String) a63Var.b(i, i2, str);
    }
}
