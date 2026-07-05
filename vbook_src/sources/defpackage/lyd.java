package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lyd  reason: default package */
/* loaded from: classes.dex */
public final class lyd extends AbstractMap {
    public static final roa f = new roa(23);
    public final Object[] a;
    public final int[] b;
    public final kyd c;
    public Integer d;
    public String e;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x016d, code lost:
        if (r8 < 0) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, lyd] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lyd(defpackage.lyd r21, defpackage.lyd r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyd.<init>(lyd, lyd):void");
    }

    public static boolean b(int i, int i2) {
        if (i > 16 && i * 9 > i2 * 10) {
            return true;
        }
        return false;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        kyd kydVar = (kyd) entry.getValue();
        int b = kydVar.b() - kydVar.a();
        System.arraycopy(kydVar.b.a, kydVar.a(), objArr, i2, b);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new kyd(this, i));
        int i3 = i2 + b;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.b[0]) {
            return (Map.Entry) this.a[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.d == null) {
            this.d = Integer.valueOf(super.hashCode());
        }
        return this.d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.e == null) {
            this.e = super.toString();
        }
        return this.e;
    }

    public lyd() {
        List list = Collections.EMPTY_LIST;
        this.c = new kyd(this, -1);
        this.d = null;
        this.e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.a = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.b = iArr;
                return;
            }
            throw rs8.f(it2);
        }
        throw rs8.f(it);
    }
}
