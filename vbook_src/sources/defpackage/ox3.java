package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ox3  reason: default package */
/* loaded from: classes3.dex */
public abstract class ox3 implements Runnable, Comparable, kb3 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public ox3(long j) {
        this.a = j;
    }

    @Override // defpackage.kb3
    public final void a() {
        px3 px3Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                lie lieVar = rx3.a;
                if (obj == lieVar) {
                    return;
                }
                f7c f7cVar = null;
                if (obj instanceof px3) {
                    px3Var = (px3) obj;
                } else {
                    px3Var = null;
                }
                if (px3Var != null) {
                    synchronized (px3Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof f7c) {
                            f7cVar = (f7c) obj2;
                        }
                        if (f7cVar != null) {
                            px3Var.b(this.b);
                        }
                    }
                }
                this._heap = lieVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, px3 px3Var, qx3 qx3Var) {
        ox3 ox3Var;
        boolean z;
        synchronized (this) {
            if (this._heap == rx3.a) {
                return 2;
            }
            synchronized (px3Var) {
                ox3[] ox3VarArr = px3Var.a;
                if (ox3VarArr != null) {
                    ox3Var = ox3VarArr[0];
                } else {
                    ox3Var = null;
                }
                if (qx3.E.get(qx3Var) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 1;
                }
                if (ox3Var == null) {
                    px3Var.c = j;
                } else {
                    long j2 = ox3Var.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - px3Var.c > 0) {
                        px3Var.c = j;
                    }
                }
                long j3 = this.a;
                long j4 = px3Var.c;
                if (j3 - j4 < 0) {
                    this.a = j4;
                }
                px3Var.a(this);
                return 0;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = ((this.a - ((ox3) obj).a) > 0L ? 1 : ((this.a - ((ox3) obj).a) == 0L ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(px3 px3Var) {
        if (this._heap != rx3.a) {
            this._heap = px3Var;
        } else {
            vs.m("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
