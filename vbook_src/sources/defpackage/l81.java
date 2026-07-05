package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l81  reason: default package */
/* loaded from: classes3.dex */
public final class l81 implements Iterator, j76 {
    public final /* synthetic */ int a;
    public int b;
    public String c;
    public final /* synthetic */ p81 d;

    public l81(p81 p81Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = p81Var;
                while (true) {
                    int i2 = this.b;
                    p81 p81Var2 = this.d;
                    if (i2 < p81Var2.e) {
                        int i3 = p81Var2.d[i2];
                        if (i3 < 0 || p81Var2.a[i3] == null) {
                            this.b = i2 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 2:
                this.d = p81Var;
                while (true) {
                    int i4 = this.b;
                    p81 p81Var3 = this.d;
                    if (i4 < p81Var3.e) {
                        int i5 = p81Var3.d[i4];
                        if (i5 < 0 || p81Var3.a[i5] == null) {
                            this.b = i4 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            default:
                this.d = p81Var;
                while (true) {
                    int i6 = this.b;
                    p81 p81Var4 = this.d;
                    if (i6 < p81Var4.e) {
                        int i7 = p81Var4.d[i6];
                        if (i7 < 0 || p81Var4.a[i7] == null) {
                            this.b = i6 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        p81 p81Var = this.d;
        switch (i) {
            case 0:
                if (this.b >= p81Var.e) {
                    return false;
                }
                return true;
            case 1:
                if (this.b >= p81Var.e) {
                    return false;
                }
                return true;
            default:
                if (this.b >= p81Var.e) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        Object obj = null;
        p81 p81Var = this.d;
        switch (i4) {
            case 0:
                if (hasNext()) {
                    int i5 = p81Var.d[this.b];
                    String str = p81Var.a[i5];
                    str.getClass();
                    this.c = str;
                    Object obj2 = p81Var.b[i5];
                    obj2.getClass();
                    n81 n81Var = new n81(p81Var, str, obj2);
                    this.b++;
                    while (true) {
                        int i6 = this.b;
                        if (i6 < p81Var.e && ((i = p81Var.d[i6]) < 0 || p81Var.a[i] == null)) {
                            this.b = i6 + 1;
                        }
                    }
                    return n81Var;
                }
                xk5.g();
                return null;
            case 1:
                if (hasNext()) {
                    String str2 = p81Var.a[p81Var.d[this.b]];
                    str2.getClass();
                    this.c = str2;
                    this.b++;
                    while (true) {
                        int i7 = this.b;
                        if (i7 < p81Var.e && ((i2 = p81Var.d[i7]) < 0 || p81Var.a[i2] == null)) {
                            this.b = i7 + 1;
                        }
                    }
                    String str3 = this.c;
                    str3.getClass();
                    return str3;
                }
                xk5.g();
                return null;
            default:
                if (hasNext()) {
                    int i8 = p81Var.d[this.b];
                    String str4 = p81Var.a[i8];
                    str4.getClass();
                    this.c = str4;
                    obj = p81Var.b[i8];
                    obj.getClass();
                    this.b++;
                    while (true) {
                        int i9 = this.b;
                        if (i9 < p81Var.e && ((i3 = p81Var.d[i9]) < 0 || p81Var.a[i3] == null)) {
                            this.b = i9 + 1;
                        }
                    }
                } else {
                    xk5.g();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        p81 p81Var = this.d;
        switch (i) {
            case 0:
                String str = this.c;
                if (str != null) {
                    p81Var.remove(str);
                    this.c = null;
                    return;
                }
                vs.k("next() must be called before remove()");
                return;
            case 1:
                String str2 = this.c;
                if (str2 != null) {
                    p81Var.remove(str2);
                    this.c = null;
                    return;
                }
                vs.k("next() must be called before remove()");
                return;
            default:
                String str3 = this.c;
                if (str3 != null) {
                    p81Var.remove(str3);
                    this.c = null;
                    return;
                }
                vs.k("next() must be called before remove()");
                return;
        }
    }
}
