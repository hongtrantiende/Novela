package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rq9  reason: default package */
/* loaded from: classes.dex */
public final class rq9 implements nm1 {
    public final int a;

    public rq9(int i) {
        this.a = i;
    }

    @Override // defpackage.nm1
    public final long a(Context context) {
        return sve.b(om1.a.a(context, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rq9) && this.a == ((rq9) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.p(new StringBuilder("ResourceColorProvider(resId="), this.a, ')');
    }
}
