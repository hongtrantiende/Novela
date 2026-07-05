package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cu7  reason: default package */
/* loaded from: classes.dex */
public final class cu7 {
    public final long a;
    public final p6a b;
    public final p6a c;
    public final p6a d;
    public final zu0 e;
    public fvb g;
    public final cu7 f = this;
    public int h = -1;

    public cu7(long j, p6a p6aVar, p6a p6aVar2, p6a p6aVar3, zu0 zu0Var) {
        this.a = j;
        this.b = p6aVar;
        this.c = p6aVar2;
        this.d = p6aVar3;
        this.e = zu0Var;
    }

    public final long a(g6a g6aVar, boolean z) {
        fvb fvbVar;
        int i;
        f6a f6aVar = g6aVar.b;
        f6a f6aVar2 = g6aVar.a;
        long j = this.a;
        if (!z || f6aVar2.c == j) {
            if ((!z && f6aVar.c != j) || c() == null || (fvbVar = (fvb) this.c.invoke()) == null) {
                return 9205357640488583168L;
            }
            if (z) {
                i = f6aVar2.b;
            } else {
                i = f6aVar.b;
            }
            return n4f.p(fvbVar, dce.n(i, 0, b(fvbVar)), z, g6aVar.c);
        }
        return 9205357640488583168L;
    }

    public final int b(fvb fvbVar) {
        int i;
        int i2;
        synchronized (this.f) {
            try {
                if (this.g != fvbVar) {
                    if (fvbVar.d()) {
                        it7 it7Var = fvbVar.b;
                        if (!it7Var.c) {
                            i2 = it7Var.e((int) (fvbVar.c & 4294967295L));
                            int i3 = fvbVar.b.f - 1;
                            if (i2 > i3) {
                                i2 = i3;
                            }
                            while (i2 >= 0 && fvbVar.b.f(i2) >= ((int) (fvbVar.c & 4294967295L))) {
                                i2--;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            this.h = fvbVar.b.c(i2, true);
                            this.g = fvbVar;
                        }
                    }
                    i2 = fvbVar.b.f - 1;
                    this.h = fvbVar.b.c(i2, true);
                    this.g = fvbVar;
                }
                i = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final sc6 c() {
        sc6 sc6Var = (sc6) this.b.invoke();
        if (sc6Var != null && sc6Var.t()) {
            return sc6Var;
        }
        return null;
    }

    public final g6a d() {
        fvb fvbVar = (fvb) this.c.invoke();
        if (fvbVar == null) {
            return null;
        }
        int length = fvbVar.a.a.b.length();
        oq9 a = fvbVar.a(0);
        long j = this.a;
        return new g6a(new f6a(a, 0, j), new f6a(fvbVar.a(Math.max(length - 1, 0)), length, j), false);
    }

    public final ps e() {
        fvb fvbVar = (fvb) this.c.invoke();
        if (fvbVar == null) {
            return new ps("");
        }
        return fvbVar.a.a;
    }
}
