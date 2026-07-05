package defpackage;

import java.util.Arrays;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g40  reason: default package */
/* loaded from: classes.dex */
public final class g40 implements Map.Entry, j76 {
    public static final String[] d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final gm9 e = new gm9("[^-a-zA-Z0-9_:.]+");
    public static final gm9 f = new gm9("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public final String a;
    public String b;
    public j40 c;

    public g40(String str, String str2, j40 j40Var) {
        int i;
        boolean z;
        str.getClass();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (c16.l(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
        if (obj != null && obj.length() != 0) {
            this.a = obj;
            this.b = str2;
            this.c = j40Var;
            return;
        }
        cy7.i("String must not be empty");
        throw null;
    }

    @Override // java.util.Map.Entry
    /* renamed from: a */
    public final String getValue() {
        String str = this.b;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // java.util.Map.Entry
    /* renamed from: b */
    public final String setValue(String str) {
        String str2;
        int l;
        String str3 = this.b;
        j40 j40Var = this.c;
        if (j40Var != null && (l = j40Var.l((str2 = this.a))) != -1) {
            j40 j40Var2 = this.c;
            j40Var2.getClass();
            str3 = j40Var2.g(str2);
            j40 j40Var3 = this.c;
            j40Var3.getClass();
            j40Var3.c[l] = str;
        }
        this.b = str;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public final Object clone() {
        String str = this.b;
        String str2 = this.a;
        str2.getClass();
        g40 g40Var = new g40(str2, str, null);
        g40Var.c = this.c;
        return g40Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g40.class == obj.getClass()) {
            g40 g40Var = (g40) obj;
            String str = g40Var.a;
            String str2 = this.a;
            if (c16.i(str2, str) && c16.i(str2, str) && c16.i(this.b, g40Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Arrays.hashCode(new String[]{this.a, this.b});
    }

    public final String toString() {
        StringBuilder b = d4b.b();
        b.getClass();
        bp3 bp3Var = new bp3(1, b);
        sc3 sc3Var = new sc3();
        String str = this.b;
        String str2 = this.a;
        str2.getClass();
        String k = twe.k(str2, sc3Var.g);
        if (k != null) {
            twe.l(k, str, bp3Var, sc3Var);
        }
        String sb = b.toString();
        d4b.m(b);
        return sb;
    }
}
