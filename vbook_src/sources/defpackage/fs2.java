package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fs2  reason: default package */
/* loaded from: classes.dex */
public final class fs2 {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = Parser.ARGC_LIMIT;
    public int e = 0;
    public nc[] f = new nc[100];

    public final synchronized nc a() {
        nc ncVar;
        try {
            int i = this.d + 1;
            this.d = i;
            int i2 = this.e;
            if (i2 > 0) {
                nc[] ncVarArr = this.f;
                int i3 = i2 - 1;
                this.e = i3;
                ncVar = ncVarArr[i3];
                ncVar.getClass();
                this.f[this.e] = null;
            } else {
                nc ncVar2 = new nc(new byte[this.b], 0);
                nc[] ncVarArr2 = this.f;
                if (i > ncVarArr2.length) {
                    this.f = (nc[]) Arrays.copyOf(ncVarArr2, ncVarArr2.length * 2);
                }
                ncVar = ncVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ncVar;
    }

    public final synchronized void b(ju0 ju0Var) {
        while (ju0Var != null) {
            nc[] ncVarArr = this.f;
            int i = this.e;
            this.e = i + 1;
            nc ncVar = (nc) ju0Var.c;
            ncVar.getClass();
            ncVarArr[i] = ncVar;
            this.d--;
            ju0Var = (ju0) ju0Var.d;
            if (ju0Var == null || ((nc) ju0Var.c) == null) {
                ju0Var = null;
            }
        }
    }

    public final synchronized void c(int i) {
        boolean z;
        if (i < this.c) {
            z = true;
        } else {
            z = false;
        }
        this.c = i;
        if (z) {
            d();
        }
    }

    public final synchronized void d() {
        int max = Math.max(0, a2d.g(this.c, this.b) - this.d);
        int i = this.e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f, max, i, (Object) null);
        this.e = max;
    }
}
