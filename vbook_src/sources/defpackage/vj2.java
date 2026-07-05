package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vj2  reason: default package */
/* loaded from: classes.dex */
public final class vj2 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;
    public final zx5 e;

    public vj2(String str, ArrayList arrayList, ArrayList arrayList2) {
        List list;
        str.getClass();
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        String str2 = m89.h.a;
        str2.getClass();
        n89 a = a(str2, "DAV:");
        if (a != null) {
            list = a.e;
        } else {
            list = null;
        }
        list = list == null ? ks3.a : list;
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n89 n89Var = (n89) it.next();
                if (c16.i(n89Var.a, "collection") && n89Var.f) {
                    z = true;
                    break;
                }
            }
        }
        this.d = z;
        c(m89.a);
        b(m89.b);
        b(m89.c);
        String b = b(m89.d);
        if (b != null) {
            r4b.T(10, b);
        }
        b(m89.e);
        b(m89.f);
        this.e = c(m89.g);
    }

    public final n89 a(String str, String str2) {
        Object obj;
        str.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                n89 n89Var = (n89) obj;
                if (c16.i(n89Var.a, str) && c16.i(n89Var.b, str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (n89) obj;
    }

    public final String b(n89 n89Var) {
        String str = n89Var.a;
        String str2 = n89Var.b;
        str.getClass();
        n89 a = a(str, str2);
        if (a != null) {
            return a.d;
        }
        return null;
    }

    public final zx5 c(n89 n89Var) {
        Object gs9Var;
        String b = b(n89Var);
        Object obj = null;
        if (b == null) {
            return null;
        }
        try {
            zx5 zx5Var = zx5.c;
            gs9Var = bze.k(uj2.a(b).E);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            obj = gs9Var;
        }
        return (zx5) obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vj2) {
                vj2 vj2Var = (vj2) obj;
                if (!c16.i(this.a, vj2Var.a) || !this.b.equals(vj2Var.b) || !this.c.equals(vj2Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str;
        if (this.d) {
            str = "Folder";
        } else {
            str = "File";
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        String i0 = sl1.i0(arrayList, null, null, null, new ln1(28), 31);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(" ");
        sb.append(size);
        return s21.q(sb, " properties: ", i0);
    }
}
