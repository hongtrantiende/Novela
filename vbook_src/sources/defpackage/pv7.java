package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv7  reason: default package */
/* loaded from: classes.dex */
public final class pv7 {
    public final LinkedHashMap a;
    public final y30 b;

    public pv7(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new y30(z);
    }

    public final Map a() {
        yk8 yk8Var;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int k = p17.k(tl1.s(entrySet, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                yk8Var = new yk8(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                yk8Var = new yk8(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(yk8Var.a, yk8Var.b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (!this.b.a.get()) {
            return;
        }
        vs.k("Do mutate preferences once returned to DataStore.");
    }

    public final Object c(e49 e49Var) {
        e49Var.getClass();
        Object obj = this.a.get(e49Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return Arrays.copyOf(bArr, bArr.length);
        }
        return obj;
    }

    public final void d(e49 e49Var) {
        e49Var.getClass();
        b();
        this.a.remove(e49Var);
    }

    public final void e(e49 e49Var, Object obj) {
        e49Var.getClass();
        f(e49Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.pv7
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            pv7 r6 = (defpackage.pv7) r6
            java.util.LinkedHashMap r6 = r6.a
            java.util.LinkedHashMap r5 = r5.a
            r0 = 1
            if (r6 != r5) goto L10
            goto L61
        L10:
            int r2 = r6.size()
            int r3 = r5.size()
            if (r2 == r3) goto L1b
            goto L60
        L1b:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L22
            goto L61
        L22:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L5d
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L58
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L5d
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L5d
            r2 = r0
            goto L5e
        L58:
            boolean r2 = defpackage.c16.i(r2, r3)
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 != 0) goto L2a
        L60:
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv7.equals(java.lang.Object):boolean");
    }

    public final void f(e49 e49Var, Object obj) {
        e49Var.getClass();
        b();
        if (obj == null) {
            d(e49Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set unmodifiableSet = Collections.unmodifiableSet(sl1.H0((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(e49Var, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(e49Var, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(e49Var, obj);
        }
    }

    public final pv7 g() {
        return new pv7(new LinkedHashMap(a()), false);
    }

    public final pv7 h() {
        return new pv7(new LinkedHashMap(a()), true);
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public final String toString() {
        return sl1.i0(this.a.entrySet(), ",\n", "{\n", "\n}", new bo7(8), 24);
    }

    public /* synthetic */ pv7(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
