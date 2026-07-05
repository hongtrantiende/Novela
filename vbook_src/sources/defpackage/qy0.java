package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qy0  reason: default package */
/* loaded from: classes3.dex */
public final class qy0 implements zed {
    public Object a = zy0.p;
    public f61 b;
    public final /* synthetic */ xy0 c;

    public qy0(xy0 xy0Var) {
        this.c = xy0Var;
    }

    public final Object a(n42 n42Var) {
        kb1 kb1Var;
        Boolean bool;
        Object obj = this.a;
        boolean z = true;
        if (obj == zy0.p || obj == zy0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xy0.E;
            xy0 xy0Var = this.c;
            kb1 kb1Var2 = (kb1) atomicReferenceFieldUpdater.get(xy0Var);
            while (true) {
                if (xy0Var.F()) {
                    this.a = zy0.l;
                    Throwable w = xy0Var.w();
                    if (w == null) {
                        z = false;
                    } else {
                        int i = oxa.a;
                        throw w;
                    }
                } else {
                    long andIncrement = xy0.e.getAndIncrement(xy0Var);
                    long j = zy0.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (kb1Var2.e != j2) {
                        kb1Var = xy0Var.u(j2, kb1Var2);
                        if (kb1Var == null) {
                            continue;
                        }
                    } else {
                        kb1Var = kb1Var2;
                    }
                    Object T = xy0Var.T(kb1Var, i2, andIncrement, null);
                    lie lieVar = zy0.m;
                    t81 t81Var = null;
                    if (T != lieVar) {
                        lie lieVar2 = zy0.o;
                        if (T == lieVar2) {
                            if (andIncrement < xy0Var.z()) {
                                kb1Var.b();
                            }
                            kb1Var2 = kb1Var;
                        } else if (T == zy0.n) {
                            xy0 xy0Var2 = this.c;
                            f61 j3 = pbe.j(w92.t(n42Var));
                            try {
                                this.b = j3;
                                Object T2 = xy0Var2.T(kb1Var, i2, andIncrement, this);
                                xt4 xt4Var = xy0Var2.b;
                                if (T2 == lieVar) {
                                    b(kb1Var, i2);
                                } else {
                                    if (T2 == lieVar2) {
                                        if (andIncrement < xy0Var2.z()) {
                                            kb1Var.b();
                                        }
                                        kb1 kb1Var3 = (kb1) xy0.E.get(xy0Var2);
                                        while (true) {
                                            if (xy0Var2.F()) {
                                                f61 f61Var = this.b;
                                                f61Var.getClass();
                                                this.b = null;
                                                this.a = zy0.l;
                                                Throwable w2 = xy0Var.w();
                                                if (w2 == null) {
                                                    f61Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    f61Var.resumeWith(new gs9(w2));
                                                }
                                            } else {
                                                long andIncrement2 = xy0.e.getAndIncrement(xy0Var2);
                                                long j4 = zy0.b;
                                                long j5 = andIncrement2 / j4;
                                                int i3 = (int) (andIncrement2 % j4);
                                                if (kb1Var3.e != j5) {
                                                    kb1 u = xy0Var2.u(j5, kb1Var3);
                                                    if (u != null) {
                                                        kb1Var3 = u;
                                                    }
                                                }
                                                Object T3 = xy0Var2.T(kb1Var3, i3, andIncrement2, this);
                                                if (T3 == zy0.m) {
                                                    b(kb1Var3, i3);
                                                    break;
                                                } else if (T3 == zy0.o) {
                                                    if (andIncrement2 < xy0Var2.z()) {
                                                        kb1Var3.b();
                                                    }
                                                } else if (T3 != zy0.n) {
                                                    kb1Var3.b();
                                                    this.a = T3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (xt4Var != null) {
                                                        t81Var = new t81(13, xt4Var, T3);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        kb1Var.b();
                                        this.a = T2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (xt4Var != null) {
                                            t81Var = new t81(13, xt4Var, T2);
                                        }
                                    }
                                    j3.m(bool, t81Var);
                                }
                                return j3.s();
                            } catch (Throwable th) {
                                j3.B();
                                throw th;
                            }
                        } else {
                            kb1Var.b();
                            this.a = T;
                        }
                    } else {
                        vs.k("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zed
    public final void b(f5a f5aVar, int i) {
        f61 f61Var = this.b;
        if (f61Var != null) {
            f61Var.b(f5aVar, i);
        }
    }

    public final Object c() {
        Object obj = this.a;
        lie lieVar = zy0.p;
        if (obj != lieVar) {
            this.a = lieVar;
            if (obj != zy0.l) {
                return obj;
            }
            Throwable x = this.c.x();
            int i = oxa.a;
            throw x;
        }
        vs.k("`hasNext()` has not been invoked");
        return null;
    }
}
