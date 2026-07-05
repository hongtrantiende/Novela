package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iif  reason: default package */
/* loaded from: classes.dex */
public final class iif extends AbstractMap implements Serializable {
    public static final uhf E = new uhf();
    public yhf C;
    public yhf D;
    public final Comparator a;
    public final boolean b;
    public fif c;
    public int d;
    public int e;
    public final fif f;

    public iif(Comparator comparator, boolean z) {
        this.d = 0;
        this.e = 0;
        this.a = comparator;
        this.b = z;
        this.f = new fif(z);
    }

    public final fif a(Object obj, boolean z) {
        int i;
        fif fifVar;
        Comparable comparable;
        fif fifVar2;
        fif fifVar3 = this.c;
        uhf uhfVar = E;
        Comparator comparator = this.a;
        if (fifVar3 != null) {
            if (comparator == uhfVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = fifVar3.f;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = comparator.compare(obj, obj2);
                }
                if (i == 0) {
                    return fifVar3;
                }
                if (i < 0) {
                    fifVar2 = fifVar3.b;
                } else {
                    fifVar2 = fifVar3.c;
                }
                if (fifVar2 == null) {
                    break;
                }
                fifVar3 = fifVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        fif fifVar4 = this.f;
        if (fifVar3 == null) {
            if (comparator == uhfVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            fifVar = new fif(this.b, null, obj, fifVar4, fifVar4.e);
            this.c = fifVar;
        } else {
            fif fifVar5 = fifVar3;
            fifVar = new fif(this.b, fifVar5, obj, fifVar4, fifVar4.e);
            if (i < 0) {
                fifVar5.b = fifVar;
            } else {
                fifVar5.c = fifVar;
            }
            d(fifVar5, true);
        }
        this.d++;
        this.e++;
        return fifVar;
    }

    public final void b(fif fifVar, boolean z) {
        fif fifVar2;
        fif fifVar3;
        int i;
        if (z) {
            fif fifVar4 = fifVar.e;
            fifVar4.d = fifVar.d;
            fifVar.d.e = fifVar4;
        }
        fif fifVar5 = fifVar.b;
        fif fifVar6 = fifVar.c;
        fif fifVar7 = fifVar.a;
        int i2 = 0;
        if (fifVar5 != null && fifVar6 != null) {
            if (fifVar5.E > fifVar6.E) {
                do {
                    fifVar3 = fifVar5;
                    fifVar5 = fifVar5.c;
                } while (fifVar5 != null);
            } else {
                do {
                    fifVar2 = fifVar6;
                    fifVar6 = fifVar6.b;
                } while (fifVar6 != null);
                fifVar3 = fifVar2;
            }
            b(fifVar3, false);
            fif fifVar8 = fifVar.b;
            if (fifVar8 != null) {
                i = fifVar8.E;
                fifVar3.b = fifVar8;
                fifVar8.a = fifVar3;
                fifVar.b = null;
            } else {
                i = 0;
            }
            fif fifVar9 = fifVar.c;
            if (fifVar9 != null) {
                i2 = fifVar9.E;
                fifVar3.c = fifVar9;
                fifVar9.a = fifVar3;
                fifVar.c = null;
            }
            fifVar3.E = Math.max(i, i2) + 1;
            c(fifVar, fifVar3);
            return;
        }
        if (fifVar5 != null) {
            c(fifVar, fifVar5);
            fifVar.b = null;
        } else if (fifVar6 != null) {
            c(fifVar, fifVar6);
            fifVar.c = null;
        } else {
            c(fifVar, null);
        }
        d(fifVar7, false);
        this.d--;
        this.e++;
    }

    public final void c(fif fifVar, fif fifVar2) {
        fif fifVar3 = fifVar.a;
        fifVar.a = null;
        if (fifVar2 != null) {
            fifVar2.a = fifVar3;
        }
        if (fifVar3 != null) {
            if (fifVar3.b == fifVar) {
                fifVar3.b = fifVar2;
                return;
            } else {
                fifVar3.c = fifVar2;
                return;
            }
        }
        this.c = fifVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        fif fifVar = this.f;
        fifVar.e = fifVar;
        fifVar.d = fifVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        fif fifVar = null;
        if (obj != null) {
            try {
                fifVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (fifVar == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        if (r10 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005a, code lost:
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.fif r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            fif r0 = r9.b
            fif r1 = r9.c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.E
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.E
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            fif r0 = r1.b
            fif r3 = r1.c
            if (r3 == 0) goto L22
            int r3 = r3.E
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.E
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.f(r1)
            r8.e(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.e(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            fif r1 = r0.b
            fif r3 = r0.c
            if (r3 == 0) goto L4e
            int r3 = r3.E
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.E
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.e(r0)
            r8.f(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.f(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.E = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.E = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            fif r9 = r9.a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iif.d(fif, boolean):void");
    }

    public final void e(fif fifVar) {
        int i;
        int i2;
        fif fifVar2 = fifVar.b;
        fif fifVar3 = fifVar.c;
        fif fifVar4 = fifVar3.b;
        fif fifVar5 = fifVar3.c;
        fifVar.c = fifVar4;
        if (fifVar4 != null) {
            fifVar4.a = fifVar;
        }
        c(fifVar, fifVar3);
        fifVar3.b = fifVar;
        fifVar.a = fifVar3;
        int i3 = 0;
        if (fifVar2 != null) {
            i = fifVar2.E;
        } else {
            i = 0;
        }
        if (fifVar4 != null) {
            i2 = fifVar4.E;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        fifVar.E = max;
        if (fifVar5 != null) {
            i3 = fifVar5.E;
        }
        fifVar3.E = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        yhf yhfVar = this.C;
        if (yhfVar == null) {
            yhf yhfVar2 = new yhf(this, 0);
            this.C = yhfVar2;
            return yhfVar2;
        }
        return yhfVar;
    }

    public final void f(fif fifVar) {
        int i;
        int i2;
        fif fifVar2 = fifVar.b;
        fif fifVar3 = fifVar.c;
        fif fifVar4 = fifVar2.b;
        fif fifVar5 = fifVar2.c;
        fifVar.b = fifVar5;
        if (fifVar5 != null) {
            fifVar5.a = fifVar;
        }
        c(fifVar, fifVar2);
        fifVar2.c = fifVar;
        fifVar.a = fifVar2;
        int i3 = 0;
        if (fifVar3 != null) {
            i = fifVar3.E;
        } else {
            i = 0;
        }
        if (fifVar5 != null) {
            i2 = fifVar5.E;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        fifVar.E = max;
        if (fifVar4 != null) {
            i3 = fifVar4.E;
        }
        fifVar2.E = Math.max(max, i3) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            fif r2 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.D
            return r2
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iif.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yhf yhfVar = this.D;
        if (yhfVar == null) {
            yhf yhfVar2 = new yhf(this, 1);
            this.D = yhfVar2;
            return yhfVar2;
        }
        return yhfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.b) {
                xk5.k("value == null");
                return null;
            }
            fif a = a(obj, true);
            Object obj3 = a.D;
            a.D = obj2;
            return obj3;
        }
        xk5.k("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            fif r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.b(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.D
            return r2
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iif.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }

    public iif() {
        this(E, true);
    }
}
