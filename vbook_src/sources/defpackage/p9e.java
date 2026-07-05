package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p9e  reason: default package */
/* loaded from: classes.dex */
public final class p9e implements Iterable, e9e {
    public final String a;

    public p9e(String str) {
        if (str != null) {
            this.a = str;
        } else {
            vs.m("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e2, code lost:
        if (r4[r1].isEmpty() == false) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e9e d(java.lang.String r29, defpackage.odd r30, java.util.ArrayList r31) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9e.d(java.lang.String, odd, java.util.ArrayList):e9e");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9e)) {
            return false;
        }
        return this.a.equals(((p9e) obj).a);
    }

    @Override // defpackage.e9e
    public final e9e f() {
        return new p9e(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l9e(this, 1);
    }

    public final String toString() {
        String str = this.a;
        return nk2.v(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // defpackage.e9e
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.e9e
    public final Double zzd() {
        String str = this.a;
        if (!str.isEmpty()) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.NaN);
            }
        }
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.e9e
    public final Boolean zze() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.e9e
    public final Iterator zzf() {
        return new l9e(this, 0);
    }
}
