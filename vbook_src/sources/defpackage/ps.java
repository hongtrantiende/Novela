package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ps  reason: default package */
/* loaded from: classes.dex */
public final class ps implements CharSequence {
    public static final yy9 e = cz9.a;
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public ps(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                os osVar = (os) list.get(i);
                Object obj = osVar.a;
                if (obj instanceof uva) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(osVar);
                } else if (obj instanceof pl8) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(osVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List u0 = arrayList2 != null ? sl1.u0(arrayList2, new kn4(10)) : null;
        if (u0 != null && !u0.isEmpty()) {
            int i2 = ((os) sl1.c0(u0)).c;
            vu7 vu7Var = ly5.a;
            vu7 vu7Var2 = new vu7(1);
            vu7Var2.a(i2);
            int size2 = u0.size();
            for (int i3 = 1; i3 < size2; i3++) {
                os osVar2 = (os) u0.get(i3);
                while (true) {
                    if (vu7Var2.b == 0) {
                        break;
                    }
                    int d = vu7Var2.d();
                    if (osVar2.b >= d) {
                        vu7Var2.e(vu7Var2.b - 1);
                    } else {
                        int i4 = osVar2.c;
                        if (i4 > d) {
                            mv5.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + d);
                        }
                    }
                }
                vu7Var2.a(osVar2.c);
            }
        }
    }

    public final List a(int i) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                os osVar = (os) obj;
                if ((osVar.a instanceof fp6) && qs.b(0, i, osVar.b, osVar.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return ks3.a;
    }

    public final List b() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return ks3.a;
        }
        return arrayList;
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            return ks3.a;
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final List d(int i, int i2) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                os osVar = (os) list.get(i3);
                Object obj = osVar.a;
                int i4 = osVar.c;
                int i5 = osVar.b;
                if ((obj instanceof p3b) && qs.b(i, i2, i5, i4)) {
                    Object obj2 = osVar.a;
                    obj2.getClass();
                    arrayList.add(new os(i5, osVar.d, ((p3b) obj2).a, i4));
                }
            }
            return arrayList;
        }
        return ks3.a;
    }

    public final List e(int i, int i2, String str) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                os osVar = (os) list.get(i3);
                Object obj = osVar.a;
                int i4 = osVar.c;
                int i5 = osVar.b;
                String str2 = osVar.d;
                if ((obj instanceof p3b) && str.equals(str2) && qs.b(i, i2, i5, i4)) {
                    Object obj2 = osVar.a;
                    obj2.getClass();
                    arrayList.add(new os(i5, str2, ((p3b) obj2).a, i4));
                }
            }
            return arrayList;
        }
        return ks3.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps)) {
            return false;
        }
        ps psVar = (ps) obj;
        if (c16.i(this.b, psVar.b) && c16.i(this.a, psVar.a)) {
            return true;
        }
        return false;
    }

    public final List f(int i) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                os osVar = (os) obj;
                if ((osVar.a instanceof f5d) && qs.b(0, i, osVar.b, osVar.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return ks3.a;
    }

    public final List g(int i) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                os osVar = (os) obj;
                if ((osVar.a instanceof wyc) && qs.b(0, i, osVar.b, osVar.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return ks3.a;
    }

    public final ps h(xt4 xt4Var) {
        ns nsVar = new ns(this);
        ArrayList arrayList = nsVar.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            os osVar = (os) xt4Var.invoke(((ms) arrayList.get(i)).a(Integer.MIN_VALUE));
            Object obj = osVar.a;
            arrayList.set(i, new ms(osVar.b, osVar.d, obj, osVar.c));
        }
        return nsVar.k();
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r0.isEmpty() != false) goto L28;
     */
    @Override // java.lang.CharSequence
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ps subSequence(int r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = ")"
            java.lang.String r1 = "start ("
            if (r10 > r11) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r10)
            java.lang.String r3 = ") should be less or equal to end ("
            r2.append(r3)
            r2.append(r11)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            defpackage.mv5.a(r2)
        L21:
            java.lang.String r2 = r9.b
            if (r10 != 0) goto L2c
            int r3 = r2.length()
            if (r11 != r3) goto L2c
            return r9
        L2c:
            java.lang.String r2 = r2.substring(r10, r11)
            ps r3 = defpackage.qs.a
            if (r10 > r11) goto L35
            goto L4f
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r10)
            java.lang.String r1 = ") should be less than or equal to end ("
            r3.append(r1)
            r3.append(r11)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.mv5.a(r0)
        L4f:
            java.util.List r9 = r9.a
            if (r9 != 0) goto L54
            goto L95
        L54:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            int r1 = r9.size()
            r3 = 0
        L62:
            if (r3 >= r1) goto L8f
            java.lang.Object r4 = r9.get(r3)
            os r4 = (defpackage.os) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.qs.b(r10, r11, r5, r6)
            if (r5 == 0) goto L8c
            os r5 = new os
            java.lang.Object r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r8, r4, r7, r6)
            r0.add(r5)
        L8c:
            int r3 = r3 + 1
            goto L62
        L8f:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L96
        L95:
            r0 = 0
        L96:
            ps r9 = new ps
            r9.<init>(r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps.subSequence(int, int):ps");
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ps(String str, ArrayList arrayList) {
        this(arrayList.isEmpty() ? null : arrayList, str);
        ps psVar = qs.a;
    }

    public /* synthetic */ ps(String str) {
        this(str, ks3.a);
    }

    public ps(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
