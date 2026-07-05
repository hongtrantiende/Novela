package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tw9  reason: default package */
/* loaded from: classes.dex */
public final class tw9 implements Iterable {
    public qw9 a;
    public qw9 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final Object a(q78 q78Var, as6 as6Var) {
        qw9 qw9Var = this.a;
        while (qw9Var != null && !qw9Var.a.equals(q78Var)) {
            qw9Var = qw9Var.c;
        }
        if (qw9Var != null) {
            return qw9Var.b;
        }
        qw9 qw9Var2 = new qw9(q78Var, as6Var);
        this.d++;
        qw9 qw9Var3 = this.b;
        if (qw9Var3 == null) {
            this.a = qw9Var2;
            this.b = qw9Var2;
            return null;
        }
        qw9Var3.c = qw9Var2;
        qw9Var2.d = qw9Var3;
        this.b = qw9Var2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r1.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((defpackage.pw9) r6).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.tw9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tw9 r6 = (defpackage.tw9) r6
            int r1 = r5.d
            int r3 = r6.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            pw9 r1 = (defpackage.pw9) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            pw9 r3 = (defpackage.pw9) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            pw9 r6 = (defpackage.pw9) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            pw9 pw9Var = (pw9) it;
            if (pw9Var.hasNext()) {
                i += ((Map.Entry) pw9Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pw9, java.util.Iterator, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        qw9 qw9Var = this.a;
        qw9 qw9Var2 = this.b;
        ?? obj = new Object();
        obj.a = qw9Var2;
        obj.b = qw9Var;
        this.c.put(obj, Boolean.FALSE);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            pw9 pw9Var = (pw9) it;
            if (pw9Var.hasNext()) {
                sb.append(((Map.Entry) pw9Var.next()).toString());
                if (pw9Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
