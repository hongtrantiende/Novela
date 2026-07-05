package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zy1  reason: default package */
/* loaded from: classes3.dex */
public final class zy1 extends xy0 {
    public final py0 N;

    public zy1(int i, py0 py0Var, xt4 xt4Var) {
        super(i, xt4Var);
        this.N = py0Var;
        if (py0Var != py0.a) {
            if (i >= 1) {
                return;
            }
            p1a.k(hl5.l("Buffered channel capacity must be at least 1, but ", " was specified", i));
            throw null;
        }
        hfd.h(cm9.a(xy0.class).g(), " instead", "This implementation does not support suspension for senders, use ");
        throw null;
    }

    @Override // defpackage.xy0
    public final boolean H() {
        if (this.N == py0.b) {
            return true;
        }
        return false;
    }

    public final Object W(Object obj, boolean z) {
        zed zedVar;
        xt4 xt4Var;
        gt1 q;
        py0 py0Var = this.N;
        py0 py0Var2 = py0.c;
        pvc pvcVar = pvc.a;
        zed zedVar2 = null;
        if (py0Var == py0Var2) {
            Object j = super.j(obj);
            if ((j instanceof ib1) && !(j instanceof hb1)) {
                if (z && (xt4Var = this.b) != null && (q = que.q(xt4Var, obj, null)) != null) {
                    throw q;
                }
            } else {
                return j;
            }
        } else {
            Object obj2 = obj;
            lie lieVar = zy0.d;
            kb1 kb1Var = (kb1) xy0.D.get(this);
            while (true) {
                long andIncrement = xy0.d.getAndIncrement(this);
                long j2 = 1152921504606846975L & andIncrement;
                boolean E = E(false, andIncrement);
                int i = zy0.b;
                long j3 = i;
                long j4 = j2 / j3;
                zed zedVar3 = zedVar2;
                int i2 = (int) (j2 % j3);
                if (kb1Var.e != j4) {
                    kb1 v = v(j4, kb1Var);
                    if (v == null) {
                        if (E) {
                            return new hb1(y());
                        }
                        zedVar2 = zedVar3;
                    } else {
                        kb1Var = v;
                    }
                }
                int g = xy0.g(this, kb1Var, i2, obj2, j2, lieVar, E);
                if (g != 0) {
                    if (g == 1) {
                        break;
                    } else if (g != 2) {
                        if (g != 3) {
                            if (g != 4) {
                                if (g == 5) {
                                    kb1Var.b();
                                }
                                obj2 = obj;
                                zedVar2 = zedVar3;
                            } else {
                                if (j2 < xy0.e.get(this)) {
                                    kb1Var.b();
                                }
                                return new hb1(y());
                            }
                        } else {
                            vs.k("unexpected");
                            return zedVar3;
                        }
                    } else if (E) {
                        kb1Var.n();
                        return new hb1(y());
                    } else {
                        if (lieVar instanceof zed) {
                            zedVar = (zed) lieVar;
                        } else {
                            zedVar = zedVar3;
                        }
                        if (zedVar != null) {
                            zedVar.b(kb1Var, i2 + i);
                        }
                        r((kb1Var.e * j3) + i2);
                    }
                } else {
                    kb1Var.b();
                    return pvcVar;
                }
            }
        }
        return pvcVar;
    }

    @Override // defpackage.xy0, defpackage.u8a
    public final Object e(m42 m42Var, Object obj) {
        gt1 q;
        if (W(obj, true) instanceof hb1) {
            xt4 xt4Var = this.b;
            if (xt4Var != null && (q = que.q(xt4Var, obj, null)) != null) {
                pye.e(q, y());
                throw q;
            }
            throw y();
        }
        return pvc.a;
    }

    @Override // defpackage.xy0, defpackage.u8a
    public final Object j(Object obj) {
        return W(obj, false);
    }
}
