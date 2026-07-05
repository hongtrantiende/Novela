package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bde  reason: default package */
/* loaded from: classes.dex */
public final class bde {
    public final odd a;
    public odd b;
    public final yx9 c;
    public final hvc d;

    public bde() {
        odd oddVar = new odd(12);
        this.a = oddVar;
        this.b = ((odd) oddVar.c).v();
        this.c = new yx9(19, (byte) 0);
        this.d = new hvc(27);
        Callable callable = new Callable(this) { // from class: ywd
            public final /* synthetic */ bde b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i = r2;
                bde bdeVar = this.b;
                switch (i) {
                    case 0:
                        return new mxe(bdeVar.c);
                    default:
                        return new mxe(bdeVar.d);
                }
            }
        };
        tk1 tk1Var = (tk1) oddVar.e;
        tk1Var.a.put("internal.registerCallback", callable);
        tk1Var.a.put("internal.eventLogger", new Callable(this) { // from class: ywd
            public final /* synthetic */ bde b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i = r2;
                bde bdeVar = this.b;
                switch (i) {
                    case 0:
                        return new mxe(bdeVar.c);
                    default:
                        return new mxe(bdeVar.d);
                }
            }
        });
    }

    public final boolean a(hxd hxdVar) {
        yx9 yx9Var = this.c;
        try {
            yx9Var.b = hxdVar;
            yx9Var.c = hxdVar.clone();
            ((ArrayList) yx9Var.d).clear();
            ((odd) this.a.d).z("runtime.counter", new g4e(Double.valueOf(0.0d)));
            this.d.M(this.b.v(), yx9Var);
            if (((hxd) yx9Var.c).equals((hxd) yx9Var.b)) {
                if (((ArrayList) yx9Var.d).isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final void b(jve jveVar) {
        l5e l5eVar;
        try {
            odd oddVar = this.a;
            this.b = ((odd) oddVar.c).v();
            if (!(oddVar.d(this.b, (ove[]) jveVar.t().toArray(new ove[0])) instanceof v2e)) {
                for (cve cveVar : jveVar.u().t()) {
                    List<ove> u = cveVar.u();
                    String t = cveVar.t();
                    for (ove oveVar : u) {
                        e9e d = oddVar.d(this.b, oveVar);
                        if (d instanceof q7e) {
                            odd oddVar2 = this.b;
                            if (!oddVar2.y(t)) {
                                l5eVar = null;
                            } else {
                                e9e B = oddVar2.B(t);
                                if (B instanceof l5e) {
                                    l5eVar = (l5e) B;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(t)));
                                }
                            }
                            if (l5eVar != null) {
                                l5eVar.g(this.b, Collections.singletonList(d));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(t)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
