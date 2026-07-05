package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ch4  reason: default package */
/* loaded from: classes.dex */
public final class ch4 {
    public final CountDownLatch a;
    public f92 b = null;

    public ch4(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ch4) {
                ch4 ch4Var = (ch4) obj;
                if (!this.a.equals(ch4Var.a) || !c16.i(this.b, ch4Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        f92 f92Var = this.b;
        if (f92Var == null) {
            hashCode = 0;
        } else {
            hashCode = f92Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
