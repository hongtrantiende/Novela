package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so3  reason: default package */
/* loaded from: classes3.dex */
public final class so3 {
    public static final /* synthetic */ int f = 0;
    public final List a;
    public final String b;
    public final Set c;
    public final cj3 d;
    public final xoa e;

    static {
        new so3(ks3.a, null, rs3.a, null, null);
    }

    public so3(List list, String str, Set set, cj3 cj3Var, xoa xoaVar) {
        list.getClass();
        this.a = list;
        this.b = str;
        this.c = set;
        this.d = cj3Var;
        this.e = xoaVar;
    }

    public static so3 a(so3 so3Var, List list, String str, Set set, cj3 cj3Var, xoa xoaVar, int i) {
        if ((i & 1) != 0) {
            list = so3Var.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            str = so3Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            set = so3Var.c;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            cj3Var = so3Var.d;
        }
        cj3 cj3Var2 = cj3Var;
        if ((i & 16) != 0) {
            xoaVar = so3Var.e;
        }
        so3Var.getClass();
        list2.getClass();
        return new so3(list2, str2, set2, cj3Var2, xoaVar);
    }

    public final so3 b() {
        List list = this.a;
        List o = qwe.o(list);
        xl0 xl0Var = (xl0) sl1.k0(o);
        if (xl0Var != null && xl0Var.b.d()) {
            if (o == list) {
                return this;
            }
            return a(this, o, null, null, null, null, 30);
        }
        return a(this, sl1.o0(o, new xl0(hre.q().toString(), en0.a, new cm0("", ks3.a))), null, null, null, null, 30);
    }

    public final xl0 c(String str) {
        Object obj;
        str.getClass();
        Iterator it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (c16.i(((xl0) obj).a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (xl0) obj;
    }

    public final boolean d() {
        return !this.c.isEmpty();
    }

    public final int e(String str) {
        str.getClass();
        int i = 0;
        for (xl0 xl0Var : this.a) {
            if (c16.i(xl0Var.a, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L4e
        L4:
            boolean r1 = r5 instanceof defpackage.so3
            r2 = 0
            if (r1 != 0) goto La
            goto L4d
        La:
            so3 r5 = (defpackage.so3) r5
            java.util.List r1 = r4.a
            java.util.List r3 = r5.a
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L17
            goto L4d
        L17:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L23
            if (r1 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r1 != 0) goto L26
            goto L21
        L26:
            boolean r1 = r3.equals(r1)
        L2a:
            if (r1 != 0) goto L2d
            goto L4d
        L2d:
            java.util.Set r1 = r4.c
            java.util.Set r3 = r5.c
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L38
            goto L4d
        L38:
            cj3 r1 = r4.d
            cj3 r3 = r5.d
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L43
            goto L4d
        L43:
            xoa r4 = r4.e
            xoa r5 = r5.e
            boolean r4 = defpackage.c16.i(r4, r5)
            if (r4 != 0) goto L4e
        L4d:
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b = s21.b(this.c, (hashCode3 + hashCode) * 31, 31);
        cj3 cj3Var = this.d;
        if (cj3Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cj3Var.hashCode();
        }
        int i2 = (b + hashCode2) * 31;
        xoa xoaVar = this.e;
        if (xoaVar != null) {
            i = xoaVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        String a;
        String str = this.b;
        if (str == null) {
            a = "null";
        } else {
            a = pm0.a(str);
        }
        return "EditorState(blocks=" + this.a + ", focusedBlockId=" + a + ", selectedBlockIds=" + this.c + ", dragState=" + this.d + ", slashCommandState=" + this.e + ")";
    }
}
