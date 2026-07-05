package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: smc  reason: default package */
/* loaded from: classes.dex */
public final class smc {
    public final Context a;
    public final int b;
    public final boolean c;
    public final rc6 d;
    public final int e;
    public final boolean f;
    public final AtomicInteger g;
    public final bx5 h;
    public final AtomicBoolean i;
    public final long j;
    public final int k;
    public final boolean l;
    public final Integer m;
    public final ComponentName n;

    public smc(Context context, int i, boolean z, rc6 rc6Var, int i2, boolean z2, AtomicInteger atomicInteger, bx5 bx5Var, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = rc6Var;
        this.e = i2;
        this.f = z2;
        this.g = atomicInteger;
        this.h = bx5Var;
        this.i = atomicBoolean;
        this.j = j;
        this.k = i3;
        this.l = z3;
        this.m = num;
        this.n = componentName;
    }

    public static smc a(smc smcVar, int i, AtomicInteger atomicInteger, bx5 bx5Var, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        int i3;
        boolean z;
        AtomicInteger atomicInteger2;
        bx5 bx5Var2;
        AtomicBoolean atomicBoolean2;
        long j2;
        int i4;
        Integer num2;
        Context context = smcVar.a;
        int i5 = smcVar.b;
        boolean z2 = smcVar.c;
        rc6 rc6Var = smcVar.d;
        if ((i2 & 16) != 0) {
            i3 = smcVar.e;
        } else {
            i3 = i;
        }
        boolean z3 = true;
        if ((i2 & 32) != 0) {
            z = smcVar.f;
        } else {
            z = true;
        }
        if ((i2 & 64) != 0) {
            atomicInteger2 = smcVar.g;
        } else {
            atomicInteger2 = atomicInteger;
        }
        if ((i2 & Token.CASE) != 0) {
            bx5Var2 = smcVar.h;
        } else {
            bx5Var2 = bx5Var;
        }
        if ((i2 & 256) != 0) {
            atomicBoolean2 = smcVar.i;
        } else {
            atomicBoolean2 = atomicBoolean;
        }
        if ((i2 & 512) != 0) {
            j2 = smcVar.j;
        } else {
            j2 = j;
        }
        if ((i2 & 1024) != 0) {
            i4 = smcVar.k;
        } else {
            i4 = 0;
        }
        if ((i2 & 4096) != 0) {
            z3 = smcVar.l;
        }
        if ((i2 & 8192) != 0) {
            num2 = smcVar.m;
        } else {
            num2 = num;
        }
        return new smc(context, i5, z2, rc6Var, i3, z, atomicInteger2, bx5Var2, atomicBoolean2, j2, i4, z3, num2, smcVar.n);
    }

    public final smc b(bx5 bx5Var, int i) {
        return a(this, i, null, bx5Var, null, 0L, null, 32623);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof smc) {
                smc smcVar = (smc) obj;
                if (this.a.equals(smcVar.a) && this.b == smcVar.b && this.c == smcVar.c && this.d == smcVar.d && this.e == smcVar.e && this.f == smcVar.f && c16.i(this.g, smcVar.g) && c16.i(this.h, smcVar.h) && c16.i(this.i, smcVar.i) && this.j == smcVar.j && this.k == smcVar.k && this.l == smcVar.l && c16.i(this.m, smcVar.m) && c16.i(this.n, smcVar.n)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(hl5.a(this.e, (this.d.hashCode() + eub.k(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31), 31, this.f);
        int k2 = eub.k(hl5.a(-1, hl5.a(this.k, hl5.c((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + k) * 31)) * 31)) * 31, this.j, 31), 31), 31), 31, this.l);
        int i = 0;
        Integer num = this.m;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (k2 + hashCode) * 31;
        ComponentName componentName = this.n;
        if (componentName != null) {
            i = componentName.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "TranslationContext(context=" + this.a + ", appWidgetId=" + this.b + ", isRtl=" + this.c + ", layoutConfiguration=" + this.d + ", itemPosition=" + this.e + ", isLazyCollectionDescendant=" + this.f + ", lastViewId=" + this.g + ", parentContext=" + this.h + ", isBackgroundSpecified=" + this.i + ", layoutSize=" + ((Object) ug3.c(this.j)) + ", layoutCollectionViewId=" + this.k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.n + ')';
    }
}
