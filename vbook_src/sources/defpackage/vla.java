package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = tla.class)
/* renamed from: vla  reason: default package */
/* loaded from: classes3.dex */
public final class vla implements c26 {
    public static final sla Companion = new Object();
    public final String[] a;

    public vla(List list) {
        String namespaceURI;
        list.getClass();
        int size = list.size() * 2;
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                namespaceURI = ((wx7) list.get(i / 2)).getPrefix();
            } else {
                namespaceURI = ((wx7) list.get(i / 2)).getNamespaceURI();
            }
            strArr[i] = namespaceURI;
        }
        this.a = strArr;
    }

    public final String a(int i) {
        try {
            return this.a[(i * 2) + 1];
        } catch (IndexOutOfBoundsException unused) {
            cy7.k(a82.j(i, "Index out of range: "));
            return null;
        }
    }

    public final String b(int i) {
        try {
            return this.a[i * 2];
        } catch (IndexOutOfBoundsException unused) {
            cy7.k(a82.j(i, "Index out of range: "));
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vla)) {
            return false;
        }
        if (Arrays.equals(this.a, ((vla) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final String getNamespaceURI(String str) {
        str.getClass();
        if (str.equals("xml")) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if (str.equals("xmlns")) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int length = (this.a.length / 2) - 1; length >= 0; length--) {
            if (c16.i(b(length), str)) {
                return a(length);
            }
        }
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final String getPrefix(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 0) {
            if (hashCode != 557947472) {
                if (hashCode == 1952986079 && str.equals("http://www.w3.org/XML/1998/namespace")) {
                    return "xml";
                }
            } else if (str.equals("http://www.w3.org/2000/xmlns/")) {
                return "xmlns";
            }
        } else if (str.equals("")) {
            return "";
        }
        for (int length = (this.a.length / 2) - 1; length >= 0; length--) {
            if (c16.i(a(length), str)) {
                return b(length);
            }
        }
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public final Iterator getPrefixes(String str) {
        b9a c00Var;
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 0) {
            if (hashCode != 557947472) {
                if (hashCode == 1952986079 && str.equals("http://www.w3.org/XML/1998/namespace")) {
                    c00Var = new c00(new String[]{"xml"}, 0);
                }
                c00Var = new ki4(3, new ff4(new c00(dce.z(dce.F(0, this.a.length / 2)), 1), true, new cn9(14, this, str)), new ux9(this, 12));
            } else {
                if (str.equals("http://www.w3.org/2000/xmlns/")) {
                    c00Var = new c00(new String[]{"xmlns"}, 0);
                }
                c00Var = new ki4(3, new ff4(new c00(dce.z(dce.F(0, this.a.length / 2)), 1), true, new cn9(14, this, str)), new ux9(this, 12));
            }
        } else {
            if (str.equals("")) {
                c00Var = new c00(new String[]{""}, 0);
            }
            c00Var = new ki4(3, new ff4(new c00(dce.z(dce.F(0, this.a.length / 2)), 1), true, new cn9(14, this, str)), new ux9(this, 12));
        }
        return c00Var.iterator();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b2(this, 5);
    }

    public vla(String[] strArr) {
        this.a = strArr;
    }
}
