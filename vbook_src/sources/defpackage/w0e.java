package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w0e  reason: default package */
/* loaded from: classes.dex */
public final class w0e implements Iterable, e9e, z6e {
    public final TreeMap a;
    public final TreeMap b;

    public w0e(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k(i, (e9e) list.get(i));
            }
        }
    }

    @Override // defpackage.z6e
    public final e9e b(String str) {
        e9e e9eVar;
        if ("length".equals(str)) {
            return new g4e(Double.valueOf(i()));
        }
        if (e(str) && (e9eVar = (e9e) this.b.get(str)) != null) {
            return e9eVar;
        }
        return e9e.u;
    }

    @Override // defpackage.z6e
    public final void c(String str, e9e e9eVar) {
        TreeMap treeMap = this.b;
        if (e9eVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, e9eVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
        if (defpackage.oc2.O(r7, r2, (defpackage.q8e) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).i() == r7.i()) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    @Override // defpackage.e9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e9e d(java.lang.String r37, defpackage.odd r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instructions count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w0e.d(java.lang.String, odd, java.util.ArrayList):e9e");
    }

    @Override // defpackage.z6e
    public final boolean e(String str) {
        if (!"length".equals(str) && !this.b.containsKey(str)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w0e) {
                w0e w0eVar = (w0e) obj;
                if (i() == w0eVar.i()) {
                    TreeMap treeMap = this.a;
                    if (treeMap.isEmpty()) {
                        return w0eVar.a.isEmpty();
                    }
                    for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                        if (!j(intValue).equals(w0eVar.j(intValue))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e9e
    public final e9e f() {
        w0e w0eVar = new w0e();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof z6e;
            TreeMap treeMap = w0eVar.a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (e9e) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((e9e) entry.getValue()).f());
            }
        }
        return w0eVar;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList(i());
        for (int i = 0; i < i(); i++) {
            arrayList.add(j(i));
        }
        return arrayList;
    }

    public final Iterator h() {
        return this.a.keySet().iterator();
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final int i() {
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l9e(this, 2);
    }

    public final e9e j(int i) {
        e9e e9eVar;
        if (i < i()) {
            if (l(i) && (e9eVar = (e9e) this.a.get(Integer.valueOf(i))) != null) {
                return e9eVar;
            }
            return e9e.u;
        }
        cy7.k("Attempting to get element outside of current array");
        return null;
    }

    public final void k(int i, e9e e9eVar) {
        if (i <= 32468) {
            if (i >= 0) {
                TreeMap treeMap = this.a;
                if (e9eVar == null) {
                    treeMap.remove(Integer.valueOf(i));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i), e9eVar);
                    return;
                }
            }
            cy7.k(nk2.s(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        vs.k("Array too large");
    }

    public final boolean l(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        cy7.k(nk2.s(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void m(int i) {
        TreeMap treeMap = this.a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            treeMap.remove(Integer.valueOf(i));
            if (i == intValue) {
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!treeMap.containsKey(valueOf) && i2 >= 0) {
                    treeMap.put(valueOf, e9e.u);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i);
                    e9e e9eVar = (e9e) treeMap.get(valueOf2);
                    if (e9eVar != null) {
                        treeMap.put(Integer.valueOf(i - 1), e9eVar);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String n(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i >= i()) {
                    break;
                }
                e9e j = j(i);
                sb.append(str2);
                if (!(j instanceof r9e) && !(j instanceof c8e)) {
                    sb.append(j.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return n(",");
    }

    @Override // defpackage.e9e
    public final String zzc() {
        return n(",");
    }

    @Override // defpackage.e9e
    public final Double zzd() {
        TreeMap treeMap = this.a;
        if (treeMap.size() == 1) {
            return j(0).zzd();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.e9e
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.e9e
    public final Iterator zzf() {
        return new fzd(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public w0e() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
}
