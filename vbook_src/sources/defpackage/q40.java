package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q40  reason: default package */
/* loaded from: classes.dex */
public final class q40 {
    public static final q40 d;
    public final int a;
    public final int b;
    public final ts5 c;

    /* JADX WARN: Type inference failed for: r1v1, types: [ss5, hs5] */
    static {
        q40 q40Var;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? hs5Var = new hs5(4);
            for (int i = 1; i <= 10; i++) {
                hs5Var.b(Integer.valueOf(a2d.s(i)));
            }
            q40Var = new q40(2, hs5Var.g());
        } else {
            q40Var = new q40(2, 10);
        }
        d = q40Var;
    }

    public q40(int i, Set set) {
        this.a = i;
        ts5 j = ts5.j(set);
        this.c = j;
        jwc it = j.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        if (this.a == q40Var.a && this.b == q40Var.b && Objects.equals(this.c, q40Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.a * 31) + this.b) * 31;
        ts5 ts5Var = this.c;
        if (ts5Var == null) {
            hashCode = 0;
        } else {
            hashCode = ts5Var.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public q40(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
